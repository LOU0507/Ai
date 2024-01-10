use sqldb;

drop table if exists testtbl4;
select*from buytbl;
-- 요구사랑 ; 상품명 , 가격 테이블만들기
-- 1단계 테이블 만들기
create table if not exists testtbl4
  (prodName varchar(40) not null,
   price int not null);
-- 2단계 삽입한다.
select prodName, price from buytbl;
insert into testtbl4
    select distinct prodName, price from buytbl;

select * from testtbl4 order by price desc;
-- 청바지 가격을 100으로 바꾸기
update testtbl4 set price = 100 where prodName = '청바지';
-- 가장 높은 가격인 것을 찾아서 10%인하하기
-- 1단계 가장 높은 가겨 것 찾기
select * from testtbl4 order by price desc limit 0,1;
-- 2단계 10프로 인하하기 
update testtbl4 set price = price*0.9 where price = (select price from (select price from testtbl4 order by price desc limit 1) as t );

-- with문 사용하기 229쪽 교재
-- 뷰, 파생테이블, 임시테이블, 가상테이블 : 잠깐쓰고버리기 (메모리에서 삭제)
use sqldb;
select*from usertbl;
select*from buytbl;

-- 요구사항 이름 총구매액(price*amount)
select userid, sum(price), sum(amount) as '총구매액'  from buytbl group by userId;
-- 이름을 출력하세요
select name from usertbl;
select userid, sum(price*amount) as '총구매액' from buytbl,usertbl group by buytbl.userID = usertbl.userID;

select * from usertbl,buytbl;
select * from usertbl,buytbl where buytbl.userID = usertbl.userID;
select usertbl.userID, usertbl.name, usertbl.amount, buytbl.price
    from usertbl, buytbl
    where usertbl.userID = buytbl.userID;

-- select usertbl.name, usertbl.amount*buytbl.price
--    from usertbl, buytbl
--    where usertbl.userID = buytbl.userID 
--    group by buytbl.userID;

 select u.userid, u.name, b.amount*b.price
    from usertbl u, buytbl b
    where u.userID = b.userID 
    group by buytbl.userID;

with t (tid,total)
as
( select u.userid, u.name, b.amount*b.price
    from usertbl u, buytbl b
    where u.userID = b.userID
)
select name, total from t;
-- 회원테이블에서 각 지역별로 가장 큰 키를 1명씩 뽑은 후 그 사람들의 키의 평균을 내보자
-- 1단계 각 지역별 가장 큰 키 1명을 뽀은 후
select addr, max(height) from usertbl group by addr;
-- 2단계 가상테이블만들기
with t ( avgHeight )
as
(
select max ( height ) from usertbl group by addr
)
select avg(avgHeight) from t; 

-- 요구사항 각 groupName의 price가 최저를 구해서 그것의 평균을 구하기
-- 1
select groupName, min(price) from buytbl group by groupName;
-- 2 
with t ( minPrice) 
as 
(
select min(price) from buytbl group by groupName
)
select avg(minPrice) from t;

select tid,toal from t;
select usertbl.name,buytbl.price from usertbl,buytbl;

select cast('2020-10-19 12:35:29:123' as date);
select cast('2020-10-19 12:35:29:123' as time);
select cast('2020-10-19 12:35:29:123' as datetime);

set @var1 =10;
set @var2 = '홍길동';
select @var2, @vae1;

select * from buytbl;
select avg(amount) from buytbl;
-- 실수 정수로
select cast(avg(amount) as signed Integer ) from buytbl;

-- 정수 실수로
set @var3 =3;
select cast(@var3 as Float);
select convert(@var3, Float);
-- 정수 문자
select cast(@var3 as character);
select convert(@var3, char);

-- 246
select '100'+'200';
select concat('100','200');
select concat(100,'200');
select 1>'2mega';
select 3>'2mega';
select 0 = 'mega0';

-- if 함수
-- select if ( 조건, 참, 거짓)

set @v1 = 200;
set @v2 = 20;
set @v3 = 100;

select if ( @v1>@v2 , if (@v1>@v3, @v1,@v3),if (@v2>@v3,@v2,@v3));
-- 가장 작은 수 구하기
select if ( @v1>@v2, if(@v1>@v3, @v1,@v3),if (@v2>@v3,@v2,@v3));
-- 중간 수 구하기
 select if (@v1<@v2, if(@v1>@v3,@v1,@v3), if(@v2<@v3,@v2,@v3));
 
-- ifnull(수식1,수식2)
select ifnull(null,100);
select ifnull(200,null);
select ifnull(200,300);
select ifnull(null, ifnull(null,300));

-- nullif(수식1,수식2)
select nullif(100,100);
select nullif(200,100);

-- case when else end
set @v1 = 1;
select case @v1
  when 1 then '일'
  when 2 then '이'
  when 3 then '삼'
  else '1,2,3이 아님'
end as 'case 연습';

select*from buytbl;
select case userId
       when 'KBS' then '김범수'
       when 'JYP' then '조용필'
       else '모름'
	end as '이름', userID
    fro,m buytbl;

select concat_ws(',','100','200');
select elt(1,'하나','둘','셋');
select field('김','이','박','최','김');
select find_in_set('이,박,최,김,송','김');
select locate('김','이,박,최,김,송');

select format(123456.123456,4);

select hex(10), oct(8), bin(15);
select insert('abcdefghi',3,4,'0000');
select trim('   abc ');
select substring('대한민국만세',3,2);

select substring_index('cafe.naver.com','.',-2);

-- 숫자 함수
select ceiling(4.1), floor(4.7), round(4.7);
select pow(2,10);

-- 기억공간단위
-- bit< 8bit==1byte<1024byte=1kb<1024kb=1megaByte<1024mb=1gb
-- 1024gb = 1tb (terabyte) < 1024tb = 1hb(herabyte)

select rand(), floor(1+(rand()*(7-1)));

-- 1,235,456,577 천원이하 절삭
select truncate(1235456577,-3);

-- 날짜, 시간 함수
select mdate, adddate( mdate, interval 31 day)
from usertbl;

select*from usertbl;

-- 261 대용량 파일
create database moviedb;
use moviedb;

create table movietbl
  (movie_id int,
  movie_title varchar(30),
  movie_director varchar(20),
  movie_start varchar(20),
  movie_script longtext,
  movie_film longblob
) default charset=utf8mb4;

insert into movietbl values (1, '쉰들러 리스트', '스필버그','리암니슨', 
				   load_file('D:/a2024/db_study/sourceCode/Movies/Schindler.txt'),
                   load_file('D:/a2024/db_study/sourceCode/Movies/Schindler.mp4') );
 
 
 select*from movietbl;
 show variables like 'max_allowed_packet';
 show variables like 'secure_file_priv';

 select*from movietbl;
drop table movietbl; 
create table movietbl
  (movie_id int,
  movie_title varchar(30),
  movie_director varchar(20),
  movie_start varchar(20),
  movie_script longtext,
  movie_film longblob
) default charset=utf8mb4;

 
select * from buytbl;
create table if not exists copybuy
  select * from buytbl;
select * from copybuy;


-- copybuy amount가 제일 작은 것 찾아서 삭제하기
-- 1단계 amonut가 제일 작은 것 찾기
select amount from copybuy order by amount asc limit 1;
-- 2단계 삭제하기
delete from copybuy
where
amount = ( select amount from ( select amount from copybuy order by amount asc limit 1) as t); 

select * from copybuy;

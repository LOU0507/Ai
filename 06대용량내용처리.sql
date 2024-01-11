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
select nullif(100,100); -- true
select nullif(200,100); -- false

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




-- 261 대용량 파일
-- 1 단계 데이터베이스 만들기
create database moviedb;
-- 2단계 데이터베이스를 사용한다
use moviedb;
-- 3단계 테이블 만들기
create table movietbl
  (movie_id int,
  movie_title varchar(30),
  movie_director varchar(20),
  movie_start varchar(20),
  movie_script longtext,
  movie_film longblob
) ;

insert into movietbl values (1, '쉰들러 리스트', '스필버그','리암니슨', 
				   load_file('D:/ai 윤혜정/study/temp/movies/Schindler.txt'),
                   load_file('D:/ai 윤혜정/study/temp/movies/Schindler.txt') );
 
 -- 5단계 select문으로 검색한다.
 select*from movietbl;
 --  longtext,longblob가 null이 나오는 이유
 -- 1. 용량이 부족해서
 show variables like 'max_allowed_packet';
 -- 2. 경로가 틀려서
 show variables like 'secure_file_priv';
-- 환경설정

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

insert into movietbl values (1, '쉰들러 리스트', '스필버그','리암니슨', 
				   load_file('D:/ai 윤혜정/study/temp/movies/Schindler.txt'),
                   load_file('D:/ai 윤혜정/study/temp/movies/Schindler.mp4') );

select * from movietbl ;
-- 내려받기 데이터베이스 ----> 개인 컴퓨터로 다운로드
-- 1단계 내릴 것을 확인하기 
select movie_script from movietbl where movie_id = 1;
-- 내리기
select movie_script from movietbl where movie_id = 1
 into outfile 'D:/ai 윤혜정/study/temp/movies/movie_script_copy.txt'
 lines terminated by '\\n';
 
-- 동영상 파일 내리기
-- 1단계 내릴 것을 확인학
select movie_film from movietbl where movie_id =1 ;
-- 2단계 내리기
select  movie_film from movietbl where movie_id =1
   into outfile 'D:/ai 윤혜정/study/temp/movies/Schindler.mp4';
 
 -- 피벗구현하기
 use spldb;
select*from usertbl;
select*from buytbl;

create table pivotTest
(
   uName char(3),
   season char(2),
   amount int
);
insert into pivotTest values
('윤종신','봄','15'),('김범수','여름','10'),('윤종신','가을','20'),('김범수','겨울','30'),
('윤종신','가을','25'),('김범수','여름','5'),('성시경','봄','35'),('윤종신','봄','10');
select*from pivotTest;
-- 피벗 : 함수 사용해서 보기 편허게 만들기
select uName '이름', sum( if ( season='봄',amount,0)) '봄',
                  sum( if ( season='여름',amount,0) ) '여름',
                  sum( if ( season='가을',amount,0)) '가을',
                  sum( if ( season='겨울',amount,0)) '겨울',
                  sum (amount) '합계'
from pivotTest group by season;

select json_array (1,'abc',null,true,curtime());
select json_object ( 'score', 87, 'name', 'hong', 'age', 25);
select @jsonData =json_object ( 'score', 87, 'name', 'hong', 'age', 25);
select @jsonData;
select*from usertbl;

-- 키 userid, addr 값 json을 만들기
select
   json_object(userid, addr)
from usertbl;
-- 2단계
select json_object(userid, json_array(mobile1,mobile2))
   from usertbl;
-- 외부로 내보내기 json 파일로 만들기
select 
      json_object(userid, json_array(mobile1,mobile2))
from usertbl into outfile 'D:/ai 윤혜정/study/temp/movies/jsonOutPut.json';

select json_valid(@jsonData);

select 
  if (json_valid(@jsonData)=1,
    'json 자료다',
    'json 자료가 아니다');

-- json 자료안에 값을 검색하기
set @j = "['abc',[{'k':'10'},'def'],[{'x1':'abc1'},{'x2':'abc2'},{'x5':'abc5'}],{'y1':'bcd'}]";
select 
   json_search (@j,'all','abc5'); -- 못찾으면 null 반환된다. 찾으면 리스트 위치를 알려준다.

-- json_extract

-- json_insert
Set @j = '{"a":1,"b":[2,3]}';
select json_insert(@j,'$.c',10); -- 키가 새것이면 삽입된다
select json_insert(@j,'$.a',10); -- 키가 이미 있으면 삽인 되지 않느다.   
select json_insert(@j,'$.b','[2,3,4]');

-- json_replace
set @j = "{'a':1,'b':[2,3]}'";
select json_replace(@j,'$.a',10); -- 키가 있으면 수정
select json_replace(@j,'$.c',10); -- 키가 없으면 아무것도 안하기

-- -------------join
select*from usertbl;
select*from buytbl;

select*from usertbl -- 먼저 적힐 것
 inner join buytbl -- 나중에 적힐 것
  on usertbl.userID = buytbl.userID -- 두 테이블의 중복사항
where birthYear between 1970 and 1980 order by usertbl.name limit 3;

-- 5 select*from usertbl -- 먼저 적힐 것
-- 1  inner join buytbl -- 나중에 적힐 것
-- 2  on usertbl.userID = buytbl.userID -- 두 테이블의 중복사항
-- 3  where birthYear 
-- 4  between 1970 and 1980 
-- 6  order by usertbl.name 
-- 7  limit 3;

-- 282
use spldb;
create table stdTbl
( stdName varchar(10) not Null primary key,
  addr     char(4) not null);
create table clubTbl
( clubName varchar(10) not Null primary key,
  roomNo     char(4) not null);
create table stdclubTbl
( num int auto_increment Not null primary key,
  stdName  varchar(10) not null,
  clubName varchar(10) not null,
  foreign key(stdName) references stdtbl(stdName),
  foreign key(clubName) references stdtbl(clubName));
  
insert into stdTbl values ('김범수','경남'),('성시경','서울'),('조용필','경기'),
                          ('은지원','경북'),('바비킴','서울');
insert into clubTbl values ('수영','101호'),('바둑','102호'),
                          ('축구','103호'),('봉사','104호');
insert into stdclubTbl values (null,'김범수','바둑'),(null,'김범수','축구'),(null,'조용필','축구'),
                          (null,'은지원','축구'),(null,'은지원','봉사'),(null,'바비킴','봉사');
					
                    
-- 1. 요구사항 학생테이블, 동아리테이블, 학생동아리 테이블을 이용하여 
-- 학생을 기준으로 학생이름, 지역, 가입한 동아리, 동아리방 보기
select s.stdName, s.adrr, c.clubNaME, c.roomNo
from stdTbl s
 inner join stdclubtbl sc
 on s.stdName = sc.stdName
 inner join clubtbl sc
 on sc.clubName = sc.clubName;
 
-- 2. 요구사항 학생테이블, 동아리테이블, 학생동아리 테이블을 이용하여 
-- 축구를 선택하신 분의 이름과 지역은?
select s.stdName, s.adrr, c.clubNaME, c.roomNo
from stdTbl s
 inner join stdclubtbl sc
 on s.stdName = sc.stdName
 inner join clubtbl sc
 on sc.clubName = sc.clubName
where sc.clubName='축구';

-- 3. 요구사항 학생테이블, 동아리테이블, 학생동아리 테이블을 이용하여 
-- 은지원이 선택한 동아리와 동아리방은?

-- 4. 요구사항 학생테이블, 동아리테이블, 학생동아리 테이블을 이용하여 
-- 서울 지역에 사는 사람이 선택한 동아리명은?
select  
   *
from stdtbl s
   left outer join stdclubtbl sc 
   on s.stdName = sc.stdName 
   left outer join clubtbl c 
   on sc.clubName = c.clubName 

union   

select  
   *
from stdtbl s
   left outer join stdclubtbl sc 
   on s.stdName = sc.stdName 
   right outer join clubtbl c 
   on sc.clubName = c.clubName;
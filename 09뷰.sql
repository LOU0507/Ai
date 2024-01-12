-- veiw

use sqldb;
select*from usertbl;

create view vuser
as
select*from usertbl;

select*from vuser;

use sqldb;

create view v1
as
select u.userid as 'user id', n.name ' user name',b.prodName as ' product name '
   from usertbl u
   inner join buytbl b
   on u.userid = b.userid;
   
select * from v1;

select 'user id','user name','product name' from v1
   where 'user id'='KBS' order by 'product name'; -- ' 백틱 ~키와 같이 있는 것

-- veiw
alter view v1
as
  select
    u.name as 'name', u.addr 'addr', concat_ws('-',b.mobile1,b.mobile2) 'te1'
  from usertbl u
    inner join buytbl b
    on u.userid = b.userid;
    
select * from v1;
select 'name','te1' from v1 ; -- name,te1
create or replace view v1
as
select name,birthyear from usertbl where name = '김범수';

select * from v1;

-- 뷰 삽입 테이블이 삽입이 될까?
-- usertbl을 복사하기
create table cUsertbl
as
select * from usertbl;

-- 뷰만들기
create or replace view v2
as
select userid, name, birthYear, addr, height from cUsertbl;

select*from v2;
insert into v2 values ('HGC','홍길동', 2020, '서울',175);
select*from cUsertbl; -- 테이블 삽입하기
-- 테이블 안에 삽입하기 뷰에 볼 일까?
insert into cUsertbl ( userid,name,birthYear, addr)
   values ('ADM','관리자',2021,'인천');
   
desc v2;

-- 뷰 수정 테이블이 수정이 될까?
select * from v2;
select * from cUsertbl;
-- 홍길동 birthYear 2019 수정하기
update v2 set birthyear = 2019 where name = '홍길동';

-- 뷰 삭제 테이블이 삭제가 될까?

-- 관리자 지우기
delete from v2 where name='관리자';
-- view 삭제하기
drop view v2;

-- 테이블 스페이스 : 물리적 공간
-- DBA 데이처 베이스 관리자 - 서버게정, 공간할당

-- 인덱스
-- 자료를 찾을 때 색인표 붙여 두는 것
-- 목적 : 빠르게 검색하려고
--  B-tree

-- 장점 : 검색 속도가 빠르다 ( 항상 그런것은 안디ㅏ) 시스템의 성능이 향상된다
-- 단점 : 추가적인 공간이 필요해 진다. 대략 데이터 베이스 전체 용량의 10%가 필요하다
-- 처음 인덱스를 생성하는데 있어

-- 인덱스를 생성해야하는 경우
-- 인덱스는 열단위레 생성한다.
-- where 절에서 사용되는 열에 인덱스를 만들어야한다.
-- 자주 사용하는 열에 생성한다.
-- 조인을 자주하난 열에 생성한디.

-- primary key,unique 지정한 열은 자동으로 인덱스 처리됨

-- 스토어드 프로그램
-- 고급 SQL문 상위레벨

-- 종류 : 1. 스토어드 프로시저 ,2. 스토어드 함수, 3.커서, 4. 트리거

/* 1. 스오터드 프로시저
delimiter $$
 create procedure 이름 ( 입력 또는 출력 피라미터(매개변수))
 Begin 
 내용
 end $$ 
delimiter ;
call 이름 (실제값을)
*/

drop procedure if exists p1;
-- 바비킴 레코드 검색하기
delimiter $$
create procedure p2 ( in userName varchar(10))
  begin
    select * from usertbl where name = userName;
    end $$
delimiter ;

call p2 ( '바비킴') ;
drop procedure if exists p2;    
-- 생일 1973년 이후 그리고 키가 170 큰 사람
delimiter $$
create procedure p3 ( in birth int,in h int)
  begin
    select * from usertbl where birthyear >= birth and height >= h;
    end $$
delimiter ;

call p3 (1973,170) ;
drop procedure if exists p3;

delimiter $$
create procedure p4 ( in inVar char(10),out outVar int)
  begin
    insert into testTbl values (null, inVar);
    select max(id) into outVar from testTbl;
    end $$
delimiter ;

drop procedure if exists p4;

call p4 ('이순신',@countVar) ;
select @countVar;
select*from testTbl;

-- 445쪽
drop procedure if exists ifelseProc;
delimiter $$
create procedure ifelseProc ( in userName varchar(10))
  begin
    declare bYear int;
    select birthYear into bYear from userTbl
      where name = userName;
      if (byear>=1980) then
         select '아직 젊군요..';
	  else
          select '나이가 지긋하시네요';
	  end if;
    end $$
delimiter ;

call ifelseProc('조용필');
select @nameOut;

drop procedure ifelseProc;

delimiter $$
create procedure ifelseProc(  in userName varchar(10), out byear int  ) 
begin
 
  select birthYear into byear from userTbl where name = username ;
  if ( byear >= 1980 ) then 
     select '아직 젊군요 .. ' ;
  else 
     select concat(byear, '나이가 지긋하시네요 ') ;
  end if; 
end $$
delimiter ;

call ifelseProc( '조용필', @yearOut) ;
select @yearOut ; 

use spldb;
select*from usertbl;
-- userId 'BBK' "JKM'
select*from usertbl where userid in ('BBK','JKM');
-- 김씨 성을 가진 사람만 보기
select*from usertbl where name like '김%';
-- 김경호씨의 키보다 큰 사람은?
-- 1단계 김경호씨의 키?177
select height from usertbl where name = '김경호';
-- 2단계 조건 찾기
select*from usertbl where height >= 177;
-- 1,2단계 동시에 입력하기
select*from usertbl where height >= (select height from usertbl where name = '김경호');
-- 은지원씨보다 나이가 어린 사람은 누구입니까?
select*from usertbl where birthYear > ( select birthYear from usertbl where name = '은지원');

select*from buytbl;
select userID, prodName, groupName from buytbl where groupName = (select groupName from byutbl where prodName = '노트북' );

select userID from usertbl where name = '김범수' ;
select prodName from buytbl where userID = (select userID from usertbl where name = '김범수');
select*from usertbl where addr = '서울'; 
select*from usertbl where height <= any(select height from usertbl where addr = '서울'); 
-- all, any=some
select*from buytbl;
select name from usertbl where userID = any(select userID from buytbl where prodName = '운동화');
-- dese limit // 상위 , asc limit // 하위
select*from usertbl order by height desc limit 3;
select*from usertbl order by birthyear asc limit 5;
-- 테이블만들기 usertbl 동일한 테이블 만들고 싶다
create table usertbl2 (select*from usertbl);
select*from usertbl2;
-- 테이블만들기 서울에 있는 사람만 만들고 싶다
create table usertblSeoul (select*from usertbl where addr = '서울');
select*from usertblSeoul;
-- 키가 175~180 사이인 사람만 userid, name, height 열만 테이블 만들기
create table heightTbl (select userid, name, height from usertbl where height between 175 and 180);
select*from heightTbl;
-- 단 제약조건(pk,fk)은 만들어지지 않는다

-- group by절
select userID, sum(amount), avg(amount), max(amount), count(amount), std(amount), var_samp(amount) from buytbl group by userID;
-- 총구매액이 1000원 이상인 사람의 사용자명과 총구매액 구하기
select userId, sum(price) from buytbl group by userid having sum(price) >= 300;
-- 경품 대상인 사람을 테이블 만들기 userid,mobile1,mobile2,addr
create table eventTbl
(select userid, mobile1, mobile2, addr from usertbl
where userid = any
(select userId from buytbl group by userid having sum(price) >= 300 ) );

select*from eventTbl;
select*from buytbl;
-- 1단계
select groupName, max(pric) from buytbl group by groupName having max (price) >= (select max(price) from buytbl);
-- 2단계
create table if not exists maxGroupTbl 
   ( select groupName, prodName, amount, price from buytbl 
    where groupName = ( select  groupName 
                     from buytbl group by groupName
                             having max(price) >= ( select max(price) from buytbl)
                       )
    );
select *from maxGroupTbl;

-- rollup
-- 소합계
select num,groupName, sum(price) from buytbl group by groupName, num with rollup;

-- page 220
-- 요구사항 게시판에서 게시글번호 경우에 자동 번호가 넘버링 좋겠다
-- 학번 부여 자동부여 되게 하고 싶다
-- auto_increment 사용하려면 조건 int형이고 
create table if not exists testTbl2
(id int auto_increment primary key,  
                  userName char(3), 
                  age int);
insert into testTbl2 values (null,'지민',25);
insert into testTbl2 (userName,age) values ('유나',22);
insert into testTbl2 (userName,age) values ('유경',23);
select*from testTbl2;

alter table teatTbl2 auto_increment = 100;
insert into testTbl2 values (null,'지수',25);

select*from testTbl2;

create table if not exists testTbl2
(id int auto_increment primary key,  
                  userName char(3), 
                  age int);

drop table teatTbl2;

alter table teatTbl2 auto_increment = 241010;
insert into testTbl2 values (null,'유경2',22);

select*from testTbl2;

-- 학번 240101 시작하기
set @@auto_increment_increment=3;
insert into testTbl2 (userName,age) values ('유경5',21);
insert into testTbl2 (userName,age) values ('유경6',21);
select*from testTbl2;

create table testTbl4 ( id int,fname varchar(50), lname varchar(50));
use employees;
select*from employees;
insert into employees values ( 1007, '05/01/01','정','현희','F','20/10/05');
insert into employees values ( 1004, '05/01/01','박','현희','M','20/10/05');
insert into employees values ( 1005, '05/01/01','이','현희','F','20/10/05');
insert into employees values ( 1006, '05/01/01','김','현희','M','20/10/05');
select*from employees;

use sqldb;

create table testTbl4 ( id int, fname varchar(50), lname varchar(50) );
select emp_no,first_name, last_name from employees.employees;
insert into testTbl4 
     select emp_no,first_name, last_name from employees.employees;

select*from testTbl4;

select*from buyTbl order by price desc;

create table copyBuyTbl
   (select*from buyTbl);

select*from copyBuyTbl order by price desc limit 3;
delete from copyBuyTbl order by price desc limit 3;
select*from copyBuyTbl;

select*from copyBuyTbl order by amount asc;
delete from copyBuyTbl order by amount asc limit 2;
select*from copyBuyTbl;

select*from copyBuyTbl where prodName = '운동화';

update copyTbl set price = 60 where num =1;
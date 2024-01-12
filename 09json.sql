use sqldb;
select * from usertbl;
select * from buytbl;

select userID, name  from usertbl
union all -- 중복된 것 전부 합치기
select userID,prodName from  buytbl;

select userID, name  from usertbl
union -- 중복된 것 지우기
select userID,prodName from  buytbl;
-- 요구사항 이름 전화번호로 주소록을 만들기 단 전화번호 없는 사람은 제외
select name from usertbl where mobile1 is null;
-- 방법1)
select name, mobile1, mobile2 from usertbl
   where mobile1 is not null;
-- 방법2)
select name, mobile1, mobile2 from usertbl
   where name not in
   (select name from usertbl where mobile1 is null);
   
-- SQL구문을 프로그래맹처럼 만들 수 있다.
drop procedure if exists ifProc;
-- 스트어드 프로스저
delimiter $$
create procedure ifProc()
begin
  declare var1 int;
  set var1 = 100;
  if var1 = 100 then
    select '100입니다.';
  else
    select '아닙니다';
  end if;
end $$
delimiter ;

call ifProc();

drop procedure if exists ifProc2;
use employees;
delimiter $$
create procedure ifProc2()
begin
  declare hiredate date; -- 변수선언
  declare curdate date;
  declare days int;
  
  select hire_date into hiredate from employees.employees
  where emp_no = 1001;
  
  set curDate = current_date();
  set days = datediff(curDate, hiredate);
  
  if (days/365) >= 5 then
     select concat('입사한지', days, '일이나 지낫습니다. 축하합니다.');
  else
     select concat('입사한지', days, '일 빡에 안됐습니다. 열심히 하세요.');
  end if;
  
end $$
delimiter ;
call ifProc2;
call ifProc2; 



drop procedure if exists ifProc3;
delimiter $$
create procedure ifProc2()
begin
  declare point int;
  declare create Char(1);
  set point = 7;
  
  if point >= 90 then
  
end $$
delimiter ;
call ifprod3();
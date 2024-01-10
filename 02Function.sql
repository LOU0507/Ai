select 24*30 as 계산 from dual; -- 오라클에서 연산하기 위해 기본제공하는 것 

select *from dual; --dual은 오라클에서 제공하는 테이블 용도 계산 

select sing(10) from dual;
select round(3.1842,2) from dual;
select trunc (3.1457,-1) from dual;
select trunc (4513.1457,-2) from dual; -- -이면 소수점자리에서 앞으로 2칸 가서 뒷부분 자르기
select trunc (4513.1457,2) from dual;
select mod (25,4) from dual;-- 25%4 나머지

SELECT * FROM student;

SELECT upper(stu_email) FROM student;
SELECT upper(stu_email),lower(stu_email),initcap(stu_email) FROM student;

SELECT length ('oracle'),length('오라클') from dual;
SELECT lengthb ('oracle'),lengthb('오라클') from dual;

-- substr 대상/ 시작 위치/ 추출할 갯수
SELECT substr('Welcome to Oracle',4,3) from dual; -- 첫 위치는 1번부터 시작
SELECT substr('Welcome to Oracle',9,2) from dual; -- to 출력
--문종헌의 이메일 앞부분을 추출하기 결과 moon
SELECT substr(stu_email,1,4) from student where stu_name = '문종헌';
--stu_id가 101~110까지의 사람들으 ㅣ이메일  맨 귓부분 즉 com을 추출하기
SELECT substr(stu_email,-3,3) from student where stu_id between 101 and 110;

--instr 대상 / 찾는 문자 해당하는 대상에서 찾는 문자의 위치를 숫자로 반환
SELECT instr('Welcome to Oracle','e') from dual; -- 제일 앞에 e를 찾아 준다.
--instr 대상 / 찾는 문자 / 시작위치   해당하는 대상에서 찾는 문자의 위치를 숫자로 반환
SELECT instr('Welcome to Oracle','e',3) from dual; --4번째부터 찾기 시작해서 7번째 있다고 알려준다.
--instr 대상 / 찾는 문자 / 시작위치 / 몇번째 발견   해당하는 대상에서 찾는 문자의 위치를 숫자로 반환
SELECT instr('Welcome to Oracle','e',3,2) from dual; -- 시작위치부터 'e'를 찾는데 2번째 발견한 것은 17번쨰이다.

SELECT * from student;
--모든학생의 @위치를 알기
Select instr(stu_email,'@') from student;
-- 모든학생의 ID 알기
SELECT substr(stu_email,1,instr(stu_email,'@')-1) id from student;

-- LPAD left padding
-- RPAD right padding
select lpad('oracle',20,'#')from dual;
select rpad('oracle',20,'#')from dual;

select lpad('oracle',20,'#')from dual;
select rpad('oracle',20,'#')from dual;

select *from emp;
select lpad(job,10,'_') from emp;

-- 3. 형변환함수
-- to_char() to_date() to_number()

-- 현재시간을 구해준다
select sysdate from dual;

select sysdate, to_char( sysdate, 'YYYY-MM-DD Day am hh:mi:ss') from dual;
select * from emp;
select hiredate, to_char(hiredate,'yyyy-mm-dd-dy') from emp;

select to_char(12345678,'000,000,000') from dual; --012,345,678로 표시한다
select to_char(12345678,'000,000') from dual; -- #으로 채운다 에러

select to_char(12345678,'999,999,999') from dual; -- 공백12,345,678
select to_char(12345678,'999,999') from dual; -- #으로 채운다 에러

select to_char(12345678,'L999,999,999') from dual; -- 통화기호 12,345,678

-- to_date() 날짜형으로 바꾸기 ****
-- 오라클에서 기본날짜형은 'mm/dd//yy'
-- to_date('문자','형식') 문자가 형식을 바뀌어서 날짜형이 된다
SELECT * from emp;
-- SELECT*from emo where hiredate = 20070402; 에러발생

select * from emp where hiredate = to_date(20070402,'yyyymmdd');
select * from emp where hiredate = to_date('20070402','yyyymmdd');
-- 오늘날짜 - 특정일(지난날 수 카운팅)
--select sysdate - '2023/05/07'from dual; 에러
select trunc(sysdate - to_date(20230507,'yyyymmdd'),0) from dual;
--(안성기 입사일) - (김사랑씨의 입사일)
SELECT*from emp;
SELECT to_date('20070321','yyyymmdd')- to_date('20070310','yyyymmdd') from dual;
-- to number(',가 있는 숫자', '형식')
select to_number('20,00','99,999')- to_number('10,000','99,999') from dual;

select '20000'-'10000' from dual;

--날짜함수
--어제 오늘 내일
select sysdate -1 어제,sysdate 오늘,sysdate +1 내일 from dual;
select to_char(sysdate -1, 'yyyy-mm-dd day') 어제,sysdate 오늘,sysdate +1 내일 from dual;

--month between
select months_between (sysdate,'2023/12/04') from dual;
select add_months('2023/10/01',10) from dual; --2023/10/01에 10개월을 더한다.
select round(to_date('2020/07/01','yy/mm/dd'),'month') from dual;
select hiredate,trunc(hiredate,'year') from emp;
select ename, sysdate,hiredate from emp;

select*from emp;

-- nvl(comm,0)
select*from emp where hiredate is null;

-- 입사일이 null이면 오늘 날짜 넣어주기
select hiredate,nvl( hiredate,sysdate) from emp where hiredate is null;
select hiredate,nvl( hiredate,sysdate) from emp;

-- 이름이 null이면 무명이라하고 jop이 null이면 '사원' 넣어주기
select empno, nvl(ename,'무명'), nvl(job,'사원') from emp;

--nvㅣ2(식1,식2,식3) 만약에 식1이 null이 아니면 식2을 반환하고 null이면 식3을 반환한다
-- 예) 연봉계산하기, comm이 null 아닌 경우 sal*12*comm,comm이 null인경우 sal*12

select*from emp;
select ename,sal,nvl2(comm,sal*12+comm,sal*12)연봉 from emp;

--coalesce(식1,식2,..,식n)
-- 식1이null이 아니면 식1의 값 출력, 식2가 null이 아니면 식2 출력하고, 모두 다 null이면 식n을 출력하기
-- 예) 사원테이블에서 커미션이 null이 아니면 커미션 출력하고, 커미션이 null이고 급여가 null이 아니면 급여를 출력하고,
-- 만약에 커미션과 급여 모두 null이면 0출력하기

-- 급여가 null 자료 삽입하기
insert into emp values(1019,null,'대리',1003,sysdate,null,null,20);
insert into emp values(1020,null,'대리',1003,sysdate,null,100,20);
select comm,sal,coalesce( comm,sal,0) from emp;

-- 선택을 위한 decode 함수 (switch~case문과 비슷함)
/*decode (표현식,조건1,결과1,
                조건2,결과2,
                조건3,결과3,
                기본결과n
*/
-- 예) deptno가 10이면 '경리부',20이면 '인사부',30이면 '영업부',40이면 '전산부'
select*from emp;

select deptno, decode(deptno, 10,'경리부',
                              20,'인사부',
                              30,'영업부',
                              40,'전산부')
                              from emp;
                        
select *from student;
-- sex가 'M'이면 남자,'F'이면 여자
SELECT sex, decode (sex, 'M','남자',
                         'F','여자')
                         from student;
                         
select count (ename) from emp; -- 20행 입력 1출력
select ename from emp; -- 20행 입력 20행 출력

select sum(sal) from emp;
select sum(sal), count(ename),avg(sal),max(sal),min(sal) from emp;
-- 그룹함수에서 sum, count에서 null연산에서 제외

-- 보너스를 받는 사원의 수
select count(comm) from emp;

-- 직위의 종류의 수?
select count(distinct job) from emp;

select*from emp;
select*from emp order by deptno;
-- 각 부서별로 제일 높은 급여 출력하기
select deptno,max(sal)from emp group by deptno order by deptno;

-- 직급별 급여가 가장 낮은 사람 출력
select job, min(sal) from emp group by job;

-- job별로 급여 평균을 출력하기
-- 사원이거나 대리이거나 과장의 급여 합계를 구하세요
-- 1단계 사원 대리 과장 출력하기
select * from emp where job in('사원','과장','대리');
-- 2단계 그룹으로 지정하기
select job,avg(sal) from emp where job in('사원','과장','대리') group by job;

-- 최대 급여가 700을 초과하는 부서에서 대해서 최대급여와 최소급여를 구하기
-- 결과 20 1000 300
-- 1단계 부서별 최대 값 구하기
select deptno, max(sal) from emp group by deptno;
-- 2단계 최대 급여가 700이 넘는 것은?
select deptno, max(sal) from emp group by deptno having max(sal)>700 ;

-- 직급별로 급여의 평균이 500이상인 직급,급여평균,부서명을 출력하기
-- 직급별로 그룹하기
select job,avg(sal) from emp group by job;
-- 500만원 이상 받는 사람만 뽑기
select job,avg(sal) from emp group by job having max(sal) > 500 ;
-- 평균 오름차순을 정리하기
select job,avg(sal) from emp group by job having max(sal) > 500 order by avg(sal) ASC;

select * from student;

-- 전체 나이중 가장 나이가 많은 사람 / 최소 / 평균
select max(age) 최대, min(age) 최소, avg(age) 평균 from student;
-- 남자의 최대나이, 여자의 최대나이
select sex, max(age) from student group by sex;
--cod_id별로 평균 나이를 구하세요
select cou_id, avg(age) from student group by cou_id;
--평균나이가 25이상인 것만 찾기
select cou_id, age from student group by cou_id having avg(age)>=25;
-- 남자인 경우에 cou_id별로 평균 나이가 25세 이상인 코스와 평균 나이 구하기
select*from student where sex='M';
select avg(age),cou_id from student  where sex='M' group by cou_id;
select avg(age),cou_id from student  where sex='M' group by cou_id having avg(age)>=25 order by avg(age) asc ;

select ename 사원명, sysdate 현재일 ,hiredate 입사일, trunc(months_between(sysdate, hiredate),0) 근무달수 from emp;
-- years betweet은 없는 값이라 months between을 12로 나눠서 계산한다.
select ename 사원명, sysdate 현재일 ,hiredate 입사일, trunc(months_between(sysdate, hiredate)/12,0) 근무년수 from emp;

-- 출력형식 입사일 현재날짜 근속년 근속월 근속일
select hiredate 입사일, sysdate 현재날짜, trunc(months_between(sysdate, hiredate)/12,0) 근무년수,
     trunc(months_between(sysdate,hiredate),0) 근무월수,
     trunc(months_between(sysdate,hiredate),0)*30 근무일수
     from emp;
     
-- 오늘 날짜를 기준으로 최초로 도래하는 수요일의 날짜는?
select to_char(next_day(sysdate,'수'),'yyyy/mm/dd') from dual;

select last_day('24/01/01') from dual;
select*from emp;
select empno 사원번호, last_day(sysdate) 급여일 from emp;

select*from emp;
select comm, nvl(comm,0) from emp;


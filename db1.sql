create table card(
 cardNumber number(10) not null primary key,
 accountNumber number(12) not null,
 cardKind varchar2(8),
 orderDate date,
 limitAmount number(15),
 paymentDate date
 );
 
 INSERT into card VALUES(
   1001,556677,'비자카드',sysdate,5000,'2024/01/27'
 );
  INSERT into card VALUES(
   1002,556677,'비자카드',sysdate,5000,'2024/01/27'
 );
  INSERT into card VALUES(
   1003,556679,'마스터카드',sysdate,10000,'2024/01/20'
 );
  INSERT into card VALUES(
   1004,556680,'cheak',sysdate,null,null
 );
  INSERT into card VALUES(
   1005,556681,'cheak',sysdate,null,null
 );
 
 select *from card;
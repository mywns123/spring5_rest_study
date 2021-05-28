select * from `member`;
alter table member auto_increment=6;

select count(*) from `member`;

desc `member`;

select id, email, password, name, regdate from `member`
where email = 1;

insert into `member`(id,email, password, name, regdate) values(1,"test01@test.co.kr", "1111", "test01", "2021-01-01");
insert into `member`(id,email, password, name, regdate) values(2,"test02@test.co.kr", "1111", "test02", "2021-01-01");
insert into `member`(id,email, password, name, regdate) values(3,"test03@test.co.kr", "1111", "test03", "2021-01-01");
insert into `member`(id,email, password, name, regdate) values(4,"test04@test.co.kr", "1111", "test04", "2021-01-01");
insert into `member`(id,email, password, name, regdate) values(5,"test05@test.co.kr", "1111", "test05", "2021-01-01");

update `member` set password = ?, name = ?, regdate = ? where email = "test@test.co.kr";

delete from `member` where email = ?;

delete from `member` where id >= 1;

select *
from `member` 
where regdate between '2021-05-17 00' and '2021-05-18 00'
order by regdate desc;




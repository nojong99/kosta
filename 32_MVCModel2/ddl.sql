// 관리자용 테이블
create table admin_customer
(admin_id varchar2(20) primary key,
pw varchar2(20) not null,
name varchar2(20) not null
);

insert into admin_customer(admin_id, pw, name)
values ('admin1','1234','관리자');
insert into admin_customer(admin_id, pw, name)
values ('admin2','1234','홍길동');


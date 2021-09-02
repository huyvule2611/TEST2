create database Vu

--drop database Hung

create table thisinh(
	mssv char(10),
	hoten nvarchar(50)
)

create table lophoc(
	malop char(10) not null,
	tenlop nvarchar(50)
)

--drop table lophoc

--tai khoa chinh ngoai bang
alter table lophoc
add constraint PK_Lop
primary key (malop)

--tao khoa chinh trong bang
create table nhanvien(
	id int primary key,
	ho varchar(50) not null,
	ten varchar(50) not null,
)

CREATE TABLE capduoi(
	ho VARCHAR(50) NOT NULL,
	ten VARCHAR(50) NOT NULL,
	luong MONEY
	CONSTRAINT nhanvien_pk PRIMARY KEY (ho, ten)
)

--khoa ngoai
CREATE TABLE sanpham(
	ten_sanpham VARCHAR(50) NOT NULL,
	diadiem VARCHAR(50) NOT NULL,
	phanloai VARCHAR(25)
	CONSTRAINT sanpham_pk PRIMARY KEY (ten_sanpham, diadiem)
)

CREATE TABLE hangtonkho( 
	id_hangtonkho INT PRIMARY KEY,
	ten_sanpham VARCHAR(50) NOT NULL,
	diadiem VARCHAR(50) NOT NULL,
	soluong INT,
	luong_toithieu INT,
	luong_toida INT,
	CONSTRAINT fk_htk_sanpham
	FOREIGN KEY (ten_sanpham, diadiem)
	REFERENCES sanpham (ten_sanpham, diadiem)
)

create table quantrimang(
	id int not null,
	chuyenmuc varchar(50)
)
--add
go
AFTER TABLE quantrimang
ADD luotxem float(10);

--xoa
go
ALTER TABLE quantrimang
DROP COLUMN chuyenmuc

--Đổi cột
AFTER TABLE lophoc
ALTER COLUMN tenlop nvarchar(100);


CREATE TABLE person1(
	id int identity(1,1) primary key,
	firstname varchar(225) not null,
	lastname varchar(225) not null,
	ange int
);

insert into person1 values ('vu', 'le', 25)
insert into person1 values ('kieu', 'oanh', 25)
insert into person1 values ('huy', 'thach', 25)
insert into person1 values ('hung', 'nguyen', 25)
insert into person1 values ('bao', 'lizha', 30)
insert into person1(firstname, lastname) values ('Peter', 'Tran')
insert into person1 values ('vu', 'mei', 22)
insert into person1 values ('vu', 'tu', 14)
insert into person1 values ('vu', 'pham', 45)

delete from person1 where firstname = 'huy'

select * from person1
select firstname, ange from person1
select distinct lastname from person1

select * from person1 where firstname = 'vu'
--select * from person1 where like '%a'
select * from person1 where ange > 26
delete from person1 where ange = 14
delete from person1 where firstname like '%h'

update person1 set firstname = 'hoa' where id = 2
update person1 set firstname = 'Luis' where firstname = 'bao'

select * from person1 where firstname = 'vu' and ange > 10;
select * from person1 where firstname like '%u' or ange > 10;

select * from person1 order by firstname desc, ange asc

select * from person1 where firstname like 'v%'

select min(ange) as min_age, max(ange) as max_age from person1
select min(firstname) as min_first, max(firstname) as max_first from person1 where lastname = 'nguyen'

select count(*) from person1 where ange > 20
select count(*) from person1 where firstname like '%a%'
select AVG(ange) from person1 where ange > 20
select sum(ange) from person1 where ange < 40

--select * from course where total between 50 and 60
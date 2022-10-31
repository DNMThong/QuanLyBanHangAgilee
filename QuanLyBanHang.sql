use master
go
create database QuanLyBanHangAgile


CREATE TABLE KHACHHANG(
	MAKH	char(4) not null,	
	HOTEN	varchar(40),
	DCHI	varchar(50),
	SODT	varchar(20),
	NGSINH	date,
	NGDK	date,
	primary key(MAKH)
)
insert into khachhang 
values
('KH01','Nguyen Van A','731 Tran Hung Dao, Q5, TpHCM','8823451','1960/07/07','2006/11/22'),
('KH02','Tran Ngoc Han','23/5 Nguyen Trai, Q5, TpHCM','908256478','1960/07/07','2006/11/22'),
('KH03','Tran Ngoc Linh','45 Nguyen Canh Chan, Q1, TpHCM','938776266','1960/07/07','2006/11/22'),
('KH04','Tran Minh Long','50/34 Le Dai Hanh, Q10, TpHCM','917325476','1960/07/07','2006/11/22'),
('KH05','Le Nhat Minh','34 Truong Dinh, Q3, TpHCM','8246108','1960/07/07','2006/11/22'),
('KH06','Le Hoai Thuong','227 Nguyen Van Cu, Q5, TpHCM','8631738','1960/07/07','2006/11/22'),
('KH07','Nguyen Van Tam','32/3 Tran Binh Trong, Q5, TpHCM','916783565','1960/07/07','2006/11/22'),
('KH08','Phan Thi Thanh','45/2 An Duong Vuong, Q5, TpHCM','938435756','1960/07/07','2006/11/22'),
('KH09','Le Ha Vinh','873 Le Hong Phong, Q5, TpHCM','8654763','1960/07/07','2006/11/22'),
('KH10','Ha Duy Lap','34/34B Nguyen Trai, Q1, TpHCM','8768904','1960/07/07','2006/11/22')

---------------------------------------------
-- NHANVIEN
CREATE TABLE NHANVIEN(
	MANV	char(4) not null,	
	HOTEN	varchar(40),
	SODT	varchar(20),
	NGVL	smalldatetime	
	primary key(MANV)
)
insert into nhanvien
values
('NV01','Nguyen Nhu Nhut','927345678','2006/04/13'),
('NV02','Le Thi Phi Yen','987567390','2006/04/21'),
('NV03','Nguyen Van B','997047382','2006/04/23'),
('NV04','Ngo Thanh Tuan','913758498','2006/06/11'),
('NV05','Nguyen Thi Truc Thanh','918590387','2006/07/12')

---------------------------------------------
-- SANPHAM
CREATE TABLE SANPHAM(
	maSP char(4) not null,
	soLuong int,
	tenSP nvarchar(100),
	donVi varchar(20),
	nuocSX	varchar(40),
	giaNhap money,
	giaBan	money,
	img nvarchar(255),
	primary key(MASP)	
)
insert into sanpham 
values
('BC01',100,'But chi','cay','Singapore',2900,3000,'assets\\img\\ButChiCay.jpg'),
('BC02',300,'But chi','cay','Singapore',4900,5000,'assets\\img\\ButChiCay.jpg'),
('BC03',200,'But chi','cay','Viet Nam',3400,3500,'assets\\img\\ButChiCay.jpg'),
('BC04',100,'But chi','hop','Viet Nam',29000,30000,'assets\\img\\ButChiHop.jpg'),
('BB01',400,'But bi','cay','Viet Nam',4900,5000,'assets\\img\\ButChiCay.jpg'),
('BB02',100,'But bi','cay','Trung Quoc',6800,7000,'assets\\img\\ButChiCay.jpg'),
('BB03',300,'But bi','hop','Thai Lan',99000,100000,'assets\\img\\ButLong.jpg'),
('TV01',290,'Tap 100 giay mong','quyen','Trung Quoc',2300,2500,'assets\\img\\tap100Trang.jpg'),
('TV02',100,'Tap 200 giay mong','quyen','Trung Quoc',4000,4500,'assets\\img\\tap200Trang.jpg'),
('TV03',100,'Tap 100 giay tot','quyen','Viet Nam',2500,3000,'assets\\img\\tap100Trang.jpg'),
('TV04',100,'Tap 200 giay tot','quyen','Viet Nam',5000,5500,'assets\\img\\tap200Trang.jpg'),
('TV05',250,'Tap 100 trang','chuc','Viet Nam',22000,23000,'assets\\img\\tap200Trang.jpg'),
('TV06',100,'Tap 200 trang','chuc','Viet Nam',52000,53000,'assets\\img\\tap200Trang.jpg'),
('TV07',250,'Tap 100 trang','chuc','Trung Quoc',33000,34000,'assets\\img\\tap100Trang.jpg'),
('ST01',400,'So tay 500 trang','quyen','Trung Quoc',39000,40000,'assets\\img\\SoTay500.jpg'),
('ST02',300,'So tay loai 1','quyen','Viet Nam',54000,55000,'assets\\img\\SoTayLoai1.jpg'),
('ST03',200,'So tay loai 2','quyen','Viet Nam',50000,51000,'assets\\img\\SoTayLoai2.jpg'),
('ST04',100,'So tay','quyen','Thai Lan',50000,55000,'assets\\img\\SoTay.jpg'),
('ST05',500,'So tay mong','quyen','Thai Lan',19000,20000,'assets\\img\\Sotay.jpg'),
('ST06',100,'Phan viet bang','hop','Viet Nam',4000,5000,'assets\\img\\Phan.jpg'),
('ST07',190,'Phan khong bui','hop','Viet Nam',6000,7000,'assets\\img\\PhanKhongBui.jpg'),
('ST08',300,'Bong bang','cai','Viet Nam',900,1000,'assets\\img\\BongBang.jpg'),
('ST09',100,'But long','cay','Viet Nam',4000,5000,'assets\\img\\ButLong.jpg'),
('ST10',200,'But long','cay','Trung Quoc',5000,7000,'assets\\img\\ButLong.jpg')
---------------------------------------------
-- HOADON
CREATE TABLE HOADON(
	SOHD	int not null,
	NGHD 	smalldatetime,
	MAKH 	char(4),
	MANV 	char(4),
	TRIGIA	money,
	primary key(SOHD),
	FOREIGN KEY(MAKH) REFERENCES KHACHHANG(MAKH),
	FOREIGN KEY(MANV) REFERENCES NHANVIEN(MANV)
)
insert into hoadon 
values
(1001,'2006/07/17','KH01','NV01',320000),
(1002,'2006/08/16','KH01','NV02',840000),
(1003,'2006/08/15','KH02','NV01',100000),
(1004,'2006/09/29','KH02','NV01',180000),
(1005,'2006/10/28','KH01','NV02',3800000),
(1006,'2006/10/11','KH01','NV03',2430000),
(1007,'2006/10/25','KH03','NV03',510000),
(1008,'2006/10/24','KH01','NV03',440000),
(1009,'2006/10/12','KH03','NV04',200000),
(1010,'2006/11/11','KH01','NV01',5200000),
(1011,'2006/11/11','KH04','NV03',250000),
(1012,'2006/11/12','KH05','NV03',21000),
(1013,'2006/12/29','KH06','NV01',5000),
(1014,'2006/12/28','KH03','NV02',3150000),
(1015,'2006/01/27','KH06','NV01',910000),
(1016,'2006/01/26','KH07','NV02',12500),
(1017,'2006/01/11','KH08','NV03',35000),
(1018,'2006/01/30','KH08','NV03',330000),
(1019,'2006/01/15','KH01','NV03',30000),
(1020,'2006/01/14','KH09','NV04',70000),
(1021,'2006/01/13','KH10','NV03',67500),
(1022,'2006/01/12',Null,'NV03',7000),
(1023,'2006/01/23',Null,'NV01',330000)
---------------------------------------------
-- CTHD
CREATE TABLE CTHD(
	SOHD	int,
	MASP	char(4),
	SL	int,
	primary key(SOHD,MASP),
	FOREIGN KEY(SOHD) REFERENCES HOADON(SOHD),
	FOREIGN KEY(MASP) REFERENCES SANPHAM(MASP)
)

insert into CTHD 
values
(1001,'TV02',10),
(1001,'ST01',5),
(1001,'BC01',5),
(1001,'BC02',10),
(1001,'ST08',10),
(1002,'BC04',20),
(1002,'BB01',20),
(1002,'BB02',20),
(1003,'BB03',10),
(1004,'TV01',20),
(1004,'TV02',10),
(1004,'TV03',10),
(1004,'TV04',10),
(1005,'TV05',50),
(1005,'TV06',50),
(1006,'TV07',20),
(1006,'ST01',30),
(1006,'ST02',10),
(1007,'ST03',10),
(1008,'ST04',8),
(1009,'ST05',10),
(1010,'TV07',50),
(1010,'ST07',50),
(1010,'ST08',100),
(1010,'ST04',50),
(1010,'TV03',100),
(1011,'ST06',50),
(1012,'ST07',3),
(1013,'ST08',5),
(1014,'BC02',80),
(1014,'BB02',100),
(1014,'BC04',60),
(1014,'BB01',50),
(1015,'BB02',30),
(1015,'BB03',7),
(1016,'TV01',5),
(1017,'TV02',1),
(1017,'TV03',1),
(1017,'TV04',5),
(1018,'ST04',6),
(1019,'ST05',1),
(1019,'ST06',2),
(1020,'ST07',10),
(1021,'ST08',5),
(1021,'TV01',7),
(1021,'TV02',10),
(1022,'ST07',1),
(1023,'ST04',6)
show databases;
create database corejava;
use corejava;
CREATE TABLE login (
 cid varchar(30),
 pass varchar(30));
CREATE TABLE details (
 cid varchar(10),
 cname varchar(30), 
 gender varchar(10),
 dob varchar(20),
 email varchar(30), 
 phone varchar(30),
 address varchar(50), 
 city varchar(30), 
 state varchar(30),
 pin varchar(10));
CREATE TABLE booking (cid varchar(10),
 booked_date varchar(20),
 expected_delivery varchar(20),
 price varchar(10),
 bill varchar(15));
 show tables;
select * from login;
select * from details;
select * from booking;

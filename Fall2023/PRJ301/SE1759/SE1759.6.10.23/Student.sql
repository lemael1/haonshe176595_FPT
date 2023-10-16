-- Tạo cơ sở dữ liệu Students
CREATE DATABASE Students;

-- Sử dụng cơ sở dữ liệu Students
USE Students;

-- Tạo bảng Student
CREATE TABLE Student (
    RollCode INT PRIMARY KEY,
    FullName NVARCHAR(255),
    DoB DATE,
    Gender NVARCHAR(10)
);

-- Tạo bảng Major
CREATE TABLE Major (
    RollCode INT,
    Major NVARCHAR(50),
    FOREIGN KEY (RollCode) REFERENCES Student(RollCode)
);

-- Thêm 10 dữ liệu mẫu vào bảng Student
INSERT INTO Student (RollCode, FullName, DoB, Gender)
VALUES
    (1, 'Nguyen Van Nam', '2000-01-01', 'Nam'),
    (2, 'Tran Thi A', '1999-03-15', 'Nu'),
    (3, 'Le Van B', '2001-05-20', 'Nam'),
    (4, 'Pham Hoang Hai', '2002-07-10', 'Nu'),
    (5, 'Thai Van Bac', '2003-09-05', 'Nam'),
    (6, 'Dinh Van Nam', '2004-11-25', 'Nu'),
    (7, 'Hoang Van A', '1998-12-30', 'Nam'),
    (8, 'Pham Anh Van', '1997-08-08', 'Nam'),
    (9, 'Nguyen Thi B', '2000-04-18', 'Nam'),
    (10, 'Dang Tran Van', '1999-02-28', 'Nu');

-- Thêm 10 dữ liệu mẫu vào bảng Major
INSERT INTO Major (RollCode, Major)
VALUES
    (1, 'SE'),
    (2, 'SE'),
    (3, 'IS'),
    (4, 'AI'),
    (5, 'SE'),
    (6, 'SE'),
    (7, 'AI'),
    (8, 'IS'),
    (9, 'SE'),
    (10, 'AI');
select s.RollCode,s.FullName,s.DoB,s.Gender,m.Major 
from Student s join Major m on s.RollCode=m.RollCode

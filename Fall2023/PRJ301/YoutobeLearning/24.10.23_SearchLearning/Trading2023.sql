CREATE DATABASE Trading2023;
GO

USE Trading2023;
GO

CREATE TABLE Categories
(
    ID INT PRIMARY KEY,
    [name] NVARCHAR(30),
    [describe] NVARCHAR(50)
);
GO

INSERT INTO Categories (ID, [name], [describe]) VALUES (1, 'Nokia', N'gọn nhẹ, pin lâu');
INSERT INTO Categories (ID, [name], [describe]) VALUES (2, 'Samsung', N'dáng đẹp, nhiều chức năng');
INSERT INTO Categories (ID, [name], [describe]) VALUES (3, 'Iphone', N'Hiện đại, chụp ảnh 20GPixel...');
INSERT INTO Categories (ID, [name], [describe]) VALUES (4, 'Galaxy', N'Hiện đại, chụp ảnh 10GPixel...');
INSERT INTO Categories (ID, [name], [describe]) VALUES (5, 'Xiaomi', N'Giá rẻ, hiệu năng cao');
INSERT INTO Categories (ID, [name], [describe]) VALUES (6, 'Huawei', N'Chất lượng tốt, camera sắc nét');
INSERT INTO Categories (ID, [name], [describe]) VALUES (7, 'Oppo', N'Thiết kế đẹp, selfie tốt');
INSERT INTO Categories (ID, [name], [describe]) VALUES (8, 'Vivo', N'Màn hình sắc nét, pin trâu');

GO

CREATE TABLE Products
(
    ID VARCHAR(10) PRIMARY KEY,
    [name] NVARCHAR(MAX) NULL,
    [quantity] INT NULL,
    [price] MONEY NULL,
    [releaseDate] DATE NULL,
    [describe] NVARCHAR(MAX) NULL,
    [image] NVARCHAR(MAX) NULL,
    [cid] INT REFERENCES Categories(ID)
);
GO

INSERT INTO [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe], [image], [cid])
VALUES (N'ip1', N'iphone 12 series', 15, 19000.0000, '2021-12-01', N'Chiếc iPhone siêu nhỏ gọn nhưng mang trên mình sức mạnh không đối thủ. iPhone 12 mini là sự lựa chọn hoàn hảo cho những ai đang cần một chiếc điện thoại có thể làm mọi thứ nhưng lại nằm gọn trong lòng bàn tay và độ tiện dụng đáng kinh ngạc.', N'images/ip1.jpg', 1);

INSERT INTO [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe], [image], [cid])
VALUES (N'ip2', N'iphone 11 series', 30, 16000.0000, '2021-10-05', N'Chiếc iPhone siêu nhỏ gọn nhưng mang trên mình sức mạnh không đối thủ. iPhone 11 là sự lựa chọn hoàn hảo cho những ai đang cần một chiếc điện thoại có thể làm mọi thứ nhưng lại nằm gọn trong lòng bàn tay và độ tiện dụng đáng kinh ngạc.', N'images/ip2.jpg', 1);

-- Lặp lại định dạng trên cho các câu lệnh INSERT khác với giá trị tương ứng.

INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'ip3 ', N'iphone X series', 22, 13000.0000,
CAST(0x37400B00 AS Date), N'Chiếc iPhone siêu nhỏ gọn nhưng mang trên mình sức mạnh
không đối thủ. iPhone 12 mini là sự lựa chọn hoàn hảo cho những ai đang cần một chiếc
điện thoại có thể làm mọi thứ nhưng lại nằm gọn trong lòng bàn tay và độ tiện dụng đáng
kinh ngạc.', N'images/ip3.jpg', 1)
INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'opp1 ', N'oppo find x series', 60, 13000.0000,
CAST(0x93400B00 AS Date), N'OPPO Reno4 - Chiếc điện thoại với cấu hình mạnh mẽ và công
nghệ sạc siêu nhanh sẽ giúp bạn có được hiệu suất cao để trải nghiệm những điều thú vị
trong cuộc sống, nhất là trên bộ tứ camera đẳng cấp cùng thiết kế từ nhà OPPO mà ai
cũng phải ngước nhìn.
', N'images/opp1.jpg', 3)
INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'opp2 ', N'oppo find x series', 60, 13000.0000,
CAST(0x93400B00 AS Date), N'OPPO Reno4 - Chiếc điện thoại với cấu hình mạnh mẽ và công
nghệ sạc siêu nhanh sẽ giúp bạn có được hiệu suất cao để trải nghiệm những điều thú vị
trong cuộc sống, nhất là trên bộ tứ camera đẳng cấp cùng thiết kế từ nhà OPPO mà ai
cũng phải ngước nhìn.
', N'images/opp2.jpg', 3)
INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'opp3 ', N'oppo find x series', 60, 13000.0000,
CAST(0x93400B00 AS Date), N'OPPO Reno4 - Chiếc điện thoại với cấu hình mạnh mẽ và công
nghệ sạc siêu nhanh sẽ giúp bạn có được hiệu suất cao để trải nghiệm những điều thú vị
trong cuộc sống, nhất là trên bộ tứ camera đẳng cấp cùng thiết kế từ nhà OPPO mà ai
cũng phải ngước nhìn.
', N'images/opp3.jpg', 3)
INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'opp4 ', N'oppo find x series', 60, 13000.0000,
CAST(0x93400B00 AS Date), N'OPPO Reno4 - Chiếc điện thoại với cấu hình mạnh mẽ và công
nghệ sạc siêu nhanh sẽ giúp bạn có được hiệu suất cao để trải nghiệm những điều thú vị
trong cuộc sống, nhất là trên bộ tứ camera đẳng cấp cùng thiết kế từ nhà OPPO mà ai
cũng phải ngước nhìn.
', N'images/opp4.jpg', 3)
INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'opp5 ', N'oppo find x series', 60, 13000.0000,
CAST(0x93400B00 AS Date), N'OPPO Reno4 - Chiếc điện thoại với cấu hình mạnh mẽ và công
nghệ sạc siêu nhanh sẽ giúp bạn có được hiệu suất cao để trải nghiệm những điều thú vị
trong cuộc sống, nhất là trên bộ tứ camera đẳng cấp cùng thiết kế từ nhà OPPO mà ai
cũng phải ngước nhìn.
', N'images/opp5.jpg', 3)
INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'ss1 ', N'Galaxy Z series', 12, 20000.0000,
CAST(0x01420B00 AS Date), N'Samsung Galaxy Note 20 Ultra được chế tác từ những vật liệu
cao cấp hàng đầu hiện nay, với sự tỉ mỉ và chất lượng gia công thượng thừa, tạo nên
chiếc điện thoại đẹp hơn những gì bạn có thể tưởng tượng.', N'images/ss1.jpg', 2)
INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'ss2 ', N'galaxy note series', 12, 18000.0000,
CAST(0xA9410B00 AS Date), N'Samsung Galaxy Note 20 Ultra được chế tác từ những vật liệu
cao cấp hàng đầu hiện nay, với sự tỉ mỉ và chất lượng gia công thượng thừa, tạo nên
chiếc điện thoại đẹp hơn những gì bạn có thể tưởng tượng.', N'images/ss2.jpg', 2)
INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'ss3 ', N'galaxy F series', 34, 16000.0000,
CAST(0x3B400B00 AS Date), N'Samsung Galaxy Note 20 Ultra được chế tác từ những vật liệu
cao cấp hàng đầu hiện nay, với sự tỉ mỉ và chất lượng gia công thượng thừa, tạo nên
chiếc điện thoại đẹp hơn những gì bạn có thể tưởng tượng.', N'images/ss3.jpg', 2)
INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'ss4 ', N'galaxy HHH', 19, 15000.0000, CAST(0xCE3E0B00
AS Date), N'Samsung Galaxy Note 20 Ultra được chế tác từ những vật liệu cao cấp hàng
đầu hiện nay, với sự tỉ mỉ và chất lượng gia công thượng thừa, tạo nên chiếc điện thoại
đẹp hơn những gì bạn có thể tưởng tượng.', N'images/ss4.jpg', 2)
INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'ss5 ', N'galaxy KKK', 52, 14000.0000, CAST(0x4C3C0B00
AS Date), N'Samsung Galaxy Note 20 Ultra được chế tác từ những vật liệu cao cấp hàng
đầu hiện nay, với sự tỉ mỉ và chất lượng gia công thượng thừa, tạo nên chiếc điện thoại
đẹp hơn những gì bạn có thể tưởng tượng.', N'images/ss5.jpg', 2)
INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'ss6 ', N'galaxy note series', 12, 18000.0000,
CAST(0xA9410B00 AS Date), N'Samsung Galaxy Note 20 Ultra du?c ch? tác t? nh?ng v?t li?u
cao c?p hàng d?u hi?n nay, v?i s? t? m? và ch?t lu?ng gia công thu?ng th?a, t?o nên
chi?c di?n tho?i d?p hon nh?ng gì b?n có th? tu?ng tu?ng.', N'images/ss2.jpg', 2)
INSERT [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe],
[image], [cid]) VALUES (N'ss7 ', N'galaxy note series', 12, 18000.0000,
CAST(0xA9410B00 AS Date), N'Samsung Galaxy Note 20 Ultra du?c ch? tác t? nh?ng v?t li?u
cao c?p hàng d?u hi?n nay, v?i s? t? m? và ch?t lu?ng gia công thu?ng th?a, t?o nên
chi?c di?n tho?i d?p hon nh?ng gì b?n có th? tu?ng tu?ng.', N'images/ss2.jpg', 2)
INSERT INTO [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe], [image], [cid])
VALUES (N'vsm1', N'Vsmart Joy 4 3GB-64GB', 60, 13000.0000, '2021-10-05', N'smart Live 4 6GB-64GB sở hữu cấu hình cực đỉnh, đưa bạn đến trải nghiệm giải trí bất tận với dung lượng pin lớn, màn hình tuyệt đẹp và 4 camera sau AI đầy ấn tượng.', N'images/vsm1.jpg', 4);
INSERT INTO [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe], [image], [cid])
VALUES (N'xm1', N'Xiaomi Mi 11', 20, 10000.0000, '2022-01-01', N'Xiaomi Mi 11 mang trên mình hiệu năng cao với giá rẻ.', N'images/xm1.jpg', 5);

INSERT INTO [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe], [image], [cid])
VALUES (N'hw1', N'Huawei P40', 25, 15000.0000, '2022-02-01', N'Huawei P40 có chất lượng tốt với camera sắc nét.', N'images/hw1.jpg', 6);

INSERT INTO [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe], [image], [cid])
VALUES (N'op1', N'Oppo Reno5', 30, 12000.0000, '2022-03-01', N'Oppo Reno5 có thiết kế đẹp với chức năng selfie tốt.', N'images/op1.jpg', 7);

INSERT INTO [dbo].[Products] ([id], [name], [quantity], [price], [releaseDate], [describe], [image], [cid])
VALUES (N'vv1', N'Vivo V21', 35, 13000.0000, '2022-04-01', N'Vivo V21 có màn hình sắc nét với pin trâu.', N'images/vv1.jpg', 8);

drop database Trading2023
go
select * from Categories
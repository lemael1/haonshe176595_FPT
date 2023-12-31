
Create database SamplePE2022
USE [SamplePE2022]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 4/16/2022 9:35:42 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[userid] [varchar](150) NOT NULL,
	[password] [varchar](150) NOT NULL,
	[displayname] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[userid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Comment]    Script Date: 4/16/2022 9:35:42 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Comment](
	[cid] [int] IDENTITY(1,1) NOT NULL,
	[ctitle] [varchar](150) NOT NULL,
	[userid] [varchar](150) NOT NULL,
	[tid] [int] NOT NULL,
 CONSTRAINT [PK_Comment] PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Student]    Script Date: 4/16/2022 9:35:42 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Student](
	[sid] [int] NOT NULL,
	[name] [varchar](150) NOT NULL,
	[gender] [bit] NOT NULL,
	[dob] [date] NOT NULL,
 CONSTRAINT [PK_Student] PRIMARY KEY CLUSTERED 
(
	[sid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Thread]    Script Date: 4/16/2022 9:35:42 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Thread](
	[tid] [int] NOT NULL,
	[tcontent] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Thread] PRIMARY KEY CLUSTERED 
(
	[tid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Account] ([userid], [password], [displayname]) VALUES (N'mra', N'123', N'MR A')
INSERT [dbo].[Account] ([userid], [password], [displayname]) VALUES (N'mrb', N'123', N'MR B')
INSERT [dbo].[Account] ([userid], [password], [displayname]) VALUES (N'mrc', N'123', N'MR C')
GO
SET IDENTITY_INSERT [dbo].[Comment] ON 

INSERT [dbo].[Comment] ([cid], [ctitle], [userid], [tid]) VALUES (2, N'You can cheat', N'mra', 1)
INSERT [dbo].[Comment] ([cid], [ctitle], [userid], [tid]) VALUES (3, N':)) no way bro', N'mrb', 1)
INSERT [dbo].[Comment] ([cid], [ctitle], [userid], [tid]) VALUES (4, N'cheat does work, but don get catched', N'mrc', 1)
INSERT [dbo].[Comment] ([cid], [ctitle], [userid], [tid]) VALUES (5, N'because they are not hated by smarter people', N'mrc', 2)
INSERT [dbo].[Comment] ([cid], [ctitle], [userid], [tid]) VALUES (6, N'no idea', N'mra', 2)
SET IDENTITY_INSERT [dbo].[Comment] OFF
GO
INSERT [dbo].[Student] ([sid], [name], [gender], [dob]) VALUES (1, N'Violet Quinn', 0, CAST(N'1983-08-19' AS Date))
INSERT [dbo].[Student] ([sid], [name], [gender], [dob]) VALUES (2, N'Dax Benson', 1, CAST(N'1963-10-20' AS Date))
INSERT [dbo].[Student] ([sid], [name], [gender], [dob]) VALUES (3, N'Kristina Poole', 1, CAST(N'1975-09-29' AS Date))
INSERT [dbo].[Student] ([sid], [name], [gender], [dob]) VALUES (4, N'Sandra Lambert', 0, CAST(N'1965-10-11' AS Date))
INSERT [dbo].[Student] ([sid], [name], [gender], [dob]) VALUES (5, N'Ace Singh', 0, CAST(N'1988-11-13' AS Date))
INSERT [dbo].[Student] ([sid], [name], [gender], [dob]) VALUES (6, N'Dakota Mccullough
', 0, CAST(N'1987-11-24' AS Date))
INSERT [dbo].[Student] ([sid], [name], [gender], [dob]) VALUES (7, N'Jazlynn Sheppard
', 1, CAST(N'1976-07-23' AS Date))
GO
INSERT [dbo].[Thread] ([tid], [tcontent]) VALUES (1, N'How to pass the subject without studying?')
INSERT [dbo].[Thread] ([tid], [tcontent]) VALUES (2, N'Why do stupid people live longer?')
INSERT [dbo].[Thread] ([tid], [tcontent]) VALUES (3, N'Am I the dumbest in class?')
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD  CONSTRAINT [FK_Comment_Account] FOREIGN KEY([userid])
REFERENCES [dbo].[Account] ([userid])
GO
ALTER TABLE [dbo].[Comment] CHECK CONSTRAINT [FK_Comment_Account]
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD  CONSTRAINT [FK_Comment_Thread] FOREIGN KEY([tid])
REFERENCES [dbo].[Thread] ([tid])
GO
ALTER TABLE [dbo].[Comment] CHECK CONSTRAINT [FK_Comment_Thread]
GO
select * from Thread t join Comment c
on t.tid=c.tid
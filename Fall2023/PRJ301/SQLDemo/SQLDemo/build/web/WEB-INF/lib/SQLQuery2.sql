
create table HumanType(
typeid int primary key,
typename nvarchar(20),
)
create table Human(
humanid int,
humanname nvarchar(20),
humandob Date,
humangender varchar(20),
typeid int references HumanType(typeid)

)
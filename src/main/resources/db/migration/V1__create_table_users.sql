CREATE TABLE users (
    id UUID NOT NULL PRIMARY KEY UNIQUE ,
    name varchar(50) NOT NULL,
    username varchar(30) NOT NULL UNIQUE,
    email varchar(70) NOT NULL,
    password varchar(30) NOT NULL,
    role varchar(20) NOT NULL
);

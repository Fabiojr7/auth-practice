CREATE TABLE products(
    id UUID NOT NULL UNIQUE PRIMARY KEY,
    name varchar(50) NOT NULL,
    description varchar(100) NOT NULL,
    price decimal(10,2) NOT NULL,
    quantity integer NOT NULL
);
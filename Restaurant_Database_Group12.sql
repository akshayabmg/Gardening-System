CREATE DATABASE  IF NOT EXISTS `GROUP12`;
USE `GROUP12`;

create table employee (idEmployee INT(50) NOT NULL AUTO_INCREMENT PRIMARY KEY, FirstName VARCHAR(50), MiddleInitial VARCHAR(50), LastName VARCHAR(50), Wage FLOAT(50), Username VARCHAR(50), Password VARCHAR(50), SSN BIGINT(9), Type VARCHAR(50), Hours FLOAT(50));
INSERT INTO employee (FirstName , MiddleInitial , LastName , Wage , Username , Password , SSN , Type) values ("George", "","Fernandes", 40,"manager", "password", 345237452, "Manager");
INSERT INTO employee (FirstName , MiddleInitial , LastName , Wage , Username , Password , SSN , Type) values ("Neena", "","Samuel", 30,"chef", "password", 675628951, "Chef");
INSERT INTO employee (FirstName , MiddleInitial , LastName , Wage , Username , Password , SSN , Type) values ("Christy", "","Cox", 25,"host", "password", 789463752, "Host");

create table inventory (idInventory INT(50) NOT NULL AUTO_INCREMENT PRIMARY KEY, Name VARCHAR(50), Stock VARCHAR(50));
insert into inventory (Name, Stock) values ("Bun", "50");
insert into inventory (Name, Stock) values ("Pizza Base", "100");
insert into inventory (Name, Stock) values ("Water", "500");
insert into inventory (Name, Stock) values ("Potato", "75");
insert into inventory (Name, Stock) values ("Lettuce", "100");
insert into inventory (Name, Stock) values ("Mayo", "50");
insert into inventory (Name, Stock) values ("Tomato Sauce", "50");

create table menu (idMenu INT(50) NOT NULL AUTO_INCREMENT PRIMARY KEY, FoodName VARCHAR(50), Price VARCHAR(50), Description VARCHAR(50), Additional VARCHAR(50), InventoryName VARCHAR(50), InventoryAmount VARCHAR(50), InventoryId VARCHAR(50), Category INT(50));
insert into menu (FoodName, Price, Description, Additional, InventoryName, InventoryAmount, InventoryId, Category) values ("Burger", 5.00,"Burger- fast food", "","", "", 1, 1);
insert into menu (FoodName, Price, Description, Additional, InventoryName, InventoryAmount, InventoryId, Category) values ("Coke", 3.00,"Best ones in town!", "","", "", 1, 0);
insert into menu (FoodName, Price, Description, Additional, InventoryName, InventoryAmount, InventoryId, Category) values ("Fries", 4.00,"Crispy and golden from our farm grown potatoes!", "","", "", 1, 1);
insert into menu (FoodName, Price, Description, Additional, InventoryName, InventoryAmount, InventoryId, Category) values ("Pizza", 7.00,"Cheesy definition of divine! ", "","", "", 1, 1);

create table orders (idOrder INT(50) NOT NULL AUTO_INCREMENT PRIMARY KEY, Name VARCHAR(50), Status INT(50), quantity INT(50), idEmployee INT(50), foreign key (idEmployee) REFERENCES Employee(idEmployee), Time TIME);
    
create table past_payroll (EmployeeId INT(50), Hours FLOAT(50), ReleaseDate DATE);
create table present_payroll (EmployeeId INT(50), TimeIn datetime, TimeOut datetime,Active BIT);

CREATE TABLE tables (idTable INT(50) NOT NULL AUTO_INCREMENT PRIMARY KEY, status VARCHAR(50));
insert into tables (status) values ("clean");
insert into tables (status) values ("clean");
insert into tables (status) values ("clean");
insert into tables (status) values ("clean");
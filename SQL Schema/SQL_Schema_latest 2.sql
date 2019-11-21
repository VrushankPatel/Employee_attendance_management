create table Administrator(Company_id int NOT NULL auto_increment,Admin_username varchar(255) unique,Admin_Password longtext NOT NULL,PRIMARY KEY(Company_id)) ENGINE=INNODB;
ALTER TABLE `Administrator` AUTO_INCREMENT=0;
create table Employee(Employee_Company_id int NOT NULL,Employee_id int NOT NULL,Emp_full_name varchar(255),Emp_address longtext,Emp_phone bigint,primary key(Employee_Company_id,Employee_id),FOREIGN KEY (Employee_Company_id) REFERENCES Administrator(Company_id) ON DELETE CASCADE)ENGINE=INNODB;
CREATE TABLE Attendance(Attendance_Employee_Company_id int NOT NULL,Attendance_Employee_id int NOT NULL,attendance_date Date,attendance_status char NOT NULL,primary key(Attendance_Employee_Company_id,Attendance_Employee_id),FOREIGN KEY (Attendance_Employee_Company_id,Attendance_Employee_id) REFERENCES Employee(Employee_Company_id,Employee_id) ON DELETE CASCADE)ENGINE=INNODB;


insert into Administrator values(2,"Vrushank@123","patel");
drop table Attendance,Employee,Administrator;
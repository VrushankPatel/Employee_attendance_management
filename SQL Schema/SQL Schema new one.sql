create table Administrator(
	Company_id int NOT NULL auto_increment,
    Admin_username varchar(255) unique,
    Admin_Password longtext NOT NULL,
    PRIMARY KEY(Company_id)
) ENGINE=INNODB;

ALTER TABLE `Administrator` AUTO_INCREMENT=0;

create table Employee(
	Employee_Company_id int NOT NULL,
	Employee_id bigint NOT NULL,
	Emp_full_name varchar(255),
	Emp_address longtext,
	Emp_phone bigint,
	primary key(Employee_Company_id,Employee_id),
	FOREIGN KEY (Employee_Company_id) REFERENCES Administrator(Company_id) ON DELETE CASCADE
)ENGINE=INNODB;

CREATE TABLE Attendance(
	Attendance_Employee_Company_id int NOT NULL,
	Attendance_Employee_id bigint NOT NULL,
	attendance_date Date,
	attendance_status ENUM('PRESENT', 'ABSENT', 'HOLIDAY') NOT NULL,
    primary key(Attendance_Employee_Company_id,Attendance_Employee_id,attendance_date),
    FOREIGN KEY (Attendance_Employee_Company_id,Attendance_Employee_id) REFERENCES Employee(Employee_Company_id,Employee_id) ON DELETE CASCADE
)ENGINE=INNODB;

select count(*) from Attendance where attendance_status = "PRESENT" and Attendance_Employee_Company_Id = 2 and Attendance_Employee_Id = '4564533333' and attendance_date between '2019-11-01' and '2019-11-25';
select * from Administrator;
update Administrator set Admin_username = "Sushil@123" where Company_id = 2;
insert into Administrator values(2,"Vrushank@123","patel");
select * from Employee;

insert into Employee values(2,4564533333,"sanjay patel","aarav","9601501725");
select * from Employee;


drop table Attendance,Employee,Administrator;
SET SQL_SAFE_UPDATES = 0;

insert into Attendance values(2,4564533333,"2019-11-6","PRESENT");

select count(*) from Attendance where Attendance_Employee_id = "4564533333" and Attendance_Employee_Company_id = 2 and attendance_status = "PRESENT";
select * from Attendance where Attendance_Employee_Company_Id = 2 and Attendance_Employee_Id = 4564533333 and attendance_date between "2019-11-02" and "2019-11-20" order by attendance_date;

select * from Attendance where Attendance_Employee_Company_id = 2 and Attendance_Employee_id = 4564533333 order by attendance_date;
select min(attendance_date),max(attendance_date) from Attendance where Attendance_Employee_Company_id = 2 and Attendance_Employee_id = 4564533333 order by attendance_date;

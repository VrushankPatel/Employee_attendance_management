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
	Attendance_Employee_id long NOT NULL,
	attendance_date Date,
	attendance_status ENUM('PRESENT', 'ABSENT', 'HOLIDAY') NOT NULL,
    primary key(Attendance_Employee_Company_id,Attendance_Employee_id,attendance_date),
    FOREIGN KEY (Attendance_Employee_Company_id,Attendance_Employee_id) REFERENCES Employee(Employee_Company_id,Employee_id) ON DELETE CASCADE
)ENGINE=INNODB;



insert into Administrator values(2,"Vrushank@123","patel");

insert into Employee values(2,45645,"vrushank patel","aarav","9601501725");

insert into Attendance values(2,45645,"2005-05-02","PRESENT");

drop table Attendance,Employee,Administrator;

select * from Attendance;
replace into Attendance values(2,45645,'2013-12-25','HOLIDAY');



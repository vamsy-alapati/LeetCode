--MySQL

select name as employee
  from employee e1
 where salary > (select salary from employee where id = e1.managerId);


-- Oracle

select name as employee
  from employee e1
 where salary > (select salary from employee where id = e1.managerId);
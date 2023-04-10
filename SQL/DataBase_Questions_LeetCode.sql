-- LeetCode Database Questions

-- 175. Combine Two Tables
-- MySQL

select p.firstName, p.lastName, a.city, a.state
  from person p left join address a on p.personId = a.personId;



-- 181. Employees Earning More Than Their Managers
-- MySQL

select name as employee
  from employee e1
 where salary > (select salary from employee where id = e1.managerId);


-- 182. Duplicate Emails
-- MySQL

select distinct(email) from person
group by email
having count(email) > 1;


-- 183. Customers Who Never Order
-- M
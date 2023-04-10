-- MySQL

--MEDIUM

select A.name Department, e1.name Employee, A.Salary
from 
(
  select d.id, d.name, max(e.salary) salary
  from department d, employee e
  where d.id = e.departmentID
  group by d.id
) A, employee e1
where A.id = e1.departmentID
and A.salary = e1.salary
;
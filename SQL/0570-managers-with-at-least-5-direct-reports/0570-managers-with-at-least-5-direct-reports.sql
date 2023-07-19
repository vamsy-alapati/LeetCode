# Write your MySQL query statement below

select e.name
from 
(
    select managerid
      from employee
     group by managerid
    having count(managerid) >= 5
) m, employee e
where e.id = m.managerid;


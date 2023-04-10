# Write your MySQL query statement below

select employee_id,
       CASE
            WHEN (employee_id%2 <> 0) && name not like 'M%'
            THEN salary
            ELSE 0
       END as bonus
from employees
order by employee_id;
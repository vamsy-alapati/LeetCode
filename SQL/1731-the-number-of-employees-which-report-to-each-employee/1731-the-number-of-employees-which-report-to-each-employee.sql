# Write your MySQL query statement below


select e.reports_to as employee_id,
       e2.name,
       count(e.reports_to) reports_count,
       round(avg(e.age)) average_age 
from employees e, employees e2
where e.reports_to = e2.employee_id
  and e.reports_to is not null
group by e.reports_to
order by employee_id;
# Write your MySQL query statement below


select en.unique_id, e.name
from employees e left join employeeUNI en on e.id = en.id;
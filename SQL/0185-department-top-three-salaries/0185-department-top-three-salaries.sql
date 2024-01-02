# Write your MySQL query statement below

SELECT d.name as 'Department',
       e1.name as 'Employee',
       e1.salary as 'Salary'
  FROM Employee e1
  JOIN department d
    ON e1.departmentId = d.id
 WHERE 3 > (SELECT COUNT(DISTINCT e2.salary)
              FROM employee e2
             WHERE e2.salary > e1.salary
               AND e2.departmentId = e1.departmentId);
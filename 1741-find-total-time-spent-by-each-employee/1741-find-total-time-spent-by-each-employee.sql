/* Write your PL/SQL query statement below */

SELECT
    TO_CHAR(event_day, 'YYYY-MM-DD') day,
    emp_id,
    SUM(out_time - in_time) as total_time
FROM Employees
GROUP BY event_day, emp_id
# Write your MySQL query statement below

update salary
set sex = (CASE WHEN sex = 'f' THEN 'm' ELSE 'f' END);
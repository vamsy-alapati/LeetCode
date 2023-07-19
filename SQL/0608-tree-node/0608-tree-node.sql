# Write your MySQL query statement below

select id, CASE 
                WHEN p_id is null THEN 'Root'
                WHEN id in (select distinct(p_id) from tree ) THEN 'Inner'
                ELSE 'Leaf'
           END as type
  from tree;
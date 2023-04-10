# Write your MySQL query statement below

select x, y, z, case
                    WHEN x + y <= z THEN 'No'
                    WHEN y + z <= x THEN 'No'
                    WHEN z + x <= y THEN 'No'
                    ELSE 'Yes'
                END as triangle
from triangle;
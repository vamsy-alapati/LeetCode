/* Write your PL/SQL query statement below */
with cte as (
select id, 
       visit_date, 
       people, 
       LAG(id,1) OVER(order by id) as prevID_1, 
       LAG(id,2) OVER(order by id) as prevID_2,
       LEAD(id,1) OVER(order by id) as nextID_1, 
       LEAD(id,2) OVER(order by id) as nextID_2
from Stadium 
where people>=100
)

select id, to_char(visit_date,'YYYY-MM-DD') as visit_date, people from cte
where (id+1 = nextID_1 AND id+2 = nextID_2)
   or (id-1 = prevID_1 AND id-2 = prevID_2)
   OR (id-1 = prevID_1 AND id+1 = nextID_1)
ORDER BY visit_date;
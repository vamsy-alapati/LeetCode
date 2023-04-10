# Write your MySQL query statement below

select author_id id
from views
where author_id = viewer_id
group by author_id
having count(view_date) >= 1
order by id asc;
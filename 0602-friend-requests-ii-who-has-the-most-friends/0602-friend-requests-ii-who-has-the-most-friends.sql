select t.id, sum(t.num) as num
from 
(
select r1.requester_id as id, count(r1.requester_id) as num
  from requestaccepted r1
 group by id
UNION ALL
select r2.accepter_id as id, count(r2.accepter_id) as num
  from requestaccepted r2
 group by id
) t
group by t.id
order by num desc limit 1;

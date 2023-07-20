# Write your MySQL query statement below

select 
(CASE 
    when MOD(id,2) != 0 and last_num != id then id + 1
    when MOD(id,2) != 0 and last_num = id then id
    else id - 1
 END
) as id, student
from seat, (select count(*) as last_num from seat) as s_count
order by id;
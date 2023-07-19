# Write your MySQL query statement below

select b.machine_id, round(avg(b.end_time-b.start_time), 3) as processing_time
from
(
    select a.machine_id, a.process_id, (select round(timestamp,3) from activity 
                                            where machine_id = a.machine_id 
                                              and process_id = a.process_id
                                              and activity_type = 'start') as start_time,
                                        (select round(timestamp,3) from activity 
                                            where machine_id = a.machine_id 
                                              and process_id = a.process_id
                                              and activity_type = 'end') as end_time
      from activity a
     group by a.machine_id, a.process_id
) b
group by b.machine_id;
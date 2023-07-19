# Write your MySQL query statement below

select stu.student_id, stu.student_name, s.subject_name, count(e.student_id) as attended_exams
from students stu 
join subjects s
left join examinations e
on stu.student_id = e.student_id
and e.subject_name = s.subject_name
group by stu.student_id, stu.student_name, s.subject_name
order by student_id, subject_name;
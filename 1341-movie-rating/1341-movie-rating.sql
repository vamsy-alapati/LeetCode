# Write your MySQL query statement below


(select u.name as results
  from movierating mr, users u
 WHERE u.user_id = mr.user_id
 GROUP BY mr.user_id
 ORDER BY count(mr.user_id) desc, u.name asc limit 1)
UNION ALL
(SELECT m.title as results
  FROM movies m, movierating mr
 WHERE m.movie_id = mr.movie_id
   AND SUBSTR(mr.created_at,1,7) = '2020-02'
 GROUP BY mr.movie_id
 ORDER BY AVG(rating) desc, m.title asc limit 1 );
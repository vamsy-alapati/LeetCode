/* Write your PL/SQL query statement below */


SELECT t.request_at as Day, round((sum(case when t.status != 'completed' then 1 else 0 end))/count(*),2) as "Cancellation Rate"
FROM trips t
WHERE t.client_id in (SELECT users_id FROM users WHERE banned = 'No')
AND t.driver_Id in (SELECT users_id FROM users WHERE banned = 'No')
AND t.request_at BETWEEN '2013-10-01' AND '2013-10-03'
GROUP BY t.request_at;
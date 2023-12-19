# Write your MySQL query statement below


SELECT u.user_id as buyer_id, u.join_date, count(o.order_id) as orders_in_2019
  FROM users u 
LEFT JOIN orders o
    ON u.user_id = o.buyer_id
   AND YEAR(o.order_date) = 2019
 GROUP BY u.user_id;
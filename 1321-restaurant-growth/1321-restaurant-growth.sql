# Write your MySQL query statement below

SELECT c1.visited_on, 
(SELECT SUM(amount) from customer WHERE visited_on BETWEEN DATE_SUB(c1.visited_on, INTERVAL 6 DAY) AND c1.visited_on) AS amount,
ROUND((SELECT SUM(amount)/7 from customer WHERE visited_on BETWEEN DATE_SUB(c1.visited_on, INTERVAL 6 DAY) AND c1.visited_on), 2) AS average_amount
  FROM customer c1
 WHERE c1.visited_on >= (SELECT min(visited_on) FROM customer) + 6
 GROUP BY c1.visited_on;




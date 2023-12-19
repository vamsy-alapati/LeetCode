# Write your MySQL query statement below


SELECT s.user_id, 
    ROUND (ifnull(
        (
            (SELECT COUNT(user_id)
               FROM confirmations
              WHERE user_id = s.user_id
                AND action = 'confirmed') / 
            (SELECT COUNT(user_id)
               FROM confirmations
              WHERE user_id = s.user_id)
        ),0)
    , 2) as confirmation_rate
  FROM signups s;
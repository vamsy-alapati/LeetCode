# Write your MySQL query statement below

# select round(
#     count(a1.player_id)/(select count(distinct a3.player_id) from activity a3)
#     , 2) as fraction
#   from activity a1
#  where (a1.player_id, DATE_SUB(a1.event_date, INTERVAL 1 DAY)) IN (
#     SELECT a2.player_id, min(a2.event_date)
#       from activity a2
#      where a2.player_id = a1.player_id
#      group by a2.player_id
#  );
 
 SELECT
  ROUND(
    COUNT(A1.player_id)
    / (SELECT COUNT(DISTINCT A3.player_id) FROM Activity A3)
  , 2) AS fraction
FROM
  Activity A1
WHERE
  (A1.player_id, DATE_SUB(A1.event_date, INTERVAL 1 DAY)) IN (
    SELECT
      A2.player_id,
      MIN(A2.event_date)
    FROM
      Activity A2
    GROUP BY
      A2.player_id
  );
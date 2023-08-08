# Write your MySQL query statement below


select round(
    (select count(delivery_id) as immediate from delivery where customer_pref_delivery_date = order_date)/
     (select count(*) from delivery) * 100
    , 2) as immediate_percentage
;
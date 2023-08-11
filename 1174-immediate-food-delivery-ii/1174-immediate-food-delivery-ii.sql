# Write your MySQL query statement below


SELECT ROUND(
               (
                   select count(*) 
                    from
                      (
                          select customer_id
                            from delivery
                           group by customer_id 
                          having min(order_date) = min(customer_pref_delivery_date)
                      ) as immediate_first_orders
                ) * 100 / count(distinct customer_id)
            , 2) as immediate_percentage
    from delivery;
                 

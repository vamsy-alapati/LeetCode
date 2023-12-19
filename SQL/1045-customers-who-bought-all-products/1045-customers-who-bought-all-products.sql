# Write your MySQL query statement below

select distinct customer_id from 
(
select customer_id, count(distinct product_key) as products_count
  from customer
 group by customer_id
) as cust_prod_count, product
where products_count = (select count(distinct product_key) from product);
# Write your MySQL query statement below

select s1.name from
SalesPerson s1
where s1.name not in (
  select distinct(s.name)
  from SalesPerson s 
    left join orders o on s.sales_id = o.sales_id
    left join company c on o.com_id = c.com_id
    where c.name = 'RED'
);
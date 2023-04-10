# Write your MySQL query statement below

select u1.name, a.balance from 
(
  select u.account, sum(t.amount) as balance
  from users u, transactions t
  where u.account = t.account
  group by u.account
) as a, users u1
where u1.account = a.account
and a.balance > 10000;
# Write your MySQL query statement below

SELECT 'Low Salary' as category,
       count(account_id) as accounts_count
  FROM accounts
 WHERE income < 20000
UNION ALL 
SELECT 'Average Salary' as category,
       count(account_id) as accounts_count
  FROM accounts
 WHERE income BETWEEN 20000 AND 50000
UNION ALL
SELECT 'High Salary' as category,
       count(account_id) as accounts_count
  FROM accounts
 WHERE income > 50000;
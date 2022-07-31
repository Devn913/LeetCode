# Write your MySQL query statement below
SELECT email from Person GROUP BY email HAVING count(email)>1;
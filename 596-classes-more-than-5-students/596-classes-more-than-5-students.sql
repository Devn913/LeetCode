# Write your MySQL query statement below
SELECT class from Courses GROUP BY class having count(student)>=5;
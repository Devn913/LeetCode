# Write your MySQL query statement below
SELECT player_id,MIN(event_date) As first_login from Activity GROUP BY player_id;
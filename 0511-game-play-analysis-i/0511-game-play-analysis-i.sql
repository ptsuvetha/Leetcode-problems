# Write your MySQL query statement below
SELECT player_id,MIN(event_date) as first_login from Activity group by player_id;
# Write your MySQL query statement below
select   activity_date as day, count( distinct user_id) as active_users from activity
where activity_date <= "2019-07-27"  and activity_date >"2019-06-27" and activity_type in 
("open_session","end_session","scroll_down","send_message")
group by activity_date
;


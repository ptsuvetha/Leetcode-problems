# Write your MySQL query statement be
with firstorders as(
select customer_id,order_date,customer_pref_delivery_date,row_number() over(partition by customer_id order by order_date) as rn
from delivery)

select ROUND(SUM(CASE WHEN order_date = customer_pref_delivery_date THEN 1 ELSE 0 END) * 100.0 / COUNT(*), 2) as immediate_percentage 
from firstorders where rn=1;

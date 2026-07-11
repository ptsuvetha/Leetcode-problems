# Write your MySQL query statement
with cte_name as(
    select product_id,year,quantity,price, 
    Rank() over(partition by product_id order by year) as rnk
    from sales
)
select product_id,year as first_year, quantity, price from cte_name where rnk=1;
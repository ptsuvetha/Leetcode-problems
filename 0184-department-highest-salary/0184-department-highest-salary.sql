# Write your MySQL query statement below
select d.name as Department, e.name as Employee ,e.salary as Salary from (
    select *, rank() over(partition by departmentId order by salary desc ) as rnk from employee e
)e join department d on e.departmentId=d.id where rnk=1;
# Write your MySQL query statement below
Select d.name as Department,e.name as Employee, e.Salary from(
    Select *,rank() over(partition by departmentId order by Salary desc) as rnk from employee e
)e join department d on e.departmentId=d.id where rnk=1;
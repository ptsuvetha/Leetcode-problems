# Write your MySQL query statement below
Update Salary SET sex=
case sex
    when 'f' then 'm'
    else 'f'
end;
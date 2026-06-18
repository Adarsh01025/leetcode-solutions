-- Write your PostgreSQL query statement below
WITH ranked AS(
    SELECT 
        id,
        name,
        departmentId,
        salary,
        DENSE_RANK() OVER(PARTITION BY departmentid ORDER BY salary DESC) as dense_rnk
        FROM employee
) 
SELECT 
    d.name Department,
    r.name Employee,
    r.salary Salary
FROM ranked r
JOIN  department d ON d.id = r.departmentId
WHERE r.dense_rnk <=3;
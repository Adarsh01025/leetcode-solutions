CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
  RETURN QUERY (
    -- Write your PostgreSQL query statement below.
    select cte.salary
    from (select e.salary, dense_rank() over (order by e.salary desc) rank from Employee e) cte
    where cte.rank = n
    limit 1 
      
  );
END;
$$ LANGUAGE plpgsql;
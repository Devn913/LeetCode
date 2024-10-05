SELECT max(Salary) SecondHighestSalary
FROM Employee
WHERE Salary < (SELECT max(Salary) FROM Employee)
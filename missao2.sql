// questão 1
SELECT * FROM `employee` ORDER BY SALARY DESC;

// questão 2 
SELECT Employee_id, First_name, Departement FROM ( SELECT *, ROW_NUMBER() OVER (PARTITION BY Departement ORDER BY First_name) As rn FROM employee) t WHERE rn = 1; 

// questão 3

SELECT AVG(Salary) FROM employee; 

// questão 4 

SELECT * FROM `employee` WHERE SALARY > 5200; 

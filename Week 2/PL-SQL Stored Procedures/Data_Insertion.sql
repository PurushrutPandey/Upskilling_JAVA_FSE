INSERT INTO Accounts VALUES (101, 'Rahul Sharma', 'Savings', 50000);
INSERT INTO Accounts VALUES (102, 'Priya Singh', 'Savings', 25000);
INSERT INTO Accounts VALUES (103, 'Amit Verma', 'Current', 80000);
INSERT INTO Accounts VALUES (104, 'Neha Gupta', 'Savings', 10000);
INSERT INTO Accounts VALUES (105, 'Rohan Mehta', 'Current', 15000);

COMMIT;

INSERT INTO Employees VALUES (1, 'Ankit Jain', 'IT', 60000);
INSERT INTO Employees VALUES (2, 'Sneha Roy', 'HR', 45000);
INSERT INTO Employees VALUES (3, 'Vikas Singh', 'IT', 75000);
INSERT INTO Employees VALUES (4, 'Pooja Sharma', 'Finance', 55000);
INSERT INTO Employees VALUES (5, 'Karan Patel', 'HR', 50000);

COMMIT;

SELECT * FROM Employees;
SELECT * FROM Accounts;
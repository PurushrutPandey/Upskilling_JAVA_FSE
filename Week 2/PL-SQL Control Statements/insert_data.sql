INSERT INTO Customers VALUES (1, 'Rahul', 65, 15000, 'FALSE');
INSERT INTO Customers VALUES (2, 'Anita', 45, 8000, 'FALSE');
INSERT INTO Customers VALUES (3, 'Rohan', 70, 12000, 'FALSE');

INSERT INTO Loans VALUES (101, 1, 8, SYSDATE + 15);
INSERT INTO Loans VALUES (102, 2, 9, SYSDATE + 50);
INSERT INTO Loans VALUES (103, 3, 7, SYSDATE + 20);

COMMIT;

select * from Customers;
select * from Loans;
BEGIN
    FOR cust_rec IN (
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000
    )
    LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = cust_rec.CustomerID;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP status updated.');
END;
/

SELECT * FROM Customers;
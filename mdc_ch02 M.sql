SELECT LastName, FirstName, Phone
FROM customer
WHERE CustomerID IN (
    SELECT CustomerID FROM invoice WHERE TotalAmount > 100.00
)
ORDER BY LastName ASC, FirstName DESC;
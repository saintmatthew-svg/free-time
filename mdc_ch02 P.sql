SELECT LastName, FirstName, Phone
FROM customer
WHERE CustomerID IN (
    SELECT CustomerID FROM invoice
    WHERE CustomerID IN (
        SELECT CustomerID FROM invoice_item WHERE Item = 'Dress Shirt'
    )
)
ORDER BY LastName ASC, FirstName DESC;
SELECT LastName, FirstName, Phone
FROM customer, invoice
WHERE customer.CustomerID = invoice.CustomerID
AND invoice.TotalAmount > 100.00
ORDER BY LastName ASC, FirstName DESC;
SELECT c.LastName, c.FirstName, c.Phone
FROM customer c
JOIN invoice i ON c.CustomerID = i.CustomerID
WHERE i.TotalAmount > 100.00
ORDER BY c.LastName ASC, c.FirstName DESC;
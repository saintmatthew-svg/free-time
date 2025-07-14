SELECT c.LastName, c.FirstName, c.Phone, i.DateIn, i.DateOut
FROM invoice i
JOIN customer c ON i.CustomerID = c.CustomerID
WHERE i.TotalAmount > 100.00;
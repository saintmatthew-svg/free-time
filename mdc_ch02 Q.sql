SELECT LastName, FirstName, Phone
FROM customer, invoice, invoice_item
WHERE customer.CustomerID = invoice.CustomerID
AND invoice.CustomerID = invoice_item.ItemNumber
AND invoice_item.Item = 'Dress Shirt'
ORDER BY LastName ASC, FirstName DESC;
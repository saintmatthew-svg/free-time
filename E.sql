SELECT ShipmentID, ShipperName, ShipperInvoiceNumber, ArrivalDate 
FROM SHIPMENT 
WHERE MONTH(DepartureDate) = 12;
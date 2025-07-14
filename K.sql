SELECT City, Store, COUNT(*) AS NumberOfItems 
FROM ITEM 
GROUP BY City, Store;
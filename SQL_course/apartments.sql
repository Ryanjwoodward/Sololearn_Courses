/* 
Write a query to output the apartments whose prices
are greater than the average and are also not
rented, sorted by Price
*/

SELECT * FROM Apartments WHERE
Price > (SELECT AVG(Price) FROM Apartments)
ORDER BY Price;
/*
A local bakery creates unique cake sets. Each cake
set contains three different cakes.

Write a query to sort the cakes by calorie count and select the
first three cakes from the list to offer the customer
*/

SELECT * FROM Cakes ORDER BY calories LIMIT 3;
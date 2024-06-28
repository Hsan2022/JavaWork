/*
Enter your query below.
Please append a semicolon ";" at the end of the query
*/


-- return a list of all available lots with offers left by buyers
-- result should have the following columns: name | min_offer |avg_offer | max_offer | offers


-- One possible structure
-- select p.product_name, max(quantity_ordered) as max_offer, format(min(quantity_ordered),2) as min_buy_price, format(avg(quantity_ordered),2) as avg_buy_price
-- from products p, orderdetails od
-- where p.id = od.product_id
-- group by od.product_id;



-- select column from first table, rename with alias
SELECT lots.name AS name,
-- use function to count the amnt of offers, rename with alias
       COUNT(offers.amount) AS offers,
-- use function to find the min ammt in offers table, allow only two decimal places to the right, rename with alias
       FORMAT(MIN(offers.amount), 2) AS min_offer,
-- use function to find the max ammt in offers table, allow only two decimal places to the right, rename with alias
       FORMAT(AVG(offers.amount), 2) AS avg_offer,
-- use function to find the max ammt in offers table, allow only two decimal places to the right, rename with alias
       FORMAT(MAX(offers.amount), 2) AS max_offer
-- left join starts by selecting the table on the left
FROM lots
-- left join ends by selectin the table on the right, matching values from both tables
         LEFT JOIN offers ON lots.id = offers.lot_id
-- return from the name column lots table
GROUP BY lots.name
-- order by descending order
ORDER BY offers DESC;
-- s elect * from employees ;

select count(*) as 'count'
from offices o
where o.country = "USA";

-- I want to see all employees that work in an office in the USA


-- alias

select * from enployees;
select * from offices;

select e.*, o.city

-- aliasing/renaming tables
from employees e, offices o

-- Creating a table
where e.office_id - o.id
	and o.country = 'USA';
    
-- let's just start looking at what is in the various tables
-- querying from different tables
select * from orders;
select * from orderdetails;

-- alias, calc tot price
select od, floor(quantity_ordered * price_each) as total_price
from orderdetails od
where order_id = 10103


-- alias, calc tot price

select od.*, (quantity_ordered * price_each) as total_price
from orderdetails od
where order_id = 10103
    
from orderdetails od
where order_id = 10103
orderby order_line_number;

-- add prod name


-- add date of order
select od.*, (quantity_ordered * price_each) as total_price, p.product_name, o.order_date
from orderdetails od, products p, orders o
where orders_id = 10103
	and p.id = od.product_id
    and o.id = od.order_id

	and p.id = od.product_id
order by order_line_number;


    
-- add customer name
select od.*, (quantity_ordered * price_each) as total_price, p.product_name, o.order_date, c.customer_name
from orderdetails od, products p, orders o,customers 
where orders_id = 10103
	and p.id = od.product_id
    and o.id = od.order_id
    
    select * from employees;
    -- aggragate funcs
			-- To sum all lines items for order 10103
    select sum(quantity_ordered * price_each) as total_order_cost,
    max(quantity_orderered * price_each) as total_order_cost,
    min(quantity_ordered) as min_quantity_ordered, 
    avg(quantity_ordered * price_each) as average_line_item_cost,
    avg(quantity_ordered) as avg_quantity_ordered
    from orderdetails od
    where order_id = 10103;
    
    select od.*, (quality_ordered * price_each) as total_price
    from orderdetails od
    where order_id = 10103;
    
    
    -- do groupby on table
    -- select all columns from table
    select * from orderdetails;
    -- 
    select order_id, sum(quantity_ordered * price_each) as total_cost,
		min(quantity_ordered) as min_qty_ordered,
        count(*) as numbeer_of_products
        from orderdetails
        group by order_id

-- find ammt ea cust has spent
	select c.customer_name, o.od as order_id
    from customers c, orders o
    where c.id = o.customer_id
    order by customer_name;
    
    -- step 2 keep joining order details table
    select c.customer_name, o.od as order_id
    from customers c, orders o, orderdetails od
    where c.id = o.customer_id
    order by customer_name, order_id;
    
    -- step 3 add calc line, do group by
    select c.customer_name, o.od as order_id, od.product_id, quantity_ordered, (price_ordered * price_each) as line_item_cost
    from customers c, orders o, orderdetails od
    where c.id = od.customer_id
    order by customer_name, order_id;
    
	-- step 4 is add the group by
    -- removing no longer appearing columns in group by and select
    -- customer is singular and group by so can use customer namw
    select c.id, c.customer_name, sum(quantity_ordered * price_each) as total_customer_spend
    from customers c, orders o, orderdetails od
    where c.id = o.customer_id
		and o.id = od.order_id
    group by c.id
    order by total_customer_spend desc;
    
    -- step 5 
    -- added an order Id to see total cost for all customer
    -- can inc order id in select column because it is in the groupby
    select c.id, c.customer_name, o.id as order_id, sum(quantity_ordered * price_each) as total_customer_spend
    from customers c, orders o, orderdetails od
    where c.id = o.customer_id
		and o.id = od.order_id
    group by c.id, o.id
    order by c.customer;
    
    
    
    
    
    

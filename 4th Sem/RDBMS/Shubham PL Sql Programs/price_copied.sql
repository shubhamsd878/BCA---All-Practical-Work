declare
selling_price product_master.Product_no%type;

begin
select sell_price into selling_price from product_master where product_no = 'P00001';

if selling_price < 4000 then

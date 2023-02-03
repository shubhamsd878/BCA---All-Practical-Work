/* 	Write a PL/SQL block of cod to achieve the following: If the price of product ‘P00001’ is less than 4000, then change the price to 4000. The price change is to be recorded in the old_price_table along with the product_no and the date on which the price was last changed.      */

declare
product_noo product_master.product_no%type;
product_pricee product_master.sell_price%type;
old_price number(6);

begin

product_noo := '&product_noo';

select sell_price into old_price from product_master where product_no = product_noo;

dbms_output.put_line('old_price: ' || old_price);

if old_price < 4000 then
goto lessthen;

else
insert into product_master values(product_noo, product_pricee);


end if;

<<lessthen>>

	update product_master set sell_price = 4000 where product_no = product_noo;

	insert into old_price_table values(product_noo, sysdate, old_price);

	dbms_output.put_line(' the price of product is 4000');

end;
declare
c_id customers.id%type;
c_name customers.name%type;
c_address customers.address%type;

cursor mycursor is select id, name, address from customers;

begin

open mycursor;

loop

fetch mycursor into c_id, c_name, c_address;
exit when mycursor%notfound;

dbms_output.put_line('id: ' || c_id ||'   name: ' || c_name || '   address: ' || c_address );

end loop;

close mycursor;
end;
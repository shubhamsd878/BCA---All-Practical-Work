begin

update customers set salary = salary + 500;


if sql%notfound then
dbms_output.put_line('no records updated');

elsif sql%found then
dbms_output.put_line( sql%rowcount || ' rows updated');

end if;

end;
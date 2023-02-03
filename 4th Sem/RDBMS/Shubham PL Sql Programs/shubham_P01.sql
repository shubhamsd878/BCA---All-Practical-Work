-- program to find largest among three
declare
a number;
b number;
c number;

begin
a := &a;
b := &b;
c:= &c;

dbms_output.put_line(' ----- ---- --- -- ');

if a>b then
	if a>c then
	dbms_output.put_line('a is greatest');
	else
	dbms_output.put_line('c is greatest');
	end if;
	
else
	if b>c then
	dbms_output.put_line('b is greatest');
	else
	dbms_output.put_line('c is greatest');
	end if;
end if;


end;
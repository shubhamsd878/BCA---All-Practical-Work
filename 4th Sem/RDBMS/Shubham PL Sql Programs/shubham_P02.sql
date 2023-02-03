--program to print 1 to 10 using while loop
declare
i number;

begin
i := 1;

while i<=10
loop
	dbms_output.put_line(i);
	i:= i+1;
end loop;

end;
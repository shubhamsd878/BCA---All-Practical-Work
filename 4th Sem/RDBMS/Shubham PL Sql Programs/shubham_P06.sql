--program to print if number is positive or negative
declare
num number;

begin
num := &num;
if num > 0 then
	dbms_output.put_line( ' num is positive');
else
	dbms_output.put_line( ' num is negative');

end if;
end;
/
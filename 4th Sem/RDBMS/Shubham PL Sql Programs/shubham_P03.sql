--program to print factorail of a number 
declare 
num number;
result number;

begin
result := 1;
num := &num;

while num > 0
loop
	result := result * num;
	num := num - 1;
end loop;

dbms_output.put_line('----------------------------------');

dbms_output.put('factorial: ');

dbms_output.put_line(result);

end;
--Program to print if number is even or odd using goto statment;
declare
num number;

begin
num := &num;

if mod(num,2) = 0 then
	goto even;
else
	goto odd;
end if;

<<even>>
dbms_output.put_line('num is even');
goto programend;

<<odd>>
dbms_output.put_line('num is odd');

<<programend>>
dbms_output.put_line('----------------------');

end;
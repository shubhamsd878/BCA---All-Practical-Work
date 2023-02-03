create or replace trigger salarydifference before delete or insert or update on customers for each row

declare

sal_diff number(7);

begin

sal_diff := :NEW.salary - :OLD.salary;

dbms_output.put_line('old salary: ' || :OLD.salary);
dbms_output.put_line('new salary: ' || :NEW.salary);
dbms_output.put_line('salary difference: ' || sal_diff);

end;
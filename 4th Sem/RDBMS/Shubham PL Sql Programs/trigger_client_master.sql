create or replace trigger myFirstTrigger after update or delete or insert on client_master for each row;

declare

oper varchar2(8);
client_no varchar2(10);
name varchar2(10);
bal_due number(6);

begin
if updating then
oper := 'update'
end if;

if deleting then 
oper := 'delete
end if;

client_no := old.client_no;
name:= old.client_name;

end;

/* Write a PL/SQL code block that will accept an account number from the user and debit an amount of Rs. 2000 from the account if the account has a minimum balance of 500 after the amount is debited. The process is to be fired on the Accounts table.*/

declare
acc_no accounts.acc_id%type;
balance accounts.balance%type;

begin
acc_no := '&acc_no';

select balance into balance from accounts where acc_id = acc_no;

if balance >=2500 then
update accounts set balance = balance - 2000 where acc_id = acc_no;
dbms_output.put_line('Rs.2000 debited from Acc_Id: ' || acc_no );

else
dbms_output.put_line('amount not debited. Account balance must be above Rs.2500');

end if;

end;


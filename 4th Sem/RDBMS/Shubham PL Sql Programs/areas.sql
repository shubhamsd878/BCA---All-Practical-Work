/* Write a PL/SQL code block to calculate the area of a circle for a value of radius varying from 3 to 7. Store the radius and the corresponding values of calculated area in a table, Areas. */

declare

pi constant number(4,2) := 3.14;
r areas.radius%type;
a areas.area%type;

begin

r:= 3;

while r<=7
loop

a := pi * power(r, 2);

insert into areas values(r, a);

r:= r+1;
end loop;

end;
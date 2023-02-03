// WAP to calculate mark sheet of a student (marks in between 80-100 then Grade A, marks in between 70-80 then Grade B, marks in between 60-70 then Grade C, less than 60 then Grade D) 
#include<stdio.h>
#include<conio.h>
int main(){
int marks;
printf("Enter marks: ");
scanf("%d",&marks);

if(marks>=80)
printf("Grade: A");

else if(marks>=70)
printf("Grade: B");

else if(marks>=60)
printf("Grade: C");

else
printf("Grade: D");


return 0;
}
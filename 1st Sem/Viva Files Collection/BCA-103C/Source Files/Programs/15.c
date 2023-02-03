// WAP to check leap year or not
#include<stdio.h>
#include<conio.h>
int main(){
int a;
printf("\nEnter a  year: ");
scanf("%d",&a);
if (a%4 == 0){
    printf("\nEntered year is leap year");
}
else
printf("\nEntered year is not a leap year");


return 0;
}
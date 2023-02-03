// WAP to swap the values of two variables without using third variable
#include<stdio.h>
#include<conio.h>
int main(){
int a,b;
printf("\nEnter value of a:");
scanf("%d",&a);
printf("\nEnter value of b:");
scanf("%d",&b);

a=a+b;
b=a-b;
a=a-b;

printf("\nAfter swap value of a = %d\nAfter swap value of b = %d",a,b);

return 0;
}
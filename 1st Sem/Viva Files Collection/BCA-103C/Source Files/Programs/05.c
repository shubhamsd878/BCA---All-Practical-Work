// WAP to find average of three numbers
#include<stdio.h>
#include<conio.h>
int main(){
int a, b, c;
float avg;
printf("\nEnter three numbers: ");
scanf("%d %d %d",&a, &b, &c);
avg= ( a + b + c )/3;

printf("\nThe avg of %d %d %d is= %f",a,b,c,avg);


return 0;
}
//WAP to add, subtract, multiply, divide 2 numbers.
#include<stdio.h>
#include<conio.h>

void main(){
int a, b;
printf("Enter two numbers: ");
scanf("%d %d",&a, &b);
printf("\na=%d, b=%d\n",a,b);
printf("%d + %d = %d\n", a, b, a+b);
printf("%d - %d = %d\n", a, b, a-b);
printf("%d * %d = %d\n", a, b, a*b);
printf("%d / %d = %d\n", a, b, a/b);


// return 0;
}
// WAP to swap the values of two variables by using third variable
#include<stdio.h>
#include<conio.h>
int main(){
int a,b,temp;
printf("\nEnter value of a:");
scanf("%d",&a);
printf("\nEnter value of b:");
scanf("%d",&b);

printf("\nvalue of a= %d \n vlaue of b= %d\n",a,b);
temp=a;
a=b;
b=temp;
printf("After swap value of a= %d\n After swap value of b=%d",a,b);


return 0;
}
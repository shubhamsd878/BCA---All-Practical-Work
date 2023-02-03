// WAP to check whether entered number is positive or negative
#include<stdio.h>
#include<conio.h>
int main(){
int a;
printf("\nEnter a number: ");
scanf("%d",&a);

if (a<0){
    printf("\n%d is negative",a);
}
if (a==0)
printf("\nEntered number is 0");

if (a>0){
printf("\nEntered number is positive");
}
printf("\nEntered number = %d",a);

return 0;
}
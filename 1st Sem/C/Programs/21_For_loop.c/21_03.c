// Multiply positive number without using * operator
#include<stdio.h>
#include<conio.h>
int main(){
int a,b,mult=0;
printf("Enter two numbers to be multiplied: ");
scanf("%d %d",&a,&b);
for(int i=1;i<=b;i++){
    mult=mult+a;
}
printf("Calculated Multiplication of %d and %d is %d",a,b,mult);

return 0;
}
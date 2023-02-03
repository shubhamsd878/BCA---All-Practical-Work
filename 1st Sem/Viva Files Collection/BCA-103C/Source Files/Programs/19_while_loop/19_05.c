//  Factorial
#include<stdio.h>
#include<conio.h>
int main(){
int a,fact,num;
printf("Enter number to find factorial: ");
scanf("%d",&a);
num=a;
fact=1;
while(num>0){
    fact=fact*(num);
    num=num-1;
    
}
printf("factorial of %d is = %d",a,fact);

return 0;
}
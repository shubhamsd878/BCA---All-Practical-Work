//Sums of digits of number
#include<stdio.h>
#include<conio.h>
int main(){
int a,temp,sum=0,num;
printf("Enter any number: ");
scanf("%d",&a);
temp=a;
num=a;
do{
    temp=num%10;
    sum=sum+temp;
    num= num/10;
}while(num>0);
printf("sum of digits of %d is = %d",a,sum);


return 0;
}
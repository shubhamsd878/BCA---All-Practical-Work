// Sum of digits
#include<stdio.h>
#include<conio.h>
int main(){
int a,temp,sum=0,num;
printf("Enter any number: ");
scanf("%d",&a);
num=a;
while(temp>0){
    temp= a%10;
    a=a/10;
    sum=sum+temp;
}
printf("The sum of digits of entered number %d is %d",num,sum);


return 0;
}
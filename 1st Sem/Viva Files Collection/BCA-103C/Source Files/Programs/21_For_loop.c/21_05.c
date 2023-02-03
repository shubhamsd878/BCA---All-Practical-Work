// Sum of digit any number
#include<stdio.h>
#include<conio.h>
int main(){
int a,temp,sum=0,num;
printf("Enter any number: ");
scanf("%d",&a);
temp=a;
num=a;

for(a;a>0;a=a/10) {
    temp=a%10;
    sum=sum+temp;
    
}
printf("Sum of digits of number %d is = %d",num,sum);

return 0;
}
// Count the digits in any number
#include<stdio.h>
#include<conio.h>
int main(){
int a,num,count=0;
printf("Enter any number: ");
scanf("%d",&a);
// num=a;
do{
    // num= a%10;
    a=a/10;
    count++;

}while(a>0);
printf("No. of digits in number %d is %d",num,count);

return 0;
}
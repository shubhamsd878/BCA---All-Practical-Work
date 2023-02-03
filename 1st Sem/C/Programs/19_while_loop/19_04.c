// Product of digits
#include<stdio.h>
#include<conio.h>
int main(){
int a,temp,num,mult=1;
printf("\nEnter any Number: ");
scanf("%d",&a);
num=a;
while(a>0){
    temp=a%10;
    mult=mult*temp;
    a=a/10;
}
printf("\nMultiplication of digits of %d is = %d",num,mult);

return 0;
}
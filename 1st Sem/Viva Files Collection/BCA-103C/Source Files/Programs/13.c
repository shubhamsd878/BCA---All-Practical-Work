// WAP to print whether the number is even or odd
#include<stdio.h>
#include<conio.h>
int main(){
int a;
printf("\nEnter a number: ");
scanf("%d",&a);
// if(a==1)
// printf("\nEntered number is odd");
if(a%2==1){
    printf("\nEntered number is odd");
}
else
printf("\nEntered number is even");

printf("\nEntered number= %d",a);


return 0;
}
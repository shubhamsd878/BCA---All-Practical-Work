// WAP to print the larger and smaller of the two numbers
#include<stdio.h>
#include<conio.h>
int main(){
int a,b;
printf("Enter two number: ");
scanf("%d %d",&a,&b);
if(a>b)
printf("value of a = %d",a);
else if(b>a)
printf("value of b = %d",b);
else if(a==b){
    printf("a=b=%d",a);
}

return 0;
}
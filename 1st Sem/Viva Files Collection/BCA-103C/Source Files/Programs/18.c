// WAP to relate two numbers using =, > or < symbol
#include<stdio.h>
#include<conio.h>
int main(){
int a,b;
printf("Enter two number: ");
scanf("%d %d",&a,&b);
if(a>b)
printf("%d > %d",a,b);

else if(a<b)
printf("%d < %d",a,b);

else if(a=b)
printf("%d = %d",a,b);


return 0;
}
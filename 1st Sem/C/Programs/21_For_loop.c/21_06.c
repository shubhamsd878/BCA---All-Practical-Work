// Fibonacii series
#include<stdio.h>
#include<conio.h>
int main(){
int fib, fib1=0,fib2=1,n;
printf("Enter count limit for fibonacii series:" );
scanf("%d",&n);
printf("%d\n",fib1);
printf("%d\n",fib2);
// count=2;
for(int count=2; count<=n;count++){
    fib=fib1+fib2;
    fib1=fib2;
    fib2=fib;
    printf("%d\n",fib);
    // count++;
}


return 0;
}
// Sum of this series up to n terms
#include<stdio.h>
#include<conio.h>
int main(){
int fib,n,fib1,fib2,count,sum=0;
printf("Enter no. of terms of Fibonacii series: ");
scanf("%d",&n);
fib1=0;
fib2=1;
// n=10;
printf("%d\n",fib1);
printf("%d\n",fib2);
for(count=2;count<=n;count++){
    fib=fib1+fib2;
    fib1=fib2;
    fib2=fib;
    printf("%d\n",fib);
    sum=sum+fib;
}

printf("Sum of first %d terms of fibonacii series is %d",n,sum);
return 0;
}
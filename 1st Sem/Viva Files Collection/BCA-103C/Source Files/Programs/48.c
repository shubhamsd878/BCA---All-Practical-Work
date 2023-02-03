#include <stdio.h>
#include <conio.h>
int largestNumber(int a,int b ,int c);//function prototype
int main()
{
    int a,b,c;
    printf("Enter the three numbers\n");
    scanf("%d%d%d",&a,&b,&c);

    int result=largestNumber(a,b,c);//function call
    printf("Biggest number is: %d\n",result);

    getch();
    return 0;
}
int largestNumber(int a,int b,int c){//function definition with parameter
if(a>b)
{
    if(a>c)
    return a;
    else
        return c;
}
else
{
    if(b>c)
        return b;
    else
        return c;
}
}
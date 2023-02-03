// WAP to compare greatest among three numbers
#include<stdio.h>
#include<conio.h>
int main(){
int a,b,c;
printf("\nEnter three numbers: ");
scanf("%d %d %d",&a, &b, &c);

if(a>b){
    if(a>c)
    printf("\na = %d is greates among three",a);
    else
    printf("\nc = %d is greates among three",c);
}

else{
    if(b>c)
    printf("\nb = %d is greates among three",b);
    else
    printf("\nc = %d is greates among three",c);
}



return 0;
}
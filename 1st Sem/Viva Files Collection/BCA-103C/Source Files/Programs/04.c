// WAP to find the area and perimeter of a circle
#include<stdio.h>
#include<conio.h>
int main(){
int r,pi=3.14 , area, perimeter;

printf("\nEnter radius of Circle = ");
scanf("%d",&r);

area= pi*r*r;
perimeter= 2*pi*4;

printf("\nCalculated Area of circle= %d",area);
printf("\nCalculated Perimeter of circle= %d",perimeter);


return 0;
}
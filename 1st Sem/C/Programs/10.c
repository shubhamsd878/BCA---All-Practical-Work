// WAP to calculate area of a cylinder.
#include<stdio.h>
#include<conio.h>
int main(){
                                     //Area of cylinder= 2*pi*r*h + 2*pi*r*r
int r,h,area;
float pi=3.14;

printf("Enter radius of Cylinder: ");
scanf("%d",&r);

printf("Enter height of Cylinder: ");
scanf("%d",&h);

area= (2*pi*r*h) + (2*pi*r*r);

printf("Calculate area of cylinder = %d",area);



return 0;
}       
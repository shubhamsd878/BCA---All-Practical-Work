// WAP to find the area of triangle, rectangle and square
#include <stdio.h>
#include <conio.h>
int main()
{
    //Area of triangle
    int b,h,area;
    
    printf("\nEnter base of triangle : ");
    scanf("%d", &b);

    printf("\nEnter height of triangle : ");
    scanf("%d", &h);
    
    area= (b*h)/2;
    printf("\nCalcualted area of rectangle is: %d",area);

    return 0;
}
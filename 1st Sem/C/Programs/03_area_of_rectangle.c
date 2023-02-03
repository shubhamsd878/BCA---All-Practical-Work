// WAP to find the area of triangle, rectangle and square
#include <stdio.h>
#include <conio.h>
int main()
{
    //Area of rectangle
    int l,b,area;
    
    printf("\nEnter length : ");
    scanf("%d", &l);

    printf("\nEnter breadth : ");
    scanf("%d", &b);

    area=l*b;
    printf("\nCalcualted area of rectangle is: %d",area);

    return 0;
}
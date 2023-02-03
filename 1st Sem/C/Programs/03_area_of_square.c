// WAP to find the area of triangle, rectangle and square
#include <stdio.h>
#include <conio.h>
int main()
{
    //Area of square
    int a,area;
    
    printf("\nEnter length of any side of square: ");
    scanf("%d", &a);

    area=a*a;
    printf("\nCalcualted area of square is: %d",area);

    return 0;
}
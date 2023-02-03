//Pyramid
#include <stdio.h>
#include <conio.h>
int main()
{
    int i, j, n;
    printf("Enter no. of lines to be printed in pyramid: ");
    scanf("%d", &n);
    for (i = 1; i <= n; i++){
        for (j = 1; j <= i; j++)
            if((i+j)%2==0){
                printf("0 ");
            }
            else
            printf("1 ");
        printf("\n");
    }

    return 0;
}
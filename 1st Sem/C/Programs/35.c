// Matrix read and write
#include <stdio.h>
#include <conio.h>
int main()
{
    int arr[3][3], i, j;
    printf("\nEnter matrix of order 3 x 3 row wise: ");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }
    printf("The array you entered: \n");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
            printf("\t%d\t", arr[i][j]);
        printf("\n");
    }

    return 0;
}
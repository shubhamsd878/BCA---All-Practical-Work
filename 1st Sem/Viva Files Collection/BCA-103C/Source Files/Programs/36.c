// Matrix transpose
#include <stdio.h>
#include <conio.h>
int main()
{
    int arr[3][3], i, j, temp;
    printf("\nEnter matrix of order 3 x 3 row wise: ");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            scanf("%d", &arr[i][j]);
        }
        // printf("\n");
    }
    //printing matrix before transpose
    printf("\nMatrix before transpose: \n");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
            printf("\t%d\t", arr[i][j]);
        printf("\n");
    }
    // Simply printing matrix values by swapping i to j
       printf("\nMatrix after transpose: \n");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
            printf("\t%d\t", arr[j][i]);
        printf("\n");
    }

    
    
    // //swapping values to obtain transpose
    // for (j = 0; j < 3; j++)
    // {
    //     for (i = 0; i < 3; i++)
    //     {
    //         temp = arr[i][j];
    //         arr[i][j] = arr[j][i];
    //         arr[j][i] = temp;
    //     }
    // }
    
    
    // printf("\nMatrix after transpose: \n");
    // for (j = 0; j < 3; j++)
    // {
    //     for (i = 0; i < 3; i++)
    //         printf("\t%d\t", arr[j][i]);
    //     printf("\n");
    // }

    return 0;
}
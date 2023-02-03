// Multiplication of Matrices

#include <stdio.h>
#include <conio.h>
int main()
{
    int matrix1[3][3], matrix2[3][3], mult[3][3], i, j, k;
    printf("\nEnter 1st Matrix of order 3 : ");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            scanf("%d", &matrix1[i][j]);
        }
    }
    printf("\nEnter 2nd Matrix of order 3: ");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            scanf("%d", &matrix2[i][j]);
        }
    }

       //muliplying matrices 
    
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            mult [i][j] = 0;
            for (k = 0; k < 3; k++)
            {
                mult[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
    }
    // printing multiplicatiton matrix :
    printf("\nMatrix 1st  x  Matrix 2 :\n");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("%d", mult[i][j]);
            printf("\t");
        }
        printf("\n");
    }

    return 0;
}
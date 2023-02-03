// Addition of Matrix
#include<stdio.h>
#include<conio.h>
int main(){
    int matrix1[3][3], matrix2[3][3],add[3][3], i, j;
    printf("\nEnter 1st Matrix of order 3 : ");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++){
            scanf("%d", &matrix1[i][j]);
        }
    }
    printf("\nEnter 2nd Matrix of order 3: ");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++){
            scanf("%d", &matrix2[i][j]);
        }
    }
    //printing addiion of two matrices directly
    printf("\nThe addition of 1st and 2nd matrix: \n");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++){
            printf("%d", matrix1[i][j] + matrix2[i][j]);
            printf("\t");
        }
        printf("\n");
    
    }
    
    


return 0;
}
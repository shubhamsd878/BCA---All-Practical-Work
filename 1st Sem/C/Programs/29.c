// Array read and write from user
#include <stdio.h>
#include <conio.h>
int main()
{
    int a[10];
    printf("Enter 10 array variables: ");

    for (int i = 0; i < 10; i++)
    {
        scanf("%d\n", &a[i]);
    }

    for (int i = 0; i < 10; i++)
    {
        printf("%d\n", a[i]);
    }
    // printf("%d",a);

    return 0;
}
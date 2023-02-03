//Reverse of Array
#include <stdio.h>
#include <conio.h>
int main()
{
    int a[10], s, e, temp;
    int b[10];
    printf("Enter 10 array values: ");
    s = 0;
    e = 10;
    for (int i = 0; i < 10; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("a string: \n");
    for (int i = 0; i < 10; i++)
    {
        printf("%d\n", a[i]);
    }
    for (int i = 0; i < 10; i++)
    {
        b[i] = a[i];
    }
    for (int i = 0; i < 10; i++)
    {
        temp = a[s];
        a[s] = b[e];
        b[e] = temp;
        s++;
        e--;
    }

    for (int i = 0; i < 10; i++)
    {
        printf("%d\n", b[i]);
    }

    return 0;
}

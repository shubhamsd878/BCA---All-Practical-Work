// Simple Calculator
#include <stdio.h>
#include <conio.h>
int calc(int a, char op, int b)
{
    float result;
    switch (op)
    {
    case '+':
        result = a + b;
        break;

    case '-':
        result = a - b;
        break;

    case '*':
        result = a * b;
        break;

    case '/':
        result = a / b;
        break;

    default:
        printf("Invalid operator");
    }
    return result;
}

int main()
{
    int a, b;
    float result;
    char op;
    printf("\n\t***Welcome to Simple Calculator***\n");
    printf("\nEnter number1, operator(+,-,/,*) and number2 :");
        scanf("%d %c %d", &a, &op, &b);
    result = calc(a, op, b);
    printf("\n %d %c %d = %.2f", a, op, b, result);

    return 0;
}
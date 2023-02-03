// Print address of variable using address operator
#include <stdio.h>
#include<conio.h>


int main() {
  int a;
  int *pt;

  printf("Pointer  Program : Print Pointer Address\n");
  a = 10;
  pt = &a;

  printf("\n[a  ]:Value of A = %d", a);
  printf("\n[*pt]:Value of A = %d", *pt);
  printf("\n[&a ]:Address of A = %p", &a);
  printf("\n[pt ]:Address of A = %p", pt);
  printf("\n[&pt]:Address of pt = %p", &pt);
  printf("\n[pt ]:Value of pt = %p", pt);
  
  return 0;
}
// WAP to calculate simple interest
#include<stdio.h>
#include<conio.h>
int main(){
int p,t;
float r,SI;
printf("\nEnter Principal Amount= \n");
scanf("%d",&p);
printf("\nEnter time in years = \n");
scanf("%d",&t);
printf("\nEnter rate of interest= \n");
scanf("%f",&r);
SI=(p*r*t)/100;
printf("\nCalculated Simple Interest: %f\n",SI);



return 0;
}
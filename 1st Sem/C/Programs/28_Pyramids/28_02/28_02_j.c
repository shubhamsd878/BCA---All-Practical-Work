//Pyramid
#include<stdio.h>
#include<conio.h>
int main(){
int i,j,n;
printf("Enter no. of lines in pyramid to print: ");
scanf("%d",&n);
for (i=n;i>=1;i--){
    for (j=i;j>=1;j--){
        printf("%d ",i);
    }
    printf("\n");
}


return 0;
}
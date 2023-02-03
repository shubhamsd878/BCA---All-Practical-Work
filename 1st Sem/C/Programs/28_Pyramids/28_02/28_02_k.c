//Pyramid
#include<stdio.h>
#include<conio.h>
int main(){
int i,j,n,m;
printf("Enter no. of lines in pyramid to print: ");
scanf("%d",&n);
for (i=n;i>=1;i--){
    m=1;
    for (j=i;j>=1;j--){
        // printf("%d ",n+1-j);
        printf("%d ",m);
        m++;
    }
    printf("\n");
}


return 0;
}
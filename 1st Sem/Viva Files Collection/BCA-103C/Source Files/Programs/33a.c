// Sum of array
#include<stdio.h>
#include<conio.h>
int main(){
int arr[10], sum=0;
printf("Enter 10 array variables: ");
for(int i=0;i<10;i++){
    scanf("%d",arr[i]);
}
for(int i=0; i<10;i++){
    sum=sum+arr[i];
}
printf("\nThe sum of array variable is: %d",sum);

return 0;
}
// Finding the particular value of array
// Important program also no solution for "no element found"
#include<stdio.h>
#include<conio.h>
int main(){
int arr[20],i,search;
printf("\nEnter array elements: ");
for (i=0;i<20;i++)
    scanf("%d",&arr[i]);
printf("\nEnter array element you want to search: ");
scanf("%d",&search);
for(i=0;i<20;i++){
    if(arr[i]==search){
     printf("\nElement %d found at location %d",arr[i-1],++i);
    break;
    }
    
    
}
return 0;
}
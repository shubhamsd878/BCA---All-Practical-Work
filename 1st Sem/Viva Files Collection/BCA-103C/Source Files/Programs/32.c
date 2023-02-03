// Smallest number in array
#include<stdio.h>
#include<conio.h>
int main(){
int arr[10];
int min;
printf("Enter 10 array values: ");
    for (int i = 0; i < 10; i++)
    {
        scanf("%d", &arr[i]);
    }
min=arr[0];
for(int i=0;i<10;i++){
    if(min>arr[i]){
    min=arr[i];
    }
}
printf("Minimum array is %d\n",min);

return 0;
}
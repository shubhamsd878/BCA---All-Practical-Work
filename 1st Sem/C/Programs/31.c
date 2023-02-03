// Finding largest in array
#include<stdio.h>
#include<conio.h>
int main(){
int arr[10];
int max;
printf("Enter 10 array values: ");
    for (int i = 0; i < 10; i++)
    {
        scanf("%d", &arr[i]);
    }
max=arr[0];
for(int i=0;i<10;i++){
    if(max<arr[i]){
    max=arr[i];
    }
}
printf("largest array is %d\n",max);

return 0;
}
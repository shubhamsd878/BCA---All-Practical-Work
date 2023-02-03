//misbehave
#include<iostream>
using namespace std;

void linearSearch(int arr[],int  n,int  target)
{
    for(int i=0; i<n; i++)
    {
        if(arr[i]==target)
        cout << target+ " is at index " +i;
    }
}

int main()
{
    int n;
    cout<<"Enter length of array: ";
    cin>>n;
    int arr[n];
    cout<<"\n Input array: ";
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    cout<<"Enter element to search: ";
    int target;
    cin >> target;
    linearSearch(arr, n, target);
    return 0;
}
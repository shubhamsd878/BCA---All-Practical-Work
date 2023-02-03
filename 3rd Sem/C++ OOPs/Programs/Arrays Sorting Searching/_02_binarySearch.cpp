#include<iostream>
using namespace std; 
int binarySearch(int arr[],int n,int target)
{
    int start=0, end=n;
    for(int i=0;i<n/2;i++)
    {
        int mid=(start+end)/2;    
        if(mid==target){
            return i;
        }
        else if(target>mid)
        start=mid+1;
        else
        end=mid-1;
    }
    return -1;
}

int main()
{
    cout<<"Enter length of array: ";
    int n;
    cin>>n;

    int arr[n];
    cout<<"Input Array: ";
    for(int i=0; i<n ;i++){
        cin >> arr[i];
    }

    int target;
    cin>>target;
    
    cout << target+ "is at index:" +binarySearch(arr, n, target); 
    // int faltu;
    // cin>>faltu;
    return 0;
}
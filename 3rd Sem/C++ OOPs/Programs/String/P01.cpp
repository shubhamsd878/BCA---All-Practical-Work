#include<iostream>
using namespace std; 
int main()
{
    char str[100];
    cout<<"input string: ";
    cin>>str;
    
    int i=0;
    while(str[i] != NULL){
        cout<< str[i] <<endl;
        i++;
    }

    return 0;
}
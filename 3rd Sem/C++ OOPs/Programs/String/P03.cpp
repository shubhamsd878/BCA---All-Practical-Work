#include<iostream>
using namespace std; 
class strings{
    public: 
    int returnLength(char str[100]){
        int length = 0;
        for(int i = 0; str[i] != NULL; i++){
            length++;
        }
        return length;
    }

};
int main()
{
    strings obj1;

    char str[100];
    cout<<"enter string: ";
    cin >> str;
    
    cout<<str << endl;
    cout<< obj1.returnLength(str) <<endl;
    return 0;
}
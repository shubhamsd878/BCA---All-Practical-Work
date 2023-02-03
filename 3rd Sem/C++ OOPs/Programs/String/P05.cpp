// reverse not printting
#include<iostream>
using namespace std; 
class strings{
    public: 
    int returnLength(char str[]){
        int length = 0;
        for(int i = 0; str[i] != NULL; i++){
            length++;
        }
        return length;
    }

    void  stringReverse(char str1[]) {
        char str2[100];
        for(int i=0; i < returnLength(str1) ; i++){
            str2[i] = str1[returnLength(str1) - i];
        }
        
        cout<<"String Reverse: ";
        cout<< str2;
        int i=0;
        while(str2[i] != NULL){
            cout << str2[i];
            i++;
        }
    }

   void checkIfPalindrome(char str[]){
       int i=0;
       while(str[i] != NULL){
           if(str[i] != str[returnLength(str) - 1 - i]){        //-1 is important as size is greater than index by 1
               cout<<"Given string is not palindrome!!"<<endl;
               return;
           }
           i++;
       }
       cout<<"Given string is palindrome"<<endl;
   }
};

int main()
{
    strings obj1;

    char str1[100], str2[100];
    cout<<"enter string: ";
    cin >> str1;
    
    cout<<str1 << endl;
    cout<< obj1.returnLength(str1) <<endl;
    // obj1.stringReverse(str1);

    obj1.checkIfPalindrome(str1);

    return 0;
}
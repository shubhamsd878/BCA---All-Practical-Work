
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
            str2[i] = str1[returnLength(str1) - 1 -i];          //-1 important to use length  as index
        }
        
        cout<<"String Reverse: ";
        cout<< str2 <<endl;
        
    }

   void checkIfPalindrome(char str[]){
       int i=0;
       while(str[i] != NULL){
           if(str[i] != str[returnLength(str) - 1 - i]){        
               cout<<"No! Given string is not palindrome!!"<<endl;
               return;
           }
           i++;
       }
       cout<<"Yes! Given string is palindrome"<<endl;
   }

   void isCharPresent(char str[]){
        cout<<"input character to search: "<<endl;
        char c;
        cin>> c;
        int i=0;
        while(str[i] != NULL){
            if( c == str[i]){
                cout<<"Yes! '"<<c<<"' is present in given string" <<endl;
                return;
            }
            i++;
        }
        cout<<"character not present";
   }
   void noOfVowels(char str[]){
       int n=0;
       int i=0;
       while(str[i] != NULL){
           if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' ){
               n++;
           } 
           i++;
       }
       cout << " no. of vowels present in string: " << n;
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

    obj1.isCharPresent(str1);
    obj1.stringReverse(str1);
    obj1.checkIfPalindrome(str1);
    obj1.noOfVowels(str1);

    return 0;
}
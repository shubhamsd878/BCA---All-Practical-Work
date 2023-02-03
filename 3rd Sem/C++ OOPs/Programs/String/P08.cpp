// consonant special symbol

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

  
   void countCharacterType(char str[]){
     int vowel=0, consonant=0, digit=0, whiteSpace =0, specialSymbol =0 ;

    int i=0;
    while(str[i] != NULL){
        if( ( int(str[i]) >= 65 && int(str[i]) <= 90 ) || ( int(str[i]) >= 97 || int(str[i]) <=122) ){
            if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U' ){
                vowel++;
            }
            else{
                consonant++;
            } 
        }
        if( int(str[i]) >= 48 && int(str[i]) <= 60 ) {
            digit++;
        }

        if(int(str[i]) == 32){
            whiteSpace++;
        }

        if(( int(str[i]) >= 34 && int(str[i]) <=64 ) || ( int(str[i]) >=91 && int(str[i]) <=96 ) || int(str[i]) >= 123 && int(str[i]) <=126 ){
            specialSymbol++;
        }

        i++;
    }
    cout<<" Vowels: "<< vowel << endl;
    cout<<" Consonants : "<<consonant << endl;
    cout<<" Digits : "<<digit << endl;
    cout<<" White Space: "<< whiteSpace << endl;
    cout<<" specialSymbol: "<< specialSymbol <<endl;
   }
};

int main()
{
    strings obj1;

    char str1[100];
    cout<<"enter string: ";
    cin >> str1;
    
    cout<<str1 << endl;
    cout<< obj1.returnLength(str1) <<endl;

    obj1.countCharacterType(str1);

    return 0;
}
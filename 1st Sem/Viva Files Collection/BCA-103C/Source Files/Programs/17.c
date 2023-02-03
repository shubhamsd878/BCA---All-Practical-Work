// WAP to check whether a candidate is eligible for voting
#include<stdio.h>
#include<conio.h>
int main(){
int age;
printf("\nEnter candidate's age: ");
scanf("%d",&age);

if(age>=18){
    printf("\nCandidate can drive ; )");
}
else
printf("Candidate can't drive");

return 0;
}
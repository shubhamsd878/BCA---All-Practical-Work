// Program to check if number is prime or not
public class _06_prime {
static boolean isPrime(int num) {

boolean flag = false;
for (int i = 2; i <= num / 2; ++i) {
// condition for nonprime number
if (num % i == 0) {
flag = true;
break;
}
}

if (!flag)
return false;
else
return true;
}



public static void main(String[] args) {

int num = 29;

if (!isPrime(num))
System.out.println(num + " is a prime number.");
else
System.out.println(num + " is not a prime number.");
}
}

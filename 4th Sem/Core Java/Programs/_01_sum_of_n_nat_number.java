// Sum of n natural number
class A{
public int sum(int n){
int sum = 0;
for(int i = 0; i<=n; i++){
sum += i;
}
return sum;
}
}

class _01_sum_of_n_nat_number{
public static void main(String[] args) {
A obj = new A();
int sum = obj.sum(5);

System.out.println(sum);
}

}
public class _09_HCF {
static void HCF(int n1, int n2){
int hcf = 0;

for(int i = 1; i <= Math.min(n1, n2); i++){
if( n1%i == 0 && n2%i == 0){
hcf = i;
}
}

System.out.println(hcf);
}
public static void main(String[] args) {
HCF(12, 18); 
}
}

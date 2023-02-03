public class _13_string_in_words{
    static void splitString(String str){
        int i =0;
        for( ; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                System.out.println();
                continue;
            }
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args){
        String a = "Hello world from shubham program";
        splitString(a);
    }
}
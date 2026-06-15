public class FactorialUsingRecursion {

    static void main(String[] args) {

        int result = fact(5);
        System.out.println(result);

    }

    public static int fact(int n){

        if(n != 0){
            return n * fact(n-1);
        }

        return 1;

    }

}

public class prime {
    public static boolean checkPrime(int n){
        // boolean isprime = true;          // first Option
        // for(int i=2;i<=n-1;i++){
        //     if(n%i==0){
        //         isprime=false;
        //         break;
        //     }
        // }
        // return isprime;

        if(n<=1) return false;            // Second option
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        System.out.print(checkPrime(10));
    }
}

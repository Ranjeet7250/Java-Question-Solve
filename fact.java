public class fact {
    public static int facto(int n){    // Factorial 
        // int f=1;                    // First Option 
        // for(int i=1;i<=n;i++){
        //     f=f*i;
        // }
        // return f;

        if(n==0||n==1 ){               // Second Option time complexity 
            return 1;
        }
        else{
            return n=n*(n-1);
        }
    }

}

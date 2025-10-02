public class bioCoffi {
    public static int facto(int n){    // Factorial 
        if(n==0||n==1 )              // Second Option time complexity 
            return 1;
        else
            return n=n*(n-1);
    }
    public static int bioCoff(int n, int r){     // Bionomial Cofficient
        int fact_n=facto(n);
        int fact_r=facto(r);
        int fact_nmr=facto(n-r);
        int bionomialCofficient=fact_n/(fact_r*fact_nmr);
        return bionomialCofficient;
    }
    public static void main(String[] args){
        System.out.print(bioCoff(5,2));
    }
}

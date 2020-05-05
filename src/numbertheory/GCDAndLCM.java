package numbertheory;

/**
 * Euclidian algorithm for finding GCDAndLCM
 */
public class GCDAndLCM {

    public int gcd(int a, int b){
        if(b==0) return a;
        else{
            return gcd(b, a%b);
        }
    }

    public int gcdIterative(int a, int b){
        while(b>0){
            a = a%b;
//swap
            int t = a;
            a =b;
            b = t;
        }
        return a;
    }

    public int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }

    /**
     *
     *If both numbers are even, then we can factor out a two of both and
     * compute the GCD of the remaining numbers: gcd(2a,2b)=2gcd(a,b).
     * If one of the numbers is even and the other one is odd,
     * then we can remove the factor 2 from the even one:
     * gcd(2a,b)=gcd(a,b) if b is odd.
     * If both numbers are odd, then subtracting one number of
     * the other one will not change the GCD: gcd(a,b)=gcd(b,a−b)
     * (this can be proven in the same way as the correctness proof
     * of the normal algorithm)
     */
    public int binaryGCD(int a, int b){
        return 0;
    }

    public static void main(String arg[]){
        GCDAndLCM gcd = new GCDAndLCM();
        System.out.println(gcd.gcd(5,20));
        System.out.println(gcd.lcm(5,24));
    }



}

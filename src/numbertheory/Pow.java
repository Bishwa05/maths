package numbertheory;

/**
 *
 * 50  Pow(x, n)
 * Leetcode,
 * myPow(2.00000, -2147483648) -->0
 *
 * myPow(1.00000, -2147483648) -->0
 *
 * In this 2 test case  the code is failing
 *
 */
public class Pow {

    public double myPow(double x, int n) {
        double ans =1;
        boolean isNeg = false;
        int m = n;
        if(n<0){
            isNeg = true;
            m=-n;
        }


        while(m>0){
            if((m&1)==1){
                ans = ans *x;
            }
            x = x*x;
            m >>=1;
        }


        return (isNeg)?1/ans: ans;

        //return  Math.pow(x,n);
    }

    public static void main(String arg[]){
        Pow p = new Pow();
        double d = 2.00000;
        System.out.println(p.myPow(d,-2147483648));
       // System.out.println(gcd.lcm(5,24));
    }
}

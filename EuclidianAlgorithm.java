
public class EuclidianAlgorithm {
	
	/* From Wikipedia (5/20/2024):
A more efficient version of the algorithm shortcuts these steps, instead replacing the larger of the two numbers by its remainder when divided by 
the smaller of the two (with this version, the algorithm stops when reaching a zero remainder). With this improvement, the algorithm never requires 
more steps than five times the number of digits (base 10) of the smaller integer. 

This was proven by Gabriel Lamé in 1844 (Lamé's Theorem),[1][2] and marks the beginning of computational complexity theory. Additional methods for 
improving the algorithm's efficiency were developed in the 20th century.

If gcd(a, b) = 1, then a and b are said to be coprime.
	 */
	
    //Original Euclidian Algorithm - Does not assume largest argument
    public static int gcd(int x, int y){
    	if (x == 0) return y;
    	if (x > y)  return gcd(x % y, y);
    	return gcd(y % x, x);
    }
   
    public static void main(String[] args) {
	    pout("The greatest common divisor of 301325155 and 50 is "+gcd(301325155,50));   //test, should be 5
    }
	
	public static void pout(Object o) { System.out.println(o); } 
}

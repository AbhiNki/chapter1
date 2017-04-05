package chapter1;

public class GCDFinder {
	/**
	 * This method takes two positive integers and finds their gcd using 
	 * Euclid's algorithm
	 * @param a
	 * @param b
	 * @return
	 */
	public int gcdofArray(int[] array)
	{
		int gcdof2 = gcd(array[0],array[1]);
		
		for(int i=2;i<array.length;i++)
		{
			gcdof2 = gcd(gcdof2,array[i]);
		}
		
		return gcdof2;
		
	}
	public int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
	
	public int lcd(int a, int b)
	{
		return a*b/gcd(a,b);
	}
	
	public int lcdofArray(int[] array)
	{
		int lcdof2 = lcd(array[0],array[1]);
		for(int i=0;i<array.length;i++)
		{
			lcdof2 = lcd(lcdof2, array[i]);
		}
		return lcdof2;
	}
	
	public static void main(String[] args) {
		System.out.println("GCD of two:"+new GCDFinder().gcd(25, 10)); // should print 5
		System.out.println("LCD of two:"+new GCDFinder().lcd(25, 10)); // should return 50
		System.out.println("GCD of an Array:"+new GCDFinder().gcdofArray(new int[]{2,4,6,8,10}));
		System.out.println("LCD of an Array:"+new GCDFinder().lcdofArray(new int[]{2,4,6,8,10}));
	}
}

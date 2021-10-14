package TP01;
	/**@version 2.1
	@author Claire*/

public class PairImpair {
	public static void main(String[] args){
		System.out.println(pair(11));
		System.out.println(pair(10));
		System.out.println(impair(11));
		System.out.println(impair(10));
	}
	
	/** test imparite
	 * 
	 * @param val entier
	 * @return true si lentier val est impair sinon false
	 */
	public static boolean impair(int val){
		return (!pair(val));
	}
	public static boolean pair (int val){
		if ((val %2)==0) return true;
		else return false;
	}

}


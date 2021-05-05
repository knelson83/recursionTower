
package com.mycompany.recursiontower;

/**
 *
 * @author kiwin
 */
public class RecursionTower{ 
	
	public static void main(String[] args){
		System.out.println(fact(3));
				
	}
	
	public static long fact(long n){
		if(n<= 1){
			return 1;
		}else 
		return n* fact(n-1);
			
			
		}

	
	}
	


	


	




	
	


package palindrome;

import java.util.*;

public class sumofPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		boolean flag = false;
		
		for(int i = 2;i<=n/2;i++)
		{
			if(checkPrime(i))
			{
				if(checkPrime(n-i))
				{
					System.out.print( n + "=");
					System.out.print( i + "+");
					System.out.println( n-i + "");
					flag = true;
					
				}
			}
		}
		if (!flag)
		{
			System.out.println(n+"not possible");
		}
		
	}

	static boolean checkPrime(int num) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		
		for(int i = 2; i<=num/2;i++)
		{
			if (num%i==0) {
				isPrime =  false;
				break;
			}
			
		}
		return isPrime;
		
	}

}

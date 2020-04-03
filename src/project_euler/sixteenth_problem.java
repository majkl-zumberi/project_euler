package project_euler;

import java.math.BigInteger;

public class sixteenth_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2 alla 15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26. What is the sum of the digits of the number 2 alla 1000?*/
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);
		//System.out.println("big: "+n);
		String bigS=n.toString();
		int sum=0;
		for (int i = 0; i < bigS.length(); i++) {
			sum+=Integer.parseInt(bigS.charAt(i)+"");// il +"" serve per renderlo stringa visto che il metodo ritorna un char
			//System.out.println("estratto: "+bigS.charAt(i)+" sum: "+sum);
		}
		System.out.println(sum);
	}

}

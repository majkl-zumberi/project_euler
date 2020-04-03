package project_euler;

public class twentyfiveth_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The Fibonacci sequence is defined by the recurrence relation:
		
		Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
		Hence the first 12 terms will be:
		
		F1 = 1
		F2 = 1
		F3 = 2
		F4 = 3
		F5 = 5
		F6 = 8
		F7 = 13
		F8 = 21
		F9 = 34
		F10 = 55
		F11 = 89
		F12 = 144
		The 12th term, F12, is the first term to contain three digits.
		
		What is the index of the first term in the Fibonacci sequence to contain 1000 digits?*/
		
		long n1=1,n2=0,n3=0,i=1;
		//boolean isThousantDigit = Integer.toString(Math.abs(n3)).trim().length() == 1000;
		do {
				n3=n1+n2;
				n2=n1;
				n1=n3;
				i++;
				//System.out.println(n3+": "+i);
				
				if(String.valueOf(n3).length() == 1000) {
					System.out.println(n3+" :"+i+" finito");
					break;
				}
			}
		while(true);
		
		
		
		
		
}

}

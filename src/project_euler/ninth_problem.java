package project_euler;

public class ninth_problem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

			a2 + b2 = c2
			For example, 32 + 42 = 9 + 16 = 25 = 52.
			
			There exists exactly one Pythagorean triplet for which a + b + c = 1000.
			Find the product abc.
			*/
		
		int c=0;
		
		/*double s=24;
		double d = 14.0;
		if((d-(int)d)!=0)
		    System.out.println("decimal value is there");
		else
		    System.out.println("decimal value is not there");*/
		
	//	System.out.println((int)Math.sqrt(s));
		for (int i = 1; i < 1000; i++) {
			
			for (int j = 1; j < 1000; j++) {
				c=(int) (Math.pow(i, 2)+Math.pow(j, 2));
			//	System.out.println("a: "+i+" b: "+j+" c: "+c);
				if(Math.pow(i, 2)+Math.pow(j, 2)==c && i<j &&j<c) {
					//System.out.println("i: "+i+" j: "+j+ " c: "+c);
					int sum=(int) (i+j+Math.sqrt(c));
					if(sum==1000 && (Math.sqrt(c)-(int)Math.sqrt(c))==0){
						System.out.println("i: "+i+" j: "+j+ " c: "+Math.sqrt(c));
					}
				}
			}
		}
		
		
	}

}

package project_euler;

public class thirthynineth_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.

		{20,48,52}, {24,45,51}, {30,40,50}
		
		For which value of p ≤ 1000, is the number of solutions maximised?*/
		
		for (int m = 1; m <=1000; m++) {
			for (int i = 2; i <= 90; i++) {// i= cateto minore j= cateto maggiore e j2 = ipotenusa
				for (int j = 2; j <= 90; j++) {
					for (int j2 = 2; j2 <=90; j2++) {
						if(Math.sqrt((Math.pow(i, 2)+Math.pow(j, 2)))==j2 && i+j+j2==m) {
							System.out.println(i+","+j+","+j2);
						}
					}
				}
			}
		}
		
	}

}

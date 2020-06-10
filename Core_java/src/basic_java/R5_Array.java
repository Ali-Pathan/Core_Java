package basic_java;

public class R5_Array {

	public static void main(String[] args) {

		// Static array
		int i[] = new int[4];

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[2]);
		System.out.println(i.length);

		for (int j = 0; j < i.length; j++) {

			System.out.print(i[j] + " Index number--> = ");
			System.out.println(j);

		}

		// Object Array

		Object ob[] = new Object[4];
		ob[0] = "tom";
		ob[1] = 25;
		ob[2] = "05/12/1983";
		ob[3] = "Bangladesh";

		for (int k = 0; k < ob.length; k++) {

			System.out.print(ob[k] + " = ");
			System.out.println(k);

		}
		
		
		// 2 Damnation array
		
		String x [][] = new String [3][5];
		System.out.println(x.length);// row
		System.out.println(x[0].length);// column
		
		x[0][0]= "A";
		x[0][1]= "B";
		x[0][2]= "C";
		x[0][3]= "D";
		x[0][4]= "E";
		
		x[1][0]= "A1";
		x[1][1]= "B1";
		x[1][2]= "C1";
		x[1][3]= "D1";
		x[1][4]= "E1";
		
		x[2][0]= "A2";
		x[2][1]= "B2";
		x[2][2]= "C2";
		x[2][3]= "D2";
		x[2][4]= "E2";
		
		System.out.println(x[2][1]);
		
		for(int row = 0; row<x.length; row++) {
			for(int col = 0; col<x[0].length; col++) {
				System.out.println(x[row][col]);
			}
			
		}

	}

}

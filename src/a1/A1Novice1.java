package a1;

import java.util.Scanner;
//import java.math.BigDecimal;
import java.text.DecimalFormat;

public class A1Novice1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int CusNum = scan.nextInt();
		String[] output = new String[CusNum];
		for (int a=0; a<CusNum;a++) {

		String FirstName = scan.next();
		char b=FirstName.charAt(0);
		String SecondName = scan.next();
		
		int count = scan.nextInt();
		
		

	double sum =0;
		for (int c=0; c<count; c++) {
			double[] values = new double[2];
			values[0] = scan.nextInt();
			String Goods = scan.next();
			values[1] = scan.nextDouble();
			sum += values[0]*values[1];
		//	String sum2 = String.format("%.2f",sum);
			 
	//		 java.text.DecimalFormat df =new java.text.DecimalFormat("#.00"); 
	//		 String s=df.format(sum);
			// String.format("%.2f", sum);
	//		 String.format("%.2f", ((double) sum) / ((double) count))	
			 
		}
		 DecimalFormat df =new DecimalFormat("#.##"); 
//		 String s=df.format(sum);
		output[a] = b+". "+SecondName+": "+df.format(sum);
		}
		
		scan.close();
		
	
		   for (int d=0; d<CusNum; d++) {
		        System.out.println(output[d]);
		    }

	}
	
}

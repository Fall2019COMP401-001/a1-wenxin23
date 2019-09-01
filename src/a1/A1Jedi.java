package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int GoodsCount = scan.nextInt();

		String[] GoodsName = new String[GoodsCount];
		double[] GoodsPrice = new double[GoodsCount];
		int[] GoodsSum = new int [GoodsCount];
		int[] CustomBuy = new int [GoodsCount];
		for (int a = 0; a<GoodsCount; a++) {
			GoodsName[a] = scan.next();
			GoodsPrice[a] = scan.nextDouble();
		}
		
		int CustomNum = scan.nextInt();
		int[] CustomTotalCount = new int[CustomNum];
		String[] FirstName = new String[CustomNum];
		String[] SecondName = new String[CustomNum];
		
		for (int b = 0; b<CustomNum; b++) {
			FirstName[b] = scan.next();
			SecondName[b] = scan.next();
			CustomTotalCount[b] = scan.nextInt();
			for (int c = 0; c < CustomTotalCount[b]; c++) {
				int CustomEachCount = scan.nextInt();
				String GoodsChoice = scan.next();
				for (int d = 0; d<GoodsName.length; d++) {
					if (GoodsName[d].equals(GoodsChoice)) {
						GoodsSum[d] += CustomEachCount; 
						CustomBuy[d]++;
					//	sum[b] += (GoodsPrice[d] * CustomEachCount);
					//	Total += (GoodsPrice[d] * CustomEachCount)/CustomNum;
						break;
					}
				}
		}
	}
		scan.close();
		   for (int f=0; f<GoodsCount; f++) {
			   if (GoodsSum[f]==0){
				   System.out.println("No customers bought " + GoodsName[f]);
			   }
				   else {System.out.println(CustomBuy[f]+" customers bought " +" "+GoodsSum[f]+" "+GoodsName[f]);
			   }
		        
		    }
		
		   //2 customers bought 5 Banana
	}
}

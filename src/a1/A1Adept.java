package a1;

import java.util.Scanner;
//import java.text.DecimalFormat;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int GoodsCount = scan.nextInt();

		String[] GoodsName = new String[GoodsCount];
		double[] GoodsPrice = new double[GoodsCount];
		
		for (int a = 0; a<GoodsCount; a++) {
			GoodsName[a] = scan.next();
			GoodsPrice[a] = scan.nextDouble();
		}
		double Total = 0;
		int CustomNum = scan.nextInt();
		double[] sum = new double[CustomNum];
		String[] FirstName = new String[CustomNum];
		String[] SecondName = new String[CustomNum];
		int[] CustomTotalCount = new int[CustomNum];
		for (int b = 0; b<CustomNum; b++) {
			FirstName[b] = scan.next();
			SecondName[b] = scan.next();
			CustomTotalCount[b] = scan.nextInt();
			for (int c = 0; c < CustomTotalCount[b]; c++) {
				int CustomEachCount = scan.nextInt();
				String GoodsChoice = scan.next();
				for (int d = 0; d<GoodsName.length; d++) {
					if (GoodsName[d].equals(GoodsChoice)) {
						sum[b] += (GoodsPrice[d] * CustomEachCount);
						Total += (GoodsPrice[d] * CustomEachCount)/CustomNum;
						break;
					}
				}
		}
	}
		scan.close();

		System.out.println("Biggest: " + FirstName[biggest(sum)] + " " + SecondName[biggest(sum)] + " (" + String.format("%.2f", sum[biggest(sum)]) + ")");
		System.out.println("Smallest: " + FirstName[smallest(sum)] + " " + SecondName[smallest(sum)] + " (" + String.format("%.2f", sum[smallest(sum)]) + ")");
		System.out.println("Average: " + String.format("%.2f", Total));
	}
		static int smallest(double[] array) {
			int small = 0;
			for (int i = 1; i<array.length; i++) {

				if (array[i] < array[small]) {
					small = i;
				}
			}
			return small;
		}
		static int biggest(double[] array) {
			int big = 0;
			for (int i = 1; i<array.length; i++) {
				if (array[i] > array[big]) {
					big = i;
				}
			}
			return big;
		}

}
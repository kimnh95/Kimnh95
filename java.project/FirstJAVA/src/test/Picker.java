package test;

import java.util.Scanner;

public class Picker {
	//index 배열
	static String [] name = {
			"고현주","구자윤","김난형","김동진","김주연",
			"문영기","박준섭","박지은","방창용","양햇살",
			"엄예빈","위은주","이용재","황다울","이진형",
			"이택수","장한솔","정엄지","정용기","조성빈",
			"조지윤","최찬영","하재운","홍지수"
			};
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("섞을 회수 : ");
			int cnt = s.nextInt();
			if(cnt != 1) {
				suffle(cnt);
				System.out.println("반장 :");
			}
		}
		
	}
	
	private static void suffle(int num) {
		
		String temp = null;
		for(int i = 0; i < num; i++) {//0~23개
			int rNum = (int) (Math.random() * name.length); //length 몇개의 배열을 가지고있냐 지금은 24 0~23 중 랜덤으로 뽑는다
 			temp = name[0]; //temp = " " 비어있는거
			name[0] = name[rNum]; //name[0]은 "고현주" name[21] 은 최찬성 -> 두개를 서로 바꾸고싶어서 temp 적용
			name[rNum] = temp;
		}
	}

}

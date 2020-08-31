package test1;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = new int[3]; // ar[0]~ar[2] , ar.length = 3
		// == int[] ar = new int[3];
		// 초기값을 설정해주지 않으면, 자동으로 0으로 설정됨
		
		char cr[] = new char[3]; // cr[0]~cr[2] , cr.length = 3
		// 초기값을 설정해주지 않으면, 자동으로 유니코드의 첫번째 값(= NULL)으로 설정됨
		
		double dr[] = new double[3]; // dr[0]~dr[2] , dr.length = 3
		// 초기값을 설정해주지 않으면, 자동으로 0.0으로 설정됨
		
		boolean br[] = new boolean[3]; // br[0]~br[2] , br.length = 3
		// 초기값을 설정해주지 않으면, 자동으로 False으로 설정됨
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
			System.out.println(cr[i]);
			System.out.println(dr[i]);
			System.out.println(br[i]);
			System.out.println("-----");
		}
	}

}

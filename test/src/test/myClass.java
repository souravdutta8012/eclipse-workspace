package test;

import java.util.*;

public class myClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
//		str = "";

//		for (int i = arr.length - 1; i >= 0; i--) {
//			str += arr[i];
//		}
//		

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					arr[j] = '*';
//				}
//			}
//		}

//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]!='*') {
//				str += arr[i];
//			}
//		}

//		System.out.println(str);

//		int count = 0;
//		char a = '*';

//		for (int i = 0; i < arr.length; i++) {
//			int loopcount = 1;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					arr[j] = '*';
//					loopcount++;
//				}
//			}
//			if (loopcount > count) {
//				count = loopcount;
//				a = arr[i];
//			}
//		}

//		System.out.println(count);
//		System.out.println(a);

		boolean result = false;

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; i < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
						arr1[i] = '*';
						arr2[j] = '&';
						break;
					}
				}
			}

			boolean flag = true;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != '*') {
					flag = false;
					break;
				}
			}
			result = flag;
		} else {
			result = false;
		}

		System.out.println(result);
	}

}

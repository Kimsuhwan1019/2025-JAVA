package week6;

import java.util.Arrays;

public class ArrayEx3 {
	public static void main(String[] args) {
		//2차원 배열 선언
		int[][] math = new int[2][3];
		//중첩 for문 사용
		//바깥 for: 행의 반복(row)
		//안쪽 for: 열의 반복(column)
		for(int i=0; i<math.length; i++) {
			for(int j=0; j<math[i].length; j++) {
				System.out.printf("math[%d][%d] = %d\n", i, j, math[i][j]);
			}
		}
		//각 행의 열의 개수가 다를 수 있다.
		//자바는 1차원 배열을 이용해서 2차원 배열을 구현하기 때문에!
		System.out.println();
		int[][] eng = new int[2][];
		eng[0] = new int[2];
		eng[1] = new int[3];
		
		for(int i=0; i<eng.length; i++) {
			for(int j=0; j<eng[i].length; j++) {
				System.out.printf("math[%d][%d] = %d\n", i, j, eng[i][j]);
			}
		}
		System.out.println();
		
		//배열을 복사하는 방법
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[7];
		
		//1.for문 이용해서 복사
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");			
		}
		System.out.println();
		
		//2. System.arraycopy() 사용
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		//3. Arrays 클래스 이용
		arr2 = Arrays.copyOf(arr1, arr1.length);
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
}

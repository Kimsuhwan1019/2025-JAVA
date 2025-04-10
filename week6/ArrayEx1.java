package week6;

public class ArrayEx1 {
	public static void main(String[] args) {
		//배열 타입(교재 p.165)
		//값 목록으로 배열 생성하기
		int[] score = {70,80,90,75,95};
		String[] pNames = {"java", "c", "python", "c#"};
		double[] dArray1;
		//dArray1 = {0.1, 0.2, 0.3, 0.4};는 불가능!!
		dArray1 = new double[] {0.1, 0.2, 0.3, 0.4};
		
		//new 연산자로 배열 생성
		//배열의 크기는 반드시 필요
		//배열을 new 연산자로 생성하면 기본값(int니까 0)으로 초기화됨
		int[] intArray = new int[5];
		System.out.println("intArray[0] = " + intArray[0]);
		
		double[] dArray2 = new double[5];
		System.out.println("dArray[0] = " + dArray2[0]);
		
		String[] sArray = new String[5];
		System.out.println("sArray[0] = " + sArray[0]);
		
		//sArray 배열에 pNames 배열 값을 저장할 때
		//sArray = pNames; (X)
		for(int i=0; i<pNames.length; i++) {
			sArray[i] = pNames[i];
			System.out.printf("sArray[%d] = %s\n", i, sArray[i]);
		}
	}

}

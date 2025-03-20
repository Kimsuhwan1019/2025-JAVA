package week2;

public class ProductPrice {
	public static void main(String[] args) {
		
		int		count = 7; 
		int		totalprice = 5700;
		
		//상품 단가 구하기 = 총 금액 / 개수
		//int / int => int
		//double / int => double
		double	aPrice = (double)totalprice / count;
		
		
		System.out.printf("개수: %d개\n", count);
		System.out.printf("총 구매 금액: %d원\n", totalprice);
		System.out.printf("상품 단가: %.1f원\n", aPrice);
	}

}

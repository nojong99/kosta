// 1. 사이즈가 s, m, l 있다.
// 2. 사이즈를 44, 55, 66, 77이 있다.
public class ArrayTest_01 {
	public static void main(String[] args) {
		char[] sizes = new char[3]; // heap
		sizes[0] = 'S';
		sizes[1] = 'M';
		sizes[2] = 'L';
		int[] sizeNumber = new int[4];

		for (int i = 0; i < sizes.length; i++) {
			System.out.println("size는 :" + sizeNumber[i]);
		}
		System.out.println(sizes);
		System.out.println(sizeNumber);

		// 기존 배열 크기 구조 변경 불가
		sizes = new char[4];
		System.out.println(sizes);
		System.out.println(sizes.length);
		sizeNumber = null;
		System.out.println(sizeNumber);
		// 고정값을 정의할 때 배열 사용 

String [] sizes2 = {"S", "M", "L", "XL", "XXL"};
		for (int j = 0; j < sizes2.length; j++) {
			System.out.println(sizes2[j]);
		}
	}

}

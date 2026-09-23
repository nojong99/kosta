//노종현
// 바이트의 최대값을 출력하세요.
// 최대값에서 1을 더한 값을 확인하세요.
// int, float의 최대값을 확인하세요.
public class TypeTest_02 {

	public static void main(String[] args) {
		//byte = 8bit
		int bitsize =2;
		int bytesize = bitsize*bitsize*bitsize*bitsize*bitsize*bitsize*bitsize*bitsize;
		System.out.println("Byte의 최대값은 :"+ (int)(bytesize-1) +"입니다.");
		System.out.println("Byte의 최대값+1은 :"+ (int)(bytesize) +"입니다.");
		
		
	}

	
	
}


public class ifTest_021 {

	public static void main(String[] args) {
		// 시간을 입력받아서 메세지를 출력하세요 String message = "출력 내용"
		// 단, 9~13시까지는 오전 // 13~14시까지 점심 // 14~18시 오후 나머지 휴식
		int h = 20;
		String message = "휴식";
		if (9 <= h && h < 13) {
			message = "오전";
		} else if (13 <= h && h < 14) {
			message = "점심";
		} else if (14 <= h && h <= 18) {
			message = "오후";
		} else if (h < 0) {
			System.out.println("정해진 시간이 아닙니다. 0~24사이로 설정해주세요.");
			return;
		}
		System.out.println(h+"시는 "+message+" 입니다.");
	}

}

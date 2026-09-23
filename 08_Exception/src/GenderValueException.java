// 이름은 Exception 필수 
//사용자 정의 예외는 Exception을 상속 받으면 checkedException으로 간다. 
// throw는 생성자를 호출 super(message)를 정의하는 것을 권장 why? e.printstacktrace and getMessage() 내꺼는 부모를 연결 할아버지는 징검다리로 쭉쭉 연결
public class GenderValueException extends Exception {
	public GenderValueException(String message) {
		super(message);
	}

}

// 문제해결로 어떤 방식을 쓸건지 설계도로 작성해봐라!
class UserObject {
	UserObject() throws ClassNotFoundException, GenderValueException {
		methodA();
		System.out.println("생성자 실행");

	}

	private void methodA() throws ClassNotFoundException, GenderValueException {
		methodB();
		System.out.println("A end");

	}

	private void methodB() throws ClassNotFoundException, GenderValueException {
		Class.forName("java.util.Date");
		setGender('S');
		System.out.println("B end");
	}
//구현부에 숨겨있는 익샙션 상황을 경고장을 선언부에 적어두는것?
//		private void setGender(char gender) throws GenderValueException 이부분까지가 인터페이스
	private void setGender(char gender) throws GenderValueException {
		if(!(gender=='M' || gender=='F')) {
			throw new GenderValueException("m or f");
		}
	}

}

public class ExceptionTest_04 {
	public static void main(String[] args) {
		try {
			new UserObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (GenderValueException e) {
			e.printStackTrace();
		}catch (Exception e) { // 마지막에 Exception하는 이유는 혹시 놓칠 수 있는 예외까지 처리 가능 / 모달 / 
			e.printStackTrace();
		}		
		finally {
			System.out.println("마지막에 처리할 공통 코드 넣는곳");
		}
		System.out.println("normal");
	}
}

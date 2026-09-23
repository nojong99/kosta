//2. 추상 클래스는 생성자를 못쓰네? -> 추상 메서드는 없지만, 생성만 직접 하는 것을 막기 위해서

abstract class SuperB{}

class SubB extends SuperB{
	
}

public class AbstactTest_02 {

	public static void main(String[] args) {
		SuperB b1;
		b1 = new SubB();

	}

}

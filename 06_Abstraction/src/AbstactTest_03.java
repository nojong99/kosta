// 3. 모든 동작이 추상일 때 
abstract class SuperC{
	public abstract void print();
	public abstract void message();
}
class SubC extends SuperC{

	@Override
	public void print() {}

	@Override
	public void message() {}	
}


public class AbstactTest_03 {
	public static void main(String[] args) {
		SuperC c1 = new SubC();
		c1.print();
		c1.message();
		//지금 상태는 문법적으로 틀리진 않지만 사례가 없다. 
		
	}
}

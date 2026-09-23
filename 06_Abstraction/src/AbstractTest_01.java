// 1. 요구사항중 일부 동작을 결정할 수 없을 때
//보통 public void 메서드~ 해서 구현부까지 있는 거는 동작을 결정할 수 있다라고 얘기함 
//그런데 public void print라는 동작을 하려했으나 출력물을 결정한게 없다 -> 구현부를 결정할 수 없다. -> 
abstract class SuperA{
	public void methodA() {}
	public abstract void print();
}

public class AbstractTest_01 {

	public static void main(String[] args) {
		
		
	}

}

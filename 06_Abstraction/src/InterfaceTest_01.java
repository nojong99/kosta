interface SuperD{
	void print();
	void message();
}
class SubD implements SuperD{

	@Override
	public void print() {
	}

	@Override
	public void message() {
	}
	
}

public class InterfaceTest_01 {
	public static void main(String[] args) {
		SuperD d1;
		d1 = new SubD();
		d1.print();
	}
}

package kr.swdl.admin;
// Exception 목록을 만들어라
public class GenderValueException extends RuntimeException{
	public GenderValueException(String message) {
		super(message);
	}
}

package kr.swdl.admin;
// Exception만 바꿈
public class NameLengthException extends RuntimeException{
	public NameLengthException(String message) {
		super(message);
	}

}

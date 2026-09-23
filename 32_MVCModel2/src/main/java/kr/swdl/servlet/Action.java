package kr.swdl.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

// Action 팩토리는 액션만 명확하면 됨어떤 액션이 나오는지 알 수 없다. 
public interface Action {
	// req를 전달하고 결과인 url을 받는다.
	String execute(HttpServletRequest request)throws ServletException, IOException;
}

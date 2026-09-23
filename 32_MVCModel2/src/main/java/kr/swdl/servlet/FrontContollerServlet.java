package kr.swdl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontContollerServlet
 */
@WebServlet("/controller")
public class FrontContollerServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// cmd 값이 필요 -> 브라우저에서 전달받아야함	-> url을 줘야함 request
		// 모든 req에서 한글처리 문제가 있을 수 있다.
		// 동선을 이해하라는 것은 패턴을 이해
		request.setCharacterEncoding("utf-8");
		String cmd = request.getParameter("cmd");
		System.out.println(cmd);
		// 해당 Action을 전달 받아서 실행시켜줘야한다. -> 팩토리에서 받아서(cmd의 값) 실행
		// cmd는 주소를 줘야함
		// 여러 개를 메모리 올릴 필요가 없다. -> static으로 메소드를 만들것
		// 필요한 걸 미리 추론해서 만듦 TDD
		// 일 시킬때 req통째로 보내라
		Action a= ActionFactory.getAction(cmd);
		// 해당 페이지로 이동해야하는 상황 --> 포워딩
		String url = a.execute(request);
		request.getRequestDispatcher("/"+url).forward(request, response);
	}

}

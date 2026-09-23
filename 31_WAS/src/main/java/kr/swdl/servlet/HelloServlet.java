package kr.swdl.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	// 메모리에 올라가네?
	public HelloServlet() {
		System.out.println("helloServlet() - 처음 1번만 실행");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() - .xml등 공통의 환경 공유");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destfroy() - 메모리 해제 직전 호출");
	}

	// 들어오는 길 req, 나가는 길 res
	// 톰캣은 메모리에 new 를 하지않는다.
	// 수정사항 -> 실행 후 destroy() -> 다시 로드

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("누가 들어왔어!!!!" + request.getLocalAddr());
		response.getWriter().append("<h1>server message client~</h1>"); // service입장 기다리고있음

	}

}

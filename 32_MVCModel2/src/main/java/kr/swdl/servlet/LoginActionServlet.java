package kr.swdl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginActionServlet
 */
@WebServlet("/loginAction")
public class LoginActionServlet extends HttpServlet {
	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append(request.getMethod());
		// 로그인 처리 DAO에서 해줘야함
		request.getRequestDispatcher("/view/ok.jsp").forward(request, response);
//		response.sendRedirect("view/ok.jsp");
	}

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("GET").append(request.getContextPath());
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Post").append(request.getContextPath());
//	}

}

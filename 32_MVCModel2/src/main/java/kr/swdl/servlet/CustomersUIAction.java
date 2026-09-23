package kr.swdl.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import kr.swdl.model.CustomerService;

public class CustomersUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException {
		request.setAttribute("list", new CustomerService().getCustomers());
		return "view/customerList.jsp";
	}

}

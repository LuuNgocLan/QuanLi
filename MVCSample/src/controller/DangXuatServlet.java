package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dangxuat")
public class DangXuatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DangXuatServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		String userLogin = (String) session.getAttribute("username");
		if (userLogin != null) {
			session.removeAttribute("username");
			response.sendRedirect(request.getContextPath()+"/dangnhap");
			return;
		}else{
			response.sendRedirect(request.getContextPath()+"/dangnhap");
			return;
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

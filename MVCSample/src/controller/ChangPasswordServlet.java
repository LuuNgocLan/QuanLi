package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.User;
import model.bo.UserBO;

/**
 * Servlet implementation class ThemUserServlet
 */
@WebServlet("/user/changepass")
public class ChangPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserBO userBo;

	public ChangPasswordServlet() {
		super();
		userBo = new UserBO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/changepassword.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String oldpass = request.getParameter("oldpass");
		String newpass = request.getParameter("newpass");
		String re_newpass = request.getParameter("re_newpass");
		System.out.println(oldpass+" "+newpass+" "+re_newpass);

		if ("".equals(oldpass)||"".equals(newpass) || "".equals(re_newpass)) {
			request.setAttribute("msgErr", "Please enter full information!");
			RequestDispatcher rd = request.getRequestDispatcher("/changepassword.jsp");
			rd.forward(request, response);
			return;
		}
		
		int idUser = (int) session.getAttribute("idUser");
		User user=null;
		try {
			user = userBo.getItem(idUser+"");
			if(!user.getPassword().equals(oldpass)){
				request.setAttribute("msgErr", "Old password is wrong!");
				RequestDispatcher rd = request.getRequestDispatcher("/changepassword.jsp");
				rd.forward(request, response);
				return;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
			request.setAttribute("msgErr", "Lỗi kết nối database");
			RequestDispatcher rd = request.getRequestDispatcher("/changepassword.jsp");
			rd.forward(request, response);
			return;
		}
		
		if (!newpass.equals(re_newpass)) {
			request.setAttribute("msgErr", "Retype New pasword not equal!");
			RequestDispatcher rd = request.getRequestDispatcher("/changepassword.jsp");
			rd.forward(request, response);
			return;
		}	
		
		try {
			if (userBo.updatePass(idUser+"", newpass)> 0) {
				session.setAttribute("msg", "Update password successfuly!!");
				response.sendRedirect(request.getContextPath() + "/user/detail");
				return;
			} else {
				request.setAttribute("msgErr", "Update password failed!!");

				RequestDispatcher rd = request.getRequestDispatcher("/changepassword.jsp");
				rd.forward(request, response);
				return;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("msgErr", "Lỗi kết nối database");
			RequestDispatcher rd = request.getRequestDispatcher("/changepassword.jsp");
			rd.forward(request, response);
			return;
		}

	}
}

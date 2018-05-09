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
@WebServlet("/user/add")
public class ThemUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserBO userBo;

	public ThemUserServlet() {
		super();
		userBo = new UserBO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/add.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");

		if ("".equals(username)) {
			request.setAttribute("msgErr", "Please enter Username!");
			RequestDispatcher rd = request.getRequestDispatcher("/add.jsp");
			rd.forward(request, response);
			return;
		}
		
		if ("".equals(password)) {
			request.setAttribute("msgErr", "Please enter password!");
			RequestDispatcher rd = request.getRequestDispatcher("/add.jsp");
			rd.forward(request, response);
			return;
		}

		if ("".equals(firstname)) {
			request.setAttribute("msgErr", "Please enter firstname!");
			RequestDispatcher rd = request.getRequestDispatcher("/add.jsp");
			rd.forward(request, response);
			return;
		}
		if ("".equals(lastname)) {
			request.setAttribute("msgErr", "Please enter lastname!");
			RequestDispatcher rd = request.getRequestDispatcher("/add.jsp");
			rd.forward(request, response);
			return;
		}

		try {
			if (userBo.addItem(username,password,firstname,lastname,"2") > 0) {
				HttpSession session = request.getSession();
				session.setAttribute("msg", "Added User successfuly!!");
				response.sendRedirect(request.getContextPath() + "/user");
				return;
			} else {
				request.setAttribute("msgErr", "Thêm User thất bại!!");

				RequestDispatcher rd = request.getRequestDispatcher("/add.jsp");
				rd.forward(request, response);
				return;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("msgErr", "Lỗi kết nối database");
			RequestDispatcher rd = request.getRequestDispatcher("/add.jsp");
			rd.forward(request, response);
			return;
		}

	}
}

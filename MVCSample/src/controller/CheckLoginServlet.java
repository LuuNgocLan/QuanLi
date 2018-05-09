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
import javax.websocket.Session;

import model.bean.User;
import model.bo.UserBO;

/**
 * Servlet implementation class CheckLoginServlet
 */
@WebServlet("/dangnhap")
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserBO userBO;

	public CheckLoginServlet() {
		super();
		userBO = new UserBO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userLogin = (String) session.getAttribute("username");
		if (userLogin != null) {
			response.sendRedirect(request.getContextPath() + "/user");
			return;
		}
		RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destination = null;
		HttpSession session = request.getSession();
		String userLogin = (String) session.getAttribute("username");

		if (userLogin != null) {
			response.sendRedirect(request.getContextPath() + "/user");
			return;
		}
		ArrayList<User> userArray = null;
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		if ("".equals(userName) || "".equals(password)) {
			request.setAttribute("msg", "Không để trống mục nào!!");
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
			return;
		}
		User user;
		try {
			user = userBO.isValidUser(userName, password);
			if (user == null) {
				request.setAttribute("msg", "Thông tin đăng nhập không đúng!!");
				RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
				rd.forward(request, response);

			} else {
				System.out.println(userName);
				session.setAttribute("username", userName);
				session.setAttribute("role", user.getIdRole());
				session.setAttribute("idUser", user.getId());
				response.sendRedirect(request.getContextPath() + "/user");
			}
		} catch (SQLException e) {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

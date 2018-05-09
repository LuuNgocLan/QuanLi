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


@WebServlet("/user")
public class IndexUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserBO userBo;

	public IndexUserServlet() {
		super();
		userBo = new UserBO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String msg = (String) session.getAttribute("msg");
		if (msg != null) {
			request.setAttribute("msg", msg);
			session.removeAttribute("msg");
		}
		String msgErr = (String) session.getAttribute("msgErr");
		if (msgErr != null) {
			request.setAttribute("msgErr", msg);
			session.removeAttribute("msgErr");
		}
		int id = (int) session.getAttribute("idUser");
		int role = (int) session.getAttribute("role");
		try {

			ArrayList<User> userArray = userBo.getItems();
			request.setAttribute("userArray", userArray);
		
		} catch (SQLException e) {
			request.setAttribute("msgErr", "Lỗi kết nối database");
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

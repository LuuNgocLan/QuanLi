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
@WebServlet("/user/detail")
public class DetailUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserBO userBo;
	
	public DetailUserServlet(){
		super();
		userBo = new UserBO();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		int idUser = (int) session.getAttribute("idUser");
		
		try {
			User user = userBo.getItem(idUser+"");
			
			if(user!=null){
				System.out.println(user.getId()+" "+user.getFirstname());

				request.setAttribute("user", user);
				RequestDispatcher rd = request.getRequestDispatcher("/detail.jsp");
				rd.forward(request, response);
			} else {
				response.sendRedirect(request.getContextPath()+"/error");
				return;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("msgErr", "Lỗi kết nối database");
			RequestDispatcher rd =request.getRequestDispatcher("/detail.jsp");
			rd.forward(request, response);
			return;
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
	
}

package controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.User;
import model.bo.UserBO;

@WebServlet("/user/sua")
public class SuaUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserBO userBo;
	
	public SuaUserServlet(){
		super();
		userBo = new UserBO();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		request.setAttribute("id", id);
		
		try {
			User user = userBo.getItem(id);

			if(user!=null){
				request.setAttribute("user", user);
				RequestDispatcher rd = request.getRequestDispatcher("/edit.jsp");
				rd.forward(request, response);
			} else {
				response.sendRedirect(request.getContextPath()+"/error");
				return;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("msgErr", "Lỗi kết nối database");
			RequestDispatcher rd =request.getRequestDispatcher("/edit.jsp");
			rd.forward(request, response);
			return;
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");	
		
		request.setAttribute("id", id);
		if("".equals(firstname)) {
			request.setAttribute("msgErr", "Please enter your firstname!");
			RequestDispatcher rd = request.getRequestDispatcher("/add.jsp");
			rd.forward(request, response);
			return;
		}
			
		if("".equals(lastname)) {
			request.setAttribute("msgErr", "Please enter your l!");
			RequestDispatcher rd = request.getRequestDispatcher("/add.jsp");
			rd.forward(request, response);
			return;
		}
		
		try {
			if (userBo.editItem(id,firstname,lastname)>0) {
				HttpSession session = request.getSession();
				session.setAttribute("msg", "Sửa thông tin user thành công!!");
				response.sendRedirect(request.getContextPath() + "/user");
				return;
			} else {
				request.setAttribute("msgErr", "Sửa user không thành công!!");
				
				//request.setAttribute("user", user);
				RequestDispatcher rd = request.getRequestDispatcher("/edit.jsp");
				rd.forward(request, response);
				return;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("msgErr", "Lỗi kết nối database");
			RequestDispatcher rd = request.getRequestDispatcher("/edit.jsp");
			rd.forward(request, response);
			return;
		}

	}
	
	
}

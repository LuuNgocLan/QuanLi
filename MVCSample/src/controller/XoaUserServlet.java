package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bo.UserBO;

/**
 * Servlet implementation class XoaUserServlet
 */
@WebServlet("/user/xoa")
public class XoaUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private UserBO userBo;
    
    public XoaUserServlet() {
        super();
        userBo= new UserBO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		try{
			if(userBo.delItem(id)>0){
				session.setAttribute("msg", "Xóa thành công!");
			} else {
				session.setAttribute("msgErr", "Xóa không thành công!");
			}
			response.sendRedirect(request.getContextPath()+"/user");
		} catch(SQLException e){
			request.setAttribute("msgErr", "Lỗi kết nối database!");
			e.printStackTrace();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

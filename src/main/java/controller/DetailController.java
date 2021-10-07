package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import firstweb.Product;
import firstweb.ProductDAO;

public class DetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*Product p = new Product(69,"orange juice","น้ำส้มรสอร่อย", 5);		
		// ฝากข้อมูลไปที่ Object request
		request.setAttribute("result", p);
		request.getRequestDispatcher("test.jsp").forward(request, response);*/
		//ลองใช้วิธีเรียกผ่าน DAO
		String id = request.getParameter("id");
		try {
			ProductDAO dao = new ProductDAO();
			Product p = dao.getProduct(Integer.parseInt(id));//Test เรียก Product หมายเลข 1
			request.setAttribute("result", p);
			request.getRequestDispatcher("test.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

package cookiesession;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WriteCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie oldCount[] = request.getCookies();
		for(Cookie cookie: oldCount) {
			if(cookie.getName().equals("count")) {
				System.out.println(cookie.getName() + "-" + cookie.getValue());
				System.out.println(cookie.getMaxAge());
				int a = Integer.parseInt(cookie.getValue())+1;
				//แนบค่าไปกับ Response
				response.addCookie(new Cookie("count", String.valueOf(a)));
			}
		}
		
		/*
	  	Cookie count = new Cookie("count", "0");
		response.addCookie(count);
		*/
	}

}

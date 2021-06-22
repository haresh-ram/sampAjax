

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/aserv")
public class aserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String roll = request.getParameter("roll");
		
		try {
			boolean val = loginDAO.value(roll,name);
			if(val==true) {
				response.getWriter().print("valid user");
			}else {
				response.getWriter().print("not a valid user");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//response.getWriter().print("hello "+name+". roll no is "+roll+".");
		
		
	}

	
}

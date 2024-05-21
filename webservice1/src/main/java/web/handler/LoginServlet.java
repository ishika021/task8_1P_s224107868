package web.handler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import web.service.LoginService;


/**
 * HTTP end-point to handle login service.
 */
/*public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException, ServletException {	
		System.out.println("[LoginServlet] GET");
		
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException, ServletException {		
		System.out.println("[LoginServlet] POST");
		
		String username = req.getParameter("username");
		String password = req.getParameter("passwd");
		String dob = req.getParameter("dob");
		
		System.out.println("Username/password: " + username + ", " + password);
		
		String loginStatus = "fail";
		
		if (LoginService.login(username, password, dob)) {
			loginStatus = "success";
		}		
		
		String htmlResponse = "<html>";
		htmlResponse += "<head><title>"+ loginStatus + "</title></head>";
		htmlResponse += "<h2>Login status: " + loginStatus + "</h2>";
		htmlResponse += "</html>";
		
		PrintWriter writer = resp.getWriter();
		writer.println(htmlResponse);
	}

	
}*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String dobString = request.getParameter("dob");

        
        Date dob = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
            dob = dateFormat.parse(dobString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

       
        LoginService loginService = new LoginService();
        boolean isAuthenticated = loginService.login(username, password, dob);

        if (isAuthenticated) {
            request.setAttribute("loginStatus", "success");
        } else {
            request.setAttribute("loginStatus", "fail");
        }

     
        RequestDispatcher dispatcher = request.getRequestDispatcher("loginResponse.jsp");
        dispatcher.forward(request, response);
    }
}

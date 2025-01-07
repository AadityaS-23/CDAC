

package com.cdac.pages;

import static com.cdac.utils.DBUtils.closeConnection;
import static com.cdac.utils.DBUtils.openConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

/**
 * Servlet implementation class VoterRegistrationServlet
 */
@WebServlet(urlPatterns="/voter_registration",loadOnStartup = 1 )
public class VoterRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
       
  

	/**
	 * @see Servlet#init()
	 */
    @Override
	public void init() throws ServletException {
            try {
            	System.out.println("in init");
            //	open connection
            	openConnection();
            //	create user dao instance
            	userDao = new UserDaoImpl();
            }catch (Exception e){
            	throw new ServletException("err in init of" +getClass(),e);
            }

	}

	/**
	 * @see Servlet#destroy()
	 */
    @Override
	public void destroy() {
		try {
			System.out.println("in destroy");
			//dao's cleanup and close cn
			
			userDao.cleanUp();
			closeConnection();
			
		} catch (Exception e) {
			throw new RuntimeException("err in destroy " +getClass());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.set cont type
		response.setContentType("text/html");
	//	2.get PW
		try (PrintWriter pw = response.getWriter()){
			//3.Read request params sent from client - > servlet
			String firstName = request.getParameter("fn");
			String lastName = request.getParameter("ln");
			String email = request.getParameter("em");
			String pwd = request.getParameter("pass");
			Date dob = Date.valueOf(request.getParameter("dob"));
			
			
		//	calculate age(update)
			LocalDate birthDate = dob.toLocalDate();
			  int age = Period.between(birthDate, LocalDate.now()).getYears();
			  
			//  (uppdate)
			  boolean status = age>=18;
			  String role = status ? "voter" : "non-voter";
			
		
			
			
			// Create a User object
            User newUser = new User();
            newUser.setFirstName(firstName);
            newUser.setLastName(lastName);
            newUser.setEmail(email);
            newUser.setPassword(pwd);
            newUser.setDob(dob);
            newUser.setUserRole(role); 
            
			
             //Call the DAO method to register the user
            String result = userDao.registerUser(newUser);
			
			 //  Display success or failure message
            if ("success".equals(result)) {
                pw.println("<h3>Registration successful!</h3>");
                pw.println("<p><a href='login.html'>Click here to log in</a></p>");
            } else {
                pw.println("<h3>Registration failed. Please try again.</h3>");
                pw.println("<p><a href='voter_registration.html'>Back to registration</a></p>");
            }
		} catch (Exception e) {
			throw new ServletException("err in doXXX of" + getClass(),e);
		}
	}

}

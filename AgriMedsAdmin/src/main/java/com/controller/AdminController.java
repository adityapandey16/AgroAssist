package com.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.AdminDao;
import com.Model.Admin;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello");
		String s1=request.getParameter("uname");
		String s2=request.getParameter("pass");
		Admin ad=new Admin();
		ad.setUname(s1);
		ad.setPass(s2);
		/*ad.setUname(request.getParameter("uname"));
		ad.setPass(request.getParameter("pass"));
		*/
		AdminDao adao=new AdminDao();
	//	List<Admin> lst = new LinkedList<Admin>();
	//	lst.add(ad);
	//	int i=adao.savedata(lst);
		boolean b=adao.validateData(ad);
		System.out.println(b);
		if(b)
		{
			response.sendRedirect("DashboardView.jsp");

		}
		else
		{
			response.sendRedirect("Error");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

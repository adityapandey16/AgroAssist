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
 * Servlet implementation class Adminreg
 */
@WebServlet("/Adminreg")
public class Adminreg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminreg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Admin ad=new Admin();
		ad.setUname(request.getParameter("uname"));
		ad.setPass((request.getParameter("pass")));
		AdminDao adao=new AdminDao();
		List<Admin> lst=new LinkedList<Admin>();
		lst.add(ad);
		int i=adao.savedata(lst);
		System.out.println(i);
		if(i>0)
		{
			System.out.println("Registered the data..");
			response.sendRedirect("AdminView.jsp");
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

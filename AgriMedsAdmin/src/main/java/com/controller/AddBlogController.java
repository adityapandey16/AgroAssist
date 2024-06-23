package com.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.BlogDao;
import com.Model.Blog;

/**
 * Servlet implementation class AddBlogController
 */
@WebServlet("/AddBlogController")
public class AddBlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBlogController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Blog b=new Blog();
		b.setBlogTitle(request.getParameter("BlogTitle"));
		b.setBlogDesc(request.getParameter("BlogDesc"));
		
		BlogDao bdao=new BlogDao();
		List<Blog> lst=new LinkedList<Blog>();
		lst.add(b);
		int i=bdao.savedata(lst);
		System.out.println(i);
		if(i>0)
		{
			response.sendRedirect("DashboardView.jsp");
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

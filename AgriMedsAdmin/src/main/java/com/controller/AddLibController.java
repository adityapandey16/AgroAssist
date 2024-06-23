package com.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.LibraryDao;
import com.Model.Library;


/**
 * Servlet implementation class AddLibController
 */
@WebServlet("/AddLibController")
public class AddLibController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLibController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Library lib=new Library();
		lib.setCropId(Integer.parseInt(request.getParameter("CropId")));
		lib.setCropName(request.getParameter("CropName"));
		lib.setPathId(Integer.parseInt(request.getParameter("PathId")));
		lib.setPathName(request.getParameter("PathName"));
		lib.setCropPart(request.getParameter("CropPart"));
		lib.setCropDesc(request.getParameter("CropDesc"));
		
		LibraryDao ldao=new LibraryDao();
		List<Library> lst=new LinkedList<Library>();
		lst.add(lib);
		int i=ldao.savedata(lst);
		System.out.println(i);
		if(i>0)
		{
			System.out.println("data saved in Library2..");
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

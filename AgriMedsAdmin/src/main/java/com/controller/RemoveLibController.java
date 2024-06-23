package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.LibraryDao;
import com.Model.Library;

/**
 * Servlet implementation class RemoveLibController
 */
@WebServlet("/RemoveLibController")
public class RemoveLibController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveLibController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Library lib=new Library();
		lib.setCropId(Integer.parseInt(request.getParameter("CropId")));
		lib.setCropPart(request.getParameter("CropPart"));
		lib.setPathId(Integer.parseInt(request.getParameter("PathId")));
		LibraryDao ldao=new LibraryDao();
		int i=ldao.deleteData(lib);
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

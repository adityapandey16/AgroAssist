package community.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import community.model.community;
import communityDao.communityDao;

/**
 * Servlet implementation class CommunityServletController
 */
@WebServlet("/CommunityServletController")
public class CommunityServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommunityServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String str1=request.getParameter("questionId");
		String str2=request.getParameter("question");
		String str3=request.getParameter("AnswerId");
		String str4=request.getParameter("Answer");

		int question_id=Integer.parseInt(str1);
		int answer_id=Integer.parseInt(str3);

		community cobj=new community();
		cobj.setQuestion_id(question_id);
		cobj.setQuestion(str2);
		cobj.setAnswer_id(answer_id);
		cobj.setAnswer(str4);


		communityDao cd=new communityDao();
		List<community> lst=new LinkedList<community>();
		lst.add(cobj);
		
		int i=cd.savedata(lst);
		if(i>0)
		{
			System.out.println("data is saved..");
		}
		
		
		if(cobj!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("communityData", cobj);
			response.sendRedirect("FAQ.jsp");
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

package fr.dwaps.shs.controller;

import static fr.dwaps.shs.utils.Constants.CLIENT_ALL_JSP;
import static fr.dwaps.shs.utils.Constants.CLIENT_ALL_URI;
import static fr.dwaps.shs.utils.Constants.CLIENT_DELETE_JSP;
import static fr.dwaps.shs.utils.Constants.CLIENT_DELETE_URI;
import static fr.dwaps.shs.utils.Constants.CLIENT_EDIT_JSP;
import static fr.dwaps.shs.utils.Constants.CLIENT_EDIT_URI;
import static fr.dwaps.shs.utils.Constants.CLIENT_NEW_JSP;
import static fr.dwaps.shs.utils.Constants.CLIENT_NEW_URI;
import static fr.dwaps.shs.utils.Constants.CLIENT_ONE_JSP;
import static fr.dwaps.shs.utils.Constants.CLIENT_ONE_URI;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns= {"*.action"})
public class FrontControllerServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String jspFile = "";
		
		switch (uri.substring(uri.lastIndexOf("/"))) {
		case CLIENT_ALL_URI:
			jspFile = CLIENT_ALL_JSP;
			break;
			case CLIENT_ONE_URI:
				jspFile = CLIENT_ONE_JSP;
				break;
			case CLIENT_NEW_URI:
				jspFile = CLIENT_NEW_JSP;
				break;
			case CLIENT_EDIT_URI:
				jspFile = CLIENT_EDIT_JSP;
				break;
			case CLIENT_DELETE_URI:
				jspFile = CLIENT_DELETE_JSP;
				break;
		}
		
		req.getRequestDispatcher(jspFile).forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect(req.getContextPath()+CLIENT_ONE_URI);
	}
}

package org.jmm.cdiwebapp.servlets;

import java.io.IOException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.jmm.cdiwebapp.cdi.Message;

/**
 * Servlet implementation class NewServlet
 */
@RequestScoped  
@Named  
@WebServlet("/cdiservlet")
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	private Message message;

	@Inject
	private transient Logger logger;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("DO GET");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().write("doGet: "+message.get());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().write("doPost: "+message.get());
	}

}

package fr.dwaps.shs.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class PrepareAndExecuteFilter implements Filter {
	private static final String JSP_404 = "/WEB-INF/jsp/404.jsp";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		
		String uri = req.getRequestURI();
		
		if (uri.equals("/shs/") || uri.contains(".action") || uri.contains("jquery") ||
			uri.contains("bootstrap") || uri.contains("awesome")) {
			chain.doFilter(request, response);
		}
		else {
			req.getRequestDispatcher(JSP_404).forward(request, response);
		}
	}

}

package org.paulvargas.joker.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import javax.ejb.EJB;
import org.paulvargas.joker.ejb.CountryEJB;

@WebServlet("*.php")
public class JokerServlet extends HttpServlet {

	private static final Logger LOGGER = Logger.getLogger(JokerServlet.class.getName());

	private static final Map<String, String> ipMap = new ConcurrentHashMap<>();

	@EJB
	private CountryEJB countryEJB;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String addr = req.getRemoteAddr();
		final String state = ipMap.get(addr);
		if (state == null) {
			ipMap.put(addr, "loginLauncher");
			req.getRequestDispatcher("/WEB-INF/pages/joker/loginLauncher.jsp").forward(req, resp);
		} else {
			switch (state) {
				case "loginLauncher":
				case "login":
					ipMap.put(addr, "login");
					req.getRequestDispatcher("/WEB-INF/pages/joker/login.jsp").forward(req, resp);
					break;
				case "again":
					break;
				case "apologies":
					break;
				case "failed":
					break;
				case "enter":
					break;
				case "advise":
					break;
				default:
					break;
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final String addr = req.getRemoteAddr();
		final String state = ipMap.get(addr);
		final String username = req.getParameter("username");
		final String password = req.getParameter("password");
		if (state == null) {
			ipMap.put(addr, "loginLauncher");
			req.getRequestDispatcher("/WEB-INF/pages/joker/loginLauncher.jsp").forward(req, resp);
		} else {
			switch (state) {
				case "loginLauncher":
					ipMap.put(addr, "login");
					req.getRequestDispatcher("/WEB-INF/pages/joker/login.jsp").forward(req, resp);
					break;
				case "login":
					if (username != null && !username.trim().isEmpty()) {
						
					}
					req.getRequestDispatcher("/WEB-INF/pages/joker/login.jsp").forward(req, resp);
					break;
				case "again":
					break;
				case "apologies":
					break;
				case "failed":
					break;
				case "enter":
					break;
				case "advise":
					break;

				default:
					break;
			}
		}
	}

	public void setCountry(HttpServletRequest req, HttpServletResponse resp) {
		String header = req.getHeader("CF-IPCountry");
		req.setAttribute("country", countryEJB.getCountry(header));
	}

	private void setIp() {
		// "CF-Connecting-IP"
	}

}

package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String parameter = request.getParameter("name");
		Map map = new HashMap();
		map.put("var", "Hello "+ parameter);
		
		return new ModelAndView("success",map);
	}

}

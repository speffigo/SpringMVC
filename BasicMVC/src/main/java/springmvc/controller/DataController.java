package springmvc.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.service.DataServices;

@Controller
public class DataController extends HttpServlet {

	@Autowired
	private DataServices services;

	@RequestMapping("/add")
	public String add(@RequestParam("t1") int num1, @RequestParam("t2") int num2, ModelMap model) {
		int k = services.add(num1, num2);
		model.addAttribute("answer", k); //ModelAndView can also be used.
		return "result";

	}

	@RequestMapping("/home")
	public String home() {
		return "index";
	}

}

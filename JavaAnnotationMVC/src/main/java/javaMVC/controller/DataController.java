package javaMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataController {

	@RequestMapping("add")
	public ModelAndView add(@RequestParam int i, @RequestParam int j) {

		ModelAndView mv = new ModelAndView();
		mv.addObject("result", i + j);
		mv.setViewName("result.jsp");
		return mv;
	}

	@RequestMapping("/home")
	public String home() {
		return "index.jsp";
	}

}

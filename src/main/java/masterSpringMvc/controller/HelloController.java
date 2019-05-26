package masterSpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello, World!";
	}
	
	@RequestMapping("/hellouser")
	public String helloUser(@RequestParam(name = "username", required = false) String username, Model model) {
		model.addAttribute("message", "hello " + username);
		return "hello";
	}
}

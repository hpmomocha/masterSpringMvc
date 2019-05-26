package masterSpringMvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import masterSpringMvc.service.TwitterSearchService;

@Controller
public class TwitterController {
	@Autowired
	private TwitterSearchService twitterSearchService;
	
	@RequestMapping("/search")
	public String searchHome() {
		return "/twitter/searchPage";
	}
	
	@RequestMapping("/result")
	public String getSearchResult(@RequestParam(defaultValue = "XXX") String search, Model model) {
		List<String> resultList = twitterSearchService.getTwitter(search);
		model.addAttribute("search", search);
		model.addAttribute("result", resultList);
		
		return "/twitter/resultPage";
	}
	
	@RequestMapping(value="/postSearch", method = RequestMethod.POST)
	public String postSearch(HttpServletRequest request, RedirectAttributes redirectAttributes) {
		String keywords = request.getParameter("search");
		if (keywords.toLowerCase().contains("springboot")) {
			redirectAttributes.addFlashAttribute("error", "Try using spring or structs instead!");
			return "redirect:/search";
		}
		redirectAttributes.addAttribute("search", keywords);
		
		return "redirect:result";
	}
}

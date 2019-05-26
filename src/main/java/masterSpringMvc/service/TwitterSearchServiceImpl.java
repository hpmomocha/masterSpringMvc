package masterSpringMvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TwitterSearchServiceImpl implements TwitterSearchService {
	private final static String KEYWORD_SPRING = "spring";
	private final static String KEYWORD_STRUCTS = "structs";
	
	@Override
	public List<String> getTwitter(String keywords) {
		List<String> resultList = new ArrayList<String>();
		
		if (KEYWORD_SPRING.equals(keywords.toLowerCase())) {
			resultList.add("Result 1");
			resultList.add("Result 2");
			resultList.add("Result 3");
		} else if (KEYWORD_STRUCTS.equals(keywords.toLowerCase())) {
			resultList.add("Result 4");
			resultList.add("Result 5");
			resultList.add("Result 6");
		} else {
			resultList.add("Result 7");
			resultList.add("Result 8");
			resultList.add("Result 9");
		}
		
		return resultList;
	}

}

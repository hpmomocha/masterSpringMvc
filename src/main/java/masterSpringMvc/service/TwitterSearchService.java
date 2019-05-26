package masterSpringMvc.service;

import java.util.List;

public interface TwitterSearchService {
	public List<String> getTwitter(String keywords);
}

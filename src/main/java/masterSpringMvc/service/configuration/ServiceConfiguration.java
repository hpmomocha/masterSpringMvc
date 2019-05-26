package masterSpringMvc.service.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import masterSpringMvc.service.TwitterSearchService;
import masterSpringMvc.service.TwitterSearchServiceImpl;

@Configuration
public class ServiceConfiguration {
	
	@Bean
	public TwitterSearchService twitterSearchService() {
		return new TwitterSearchServiceImpl();
	}
}

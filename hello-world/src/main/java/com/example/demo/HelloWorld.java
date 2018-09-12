package com.example.demo;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import com.netflix.appinfo.InstanceInfo;
//import com.netflix.discovery.DiscoveryClient;

@RestController
public class HelloWorld {
//	@Autowired
//	private DiscoveryClient discoveryClient;

	// @HystrixCommand(fallbackMethod = "greeting")
	@RequestMapping(value = "helloworld", method = RequestMethod.GET)
	public String helloWorld() {
//		List<InstanceInfo> instance = discoveryClient.getInstancesById("hello-world-server");
		RestTemplate restTemplate = new RestTemplate();
		String uri = "http://localhost:8081/helloworld";
//		uri=instance.get(0).getSecureHealthCheckUrl();
		return restTemplate.getForObject(uri, String.class);
	}

	public String greeting() {
		return "Hello User!";
	}
}

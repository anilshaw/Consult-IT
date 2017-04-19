package in.consultit;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	
	@RequestMapping("/")
	public String welcome() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

}
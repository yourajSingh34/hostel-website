package com.AapnaHostel.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApnaControler 
{
@GetMapping("/")
public String home()
{
	return "ApnaHome";	
}


}

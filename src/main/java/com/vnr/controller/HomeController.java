package com.vnr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vnr.model.Email;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(){
		return "index";
	}
	
	@PostMapping("/sendMail")
		public String sendMail(@ModelAttribute Email email) {
		System.out.println(email);
		return "redirect:/";
	}
}













//package com.vnr.controller;
//
//import com.vnr.model.Email;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api")
//public class EmailController {
//	@RestController
//	@RequestMapping("/api")
//	public class EmailController {
//
//	    @Autowired
//	    private EmailService emailService;
//
//	    @PostMapping("/send-emails")
//	    public void sendEmails(@RequestBody Email email) {
//	        // Assuming you have an EmailService class to handle sending emails
//	        emailService.sendEmail(email.getTo(), email.getSubject(), email.getContent());
//	    }
//	}
//
//
//    @PostMapping("/send-emails")
//    public void sendEmails(@RequestBody Email email) {
//        // Code to send emails using emailjs or any other email sending service
//    }
//}

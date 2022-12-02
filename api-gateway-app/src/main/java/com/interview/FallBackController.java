package com.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class FallBackController {

	@Autowired
	MessageSource messageSource;

	@Value("${message}")
	private String message;

	@GetMapping("/fallback")
	public String message() {
		return "fallback action";
	}

	@GetMapping("/properties")
	public String messageFromProperties() {
		return messageSource.getMessage("first.message", null, "default message", LocaleContextHolder.getLocale());
	}

	@GetMapping("/messagefromgit")
	public String messageValue() {
		return message;
	}

}

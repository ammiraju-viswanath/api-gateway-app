package com.interview;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/fallback")
	public String message() {
		return "fallback action";
	}

}

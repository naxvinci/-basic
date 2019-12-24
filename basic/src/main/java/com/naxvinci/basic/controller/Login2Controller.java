package com.naxvinci.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//뒤의 세션컨트롤러 때문에 임의로 변수명 바꿔두었음+ 컨트롤러 어노테이션 막아둠
//@Controller
public class Login2Controller {
	@GetMapping("/login2")
	public String login2() {
		return "login2";
	}
	@PostMapping("/login2")
	@ResponseBody
	public String loginPost(
			@RequestParam("id") String id,
			@RequestParam("pw") String pw) {
		
		String dbId = "boot";
		String dbPw = "1234";
		
		if(dbId.equals(id) && dbPw.equals(pw)) {
			return "로그인 성공";
		}
		return "로그인 실패";
	}
}

package com.naxvinci.basic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class HomeController {
	Logger logger = 
			LoggerFactory.getLogger(this.getClass());
	// Shift + Alt + A : 열편집
	@RequestMapping("/")
	public String home() {
		log.trace("trace!");
		log.debug("debug!");  //여기까지는 개발단계에서 확인용
		log.info("info!");    // 운용 상 필요한 정보
		log.warn("warning!"); //메모리 문제 등 경고 -동작이 되긴 되는데 위태위태하다
		log.error("error!");  // 치명적 오류 - 동작이 안된다. 문제다 
		
		return "home";
	}
}	
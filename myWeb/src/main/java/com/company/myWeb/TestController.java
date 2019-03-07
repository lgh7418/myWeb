package com.company.myWeb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.domain.UserVO;

@Controller
@RequestMapping("/test/")
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("doA")
	public void doA() {
		logger.info("doA가 호출되었습니다");
	}
	
	@RequestMapping("doB")
	public void doB() {
		logger.info("doB가 호출되었습니다");
	}
	
	@RequestMapping("testA")
	public void testA() {
		logger.info("testA가 호출되었습니다.");
	}
	
	@RequestMapping("testB")
	public String testB(@ModelAttribute("msg") String msg, Model model) {
		logger.info("testB가 호출되었습니다.");
		model.addAttribute("msg", msg);
		return "spring";
	}
	
	@RequestMapping("getBean")
	public String getBean(Model model) {
		logger.info("getBean이 출력되었습니다");
		UserVO temp = new UserVO();
/*		temp.setUid("spring");
		temp.setUpw("1234");
		temp.setUname("홍길동");
		temp.setNick("곰돌이");
		temp.setEmail("hong@spring.kr");
		temp.setAddr("부산시 부산진구 양정동");
		temp.setPhone("010-1111-2222");*/
		model.addAttribute("user", temp);
		return "getBean";
	}
}

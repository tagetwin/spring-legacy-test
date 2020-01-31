package com.cos.springlegacy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cos.springlegacy.dto.RequestInfoDto;


// http://localhost:8080/springlegacy
// Controller 어노테이션은 페이지를 리턴하는 어노테이션이다.
// RestController 는 AJAX
@Controller
public class HomeController {
	
	// 1. 데이터 전달 - 쿼리스트링, Form 데이터, Json
	
	// 2. 데이터 받기 - 쿼리스트링, Form 데이터, Json
	
	// 3. Pathvariable 사용해보기
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		// Controller 어노테이션이 있는 클래스에서 함수가 retrun하는 순간 
		// ViewResolver가 관여하여 prefix와 suffix를 만들어서
		// 페이지를 return 해준다.
		// 디스패쳐는 Controller 와 RestController 만 찾는다.
		
		// request에 담기 => model
		
		String username ="ssar";
		model.addAttribute("username", username); //Object 타입
		
		return "home";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) { //QueryStirng, x-www-formurlencoded
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
		return "hello";
	}
	
	@RequestMapping(value = "/goodbye", method = RequestMethod.GET)
	public String goodbye(RequestInfoDto requestInfoDto) {
		
		System.out.println("addr :"+ requestInfoDto.getAddr());
		System.out.println("hobby :"+ requestInfoDto.getHobby());
		return "goodbye";
	}
}

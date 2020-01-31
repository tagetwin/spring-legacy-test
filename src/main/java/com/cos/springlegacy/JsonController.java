package com.cos.springlegacy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.springlegacy.dto.RequestJsonDto;

@Controller
public class JsonController {

	// 포스트맨으로 json을 날려도 null이라고 인식한다.
	// 스프링은 form의 name값 혹은 쿼리스트링만 오브젝트로 자동 변환!!
	@RequestMapping(value="/jsonHome", method=RequestMethod.POST)
	public @ResponseBody RequestJsonDto jsonHome(@RequestBody RequestJsonDto requestJsonDto) { // {제이슨}
		
		System.out.println(requestJsonDto.getId());
		System.out.println(requestJsonDto.getPw());
		
		return requestJsonDto;
	}
	
	@RequestMapping(value="/jsonHome/{num}", method=RequestMethod.GET)
	public String jsonHome(@PathVariable int num){
		
		System.out.println("num :" + num);
		return "jsonHome"; 
	}
}

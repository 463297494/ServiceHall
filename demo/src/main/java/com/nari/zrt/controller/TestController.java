package com.nari.zrt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nari.zrt.entity.Member;
import com.nari.zrt.service.MemberService;

@Controller
public class TestController {
	private final static Logger logger = LoggerFactory.getLogger(TestController.class);
	@Autowired
	private MemberService memberService;

	@RequestMapping("/demo")
	@ResponseBody
	public Member findMemberById(Long mid) {
		Member member = memberService.findMemberById(mid);
		logger.info(member.toString());
		return member;
	}
}

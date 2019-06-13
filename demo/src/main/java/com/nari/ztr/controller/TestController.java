package com.nari.ztr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nari.ztr.entity.Member;
import com.nari.ztr.service.MemberService;

@Controller
public class TestController {
	private final static Logger logger = LoggerFactory.getLogger(TestController.class);
	@Autowired
	private MemberService memberService;

	@RequestMapping("/demo")
	@ResponseBody
	public Member findMemberById(Long mid) {
		logger.info(memberService.findMemberById(mid).toString());
		return memberService.findMemberById(mid);
	}
}

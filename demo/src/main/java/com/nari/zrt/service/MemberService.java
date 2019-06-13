package com.nari.zrt.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nari.zrt.dao.IMemberDao;
import com.nari.zrt.entity.Member;
import com.nari.zrt.utils.RedisUtil;

@Service
@Transactional(rollbackFor = Exception.class)
public class MemberService {
	@Resource
	private IMemberDao memberDaoImpl;

	@Autowired
	private RedisUtil redisUtil;

	public Member findMemberById(Long mid) {
		Object obj = redisUtil.get("servicehall.demo.id" + mid);
		if (obj != null) {
			return (Member) obj;
		} else {
			redisUtil.set("servicehall.demo.id" + mid, memberDaoImpl.findMemberById(mid));
			return memberDaoImpl.findMemberById(mid);
		}
	}
}

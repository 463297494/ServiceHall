package com.nari.ztr.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nari.ztr.dao.IMemberDao;
import com.nari.ztr.entity.Member;

@Service
@Transactional(rollbackFor = Exception.class)
public class MemberService {
	@Resource
	private IMemberDao memberDaoImpl;

	public Member findMemberById(Long mid) {
		return memberDaoImpl.findMemberById(mid);
	}
}

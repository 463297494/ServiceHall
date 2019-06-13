package com.nari.zrt.dao;

import com.nari.zrt.entity.Member;

public interface IMemberDao {
	public Member findMemberById(Long mid);
}

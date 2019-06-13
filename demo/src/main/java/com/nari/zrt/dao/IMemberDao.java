package com.nari.ztr.dao;

import com.nari.ztr.entity.Member;

public interface IMemberDao {
	public Member findMemberById(Long mid);
}

package com.hong.persistence;

import com.hong.domain.MemberVO;

public interface MemberDAO {
	
	public void signup(MemberVO vo) throws Exception;
	public MemberVO signin(MemberVO vo) throws Exception;
}

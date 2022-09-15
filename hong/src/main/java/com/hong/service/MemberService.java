package com.hong.service;

import javax.servlet.http.HttpSession;

import com.hong.domain.MemberVO;

public interface MemberService {

	public void signup(MemberVO vo) throws Exception;
	
	public MemberVO signin(MemberVO vo) throws Exception;
	
	public void signout(HttpSession session) throws Exception;
}

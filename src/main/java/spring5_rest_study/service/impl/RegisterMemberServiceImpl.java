package spring5_rest_study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_rest_study.dto.Member;
import spring5_rest_study.mappers.MemberMapper;
import spring5_rest_study.service.RegisterMemberService;

@Service
public class RegisterMemberServiceImpl implements RegisterMemberService {

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public int registerMember(Member member) {
		return memberMapper.insertMember(member);
	}

}

package spring5_rest_study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_rest_study.dto.Member;
import spring5_rest_study.mappers.MemberMapper;
import spring5_rest_study.service.RemoveMemberService;

@Service
public class RemoveMemberServiceImpl implements RemoveMemberService {

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public int removeMember(Member member) {
		return memberMapper.deleteMember(member);
	}

}

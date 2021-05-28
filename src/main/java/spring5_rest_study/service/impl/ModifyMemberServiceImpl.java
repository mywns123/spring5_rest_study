package spring5_rest_study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_rest_study.dto.Member;
import spring5_rest_study.mappers.MemberMapper;
import spring5_rest_study.service.ModifyMemberService;

@Service
public class ModifyMemberServiceImpl implements ModifyMemberService {

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public int modifyMember(Member member) {
		return memberMapper.updateMember(member);
	}

}

package spring5_rest_study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_rest_study.dto.Member;
import spring5_rest_study.mappers.MemberMapper;
import spring5_rest_study.service.GetMemberService;

@Service
public class GetMemberServiceImpl implements GetMemberService {

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public Member showMemberbyId(long memId) {
		return memberMapper.selectbyId(memId);
	}

}

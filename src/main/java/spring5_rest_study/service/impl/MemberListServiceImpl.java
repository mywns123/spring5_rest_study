package spring5_rest_study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_rest_study.dto.Member;
import spring5_rest_study.mappers.MemberMapper;
import spring5_rest_study.service.MemberListService;

@Service
public class MemberListServiceImpl implements MemberListService {

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public List<Member> showMembers() {
		return memberMapper.selectMemberByAll();
	}

}

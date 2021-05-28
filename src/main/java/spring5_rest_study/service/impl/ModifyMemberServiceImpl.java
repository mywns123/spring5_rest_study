package spring5_rest_study.service.impl;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_rest_study.dto.Member;
import spring5_rest_study.mappers.MemberMapper;
import spring5_rest_study.service.ModifyMemberService;

@Service
public class ModifyMemberServiceImpl implements ModifyMemberService {
	private static final Log log = LogFactory.getLog(ModifyMemberServiceImpl.class);

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public int modifyMember(Member member) {
		log.debug("service - getLists() > " + member);
		return memberMapper.updateMember(member);
	}

}

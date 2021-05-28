package spring5_rest_study.service.impl;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_rest_study.dto.Member;
import spring5_rest_study.mappers.MemberMapper;
import spring5_rest_study.service.GetMemberService;

@Service
public class GetMemberServiceImpl implements GetMemberService {

	private static final Log log = LogFactory.getLog(GetMemberServiceImpl.class);

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public Member showMemberbyId(long id) {		
		log.debug("service - getLists() > " + id);
		return memberMapper.selectbyId(id);
	}

}

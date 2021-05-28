package spring5_rest_study.service.impl;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_rest_study.mappers.MemberMapper;
import spring5_rest_study.service.RemoveMemberService;

@Service
public class RemoveMemberServiceImpl implements RemoveMemberService {
	private static final Log log = LogFactory.getLog(RemoveMemberServiceImpl.class);

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public int removeMember(long id) {
		log.debug("service - getLists() > " + id);
		return memberMapper.deleteMember(id);
	}

}

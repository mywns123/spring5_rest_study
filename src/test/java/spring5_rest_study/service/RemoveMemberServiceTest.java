package spring5_rest_study.service;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import spring5_rest_study.config.ContextRoot;
import spring5_rest_study.dto.Member;
import spring5_rest_study.mappers.MemberMapperTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
@WebAppConfiguration
public class RemoveMemberServiceTest {

	private static final Log log = LogFactory.getLog(MemberMapperTest.class);

	@Autowired
	private RemoveMemberService removeService;

	@Autowired
	private RegisterMemberService regService;
	
	@Test
	public void testRemoveMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Member member = new Member("test100test.co.kr", "1111", "test100");
		regService.registerMember(member);
		
		
		int res = removeService.removeMember(member.getId());
		Assert.assertEquals(1, res);
		
		log.debug("res > " + res);
	}

}

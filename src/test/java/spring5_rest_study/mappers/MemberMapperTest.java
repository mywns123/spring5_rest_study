package spring5_rest_study.mappers;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import spring5_rest_study.config.ContextRoot;
import spring5_rest_study.dto.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WebAppConfiguration
public class MemberMapperTest {

	private static final Log log = LogFactory.getLog(MemberMapperTest.class);

	@Autowired
	private MemberMapper mapper;

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test01SelectMemberByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		List<Member> list = mapper.selectMemberByAll();
		Assert.assertNotNull(list);
		list.stream().forEach(s -> log.debug(s.toString()));
	}

	@Test
	public void test04SelectbyId() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
						
		Member member = mapper.selectbyId(2);
		log.debug(member.toString());		
		Assert.assertNotNull(member);
		
		log.debug(member.toString());
	}

	@Test
	public void test02InsertMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		Member member = new Member("test06@test.co.kr", "1111", "test06");
		int res = mapper.insertMember(member);
		Assert.assertEquals(1, res);
		log.debug("res id >> " + res);
		
		mapper.deleteMember(member.getId());
	}

	@Test
	public void test03UpdateMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		Member member = new Member("test07@test.co.kr", "1111", "test07");
		mapper.insertMember(member);
		
		member.setName("test07!!");;
		int res = mapper.updateMember(member);
		Assert.assertEquals(1, res);
		
		mapper.deleteMember(member.getId());
	}

	@Test
	public void test05DeleteMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		Member member = new Member("test08@test.co.kr", "1111", "test08");
		mapper.insertMember(member);
		
		
		int res = mapper.deleteMember(member.getId());
		Assert.assertEquals(1, res);
	}

}

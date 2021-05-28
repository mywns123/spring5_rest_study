package spring5_rest_study.controller;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring5_rest_study.service.ModifyMemberService;
import spring5_rest_study.service.impl.RegisterMemberServiceImpl;

@Controller
public class MemberController {

	private static final Log log = LogFactory.getLog(MemberController.class);

	@Autowired
	private ModifyMemberService modService;

	@GetMapping("/update")
	public ModelAndView updateMember(@RequestParam(value = "id") long id) {
		ModelAndView mav = new ModelAndView("member/update", "id", id);
		return mav;
	}
}

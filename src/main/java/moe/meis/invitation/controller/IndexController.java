package moe.meis.invitation.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import moe.meis.invitation.pojo.Eply;
import moe.meis.invitation.pojo.Invitation;
import moe.meis.invitation.service.EplyService;
import moe.meis.invitation.service.InvitationService;

@Controller
@RequestMapping
public class IndexController {
	
	@Autowired
	private InvitationService invitationService;
	@Autowired
	private EplyService eplyService;
	@RequestMapping
	public String index(Model model,String flag,@RequestParam(required=true,defaultValue="1") int pageNum,
			@RequestParam(required=false,defaultValue="9") int size) {	
		
		PageHelper.startPage(pageNum,size);
		List<Invitation> list=invitationService.list();
		PageInfo<Invitation> page=new PageInfo<>(list);
		model.addAttribute("page", page);
		model.addAttribute("inviation", list);
		model.addAttribute("flag", flag);
		return "index";
	}
	@RequestMapping("getByTitle")
	public String getByTitle(String title,Model model){
		model.addAttribute("title", title);
		model.addAttribute("inviation", invitationService.getByTitle(title));
		return "index";
	}
	
	@RequestMapping("getByKey")
	public String getByKey(Integer invid ,Model model) {
		model.addAttribute("invid",invid);
		model.addAttribute("emplys", eplyService.list(invid));
		return "look";
	}
	//转添加液
	@RequestMapping("save")
	public String save(Integer invid ,Model model) {
		model.addAttribute("invid", invid);
		return "add";
	}
	@RequestMapping("dosave")
	public String saveemply(HttpServletResponse response ,Eply eply ,Model model) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		eply.setCreatedate(new Date());
		model.addAttribute("invid", eply.getInvid());
		if (eplyService.save(eply)) {
			writer.print("<script>alert('成功');parent.location.href=\"/getByKey/?invid="+eply.getInvid()+"\";</script>");
			return null;
		}
		writer.print("<script>alert('失败');parent.location.href=\"/getByKey/?invid="+eply.getInvid()+"\";</script>");
		return null;
	}
	
	
	@RequestMapping("removeByKey")
	public String remove(int id ,HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		String flag="删除失败";
		if (invitationService.removeByKey(id)) {
			if (eplyService.removeByInvids(id)) {
			 flag="删除成功";
			}
		}
		System.out.println(">>>>>>>"+flag);
		writer.print("<script>parent.location.href=\"/?flag="+flag+"\";</script>");
		return null;
	}
}

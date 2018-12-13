package moe.meis.invitation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moe.meis.invitation.mapper.InvitationMapper;
import moe.meis.invitation.pojo.Invitation;
import moe.meis.invitation.pojo.InvitationExample;
import moe.meis.invitation.pojo.InvitationExample.Criteria;

@Service
public class InvitationServiceImpl implements InvitationService {

	@Autowired
	private InvitationMapper mapper;
		
	@Override
	public List<Invitation> list() {
		// TODO Auto-generated method stub
		InvitationExample example = new InvitationExample();
	
		return	mapper.selectByExample(example);
	}

	@Override
	public List<Invitation>  getByTitle(String title) {
		InvitationExample example = new InvitationExample();
		Criteria criteria = example.createCriteria();
		criteria.andTitleLike("%"+title+"%");
		
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public Invitation getByByKey(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean removeByKey(int id) {
		// TODO Auto-generated method stub
		if (mapper.deleteByPrimaryKey(id)>0) {
			return true;
		}
		return false;
	}

}

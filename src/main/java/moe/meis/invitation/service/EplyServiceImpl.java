package moe.meis.invitation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moe.meis.invitation.mapper.EplyMapper;
import moe.meis.invitation.pojo.Eply;
import moe.meis.invitation.pojo.EplyExample;
import moe.meis.invitation.pojo.EplyExample.Criteria;

@Service
public class EplyServiceImpl implements EplyService {

	@Autowired
	private EplyMapper mapper;
	@Override
	public List<Eply> list(int id) {
		// TODO Auto-generated method stub
		EplyExample example = new EplyExample();
		Criteria criteria = example.createCriteria();
		criteria.andInvidEqualTo(id);
		return mapper.selectByExample(example);
	}

	@Override
	public boolean save(Eply eply) {
		// TODO Auto-generated method stub
		if (mapper.insertSelective(eply)>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean removeByInvids(int invid) {
		// TODO Auto-generated method stub
		EplyExample example = new EplyExample();
		Criteria criteria = example.createCriteria();
		criteria.andInvidEqualTo(invid);
		if (mapper.deleteByExample(example)>0) {
			return true;
		}
		return false;
	}

}

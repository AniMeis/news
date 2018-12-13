package moe.meis.invitation.service;

import java.util.List;

import moe.meis.invitation.pojo.Eply;

public interface EplyService {

	public  List<Eply> list(int id);
	public boolean save(Eply eply );
	public boolean removeByInvids(int invid);

}

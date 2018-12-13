package moe.meis.invitation.service;

import java.util.List;
import moe.meis.invitation.pojo.Invitation;

public interface InvitationService {
	public List<Invitation> list();
	public List<Invitation>  getByTitle(String title);
	public Invitation getByByKey(int id);
	public boolean removeByKey(int id);

}

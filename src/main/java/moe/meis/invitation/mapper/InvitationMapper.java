package moe.meis.invitation.mapper;

import java.util.List;
import moe.meis.invitation.pojo.Invitation;
import moe.meis.invitation.pojo.InvitationExample;
import org.apache.ibatis.annotations.Param;

public interface InvitationMapper {
    int countByExample(InvitationExample example);

    int deleteByExample(InvitationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Invitation record);

    int insertSelective(Invitation record);

    List<Invitation> selectByExample(InvitationExample example);

    Invitation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Invitation record, @Param("example") InvitationExample example);

    int updateByExample(@Param("record") Invitation record, @Param("example") InvitationExample example);

    int updateByPrimaryKeySelective(Invitation record);

    int updateByPrimaryKey(Invitation record);
}
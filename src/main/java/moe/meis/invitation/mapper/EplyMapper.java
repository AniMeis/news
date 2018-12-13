package moe.meis.invitation.mapper;

import java.util.List;
import moe.meis.invitation.pojo.Eply;
import moe.meis.invitation.pojo.EplyExample;
import org.apache.ibatis.annotations.Param;

public interface EplyMapper {
    int countByExample(EplyExample example);

    int deleteByExample(EplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Eply record);

    int insertSelective(Eply record);

    List<Eply> selectByExample(EplyExample example);

    Eply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Eply record, @Param("example") EplyExample example);

    int updateByExample(@Param("record") Eply record, @Param("example") EplyExample example);

    int updateByPrimaryKeySelective(Eply record);

    int updateByPrimaryKey(Eply record);
}
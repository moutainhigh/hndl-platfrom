package com.hndl.cn.dao.admin.mapper;

import com.hndl.cn.dao.admin.bean.AdminUserInfoDo;
import com.hndl.cn.dao.admin.bean.AdminUserInfoDoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminUserInfoMapper {
    long countByExample(AdminUserInfoDoExample example);

    int deleteByExample(AdminUserInfoDoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminUserInfoDo record);

    int insertSelective(AdminUserInfoDo record);

    List<AdminUserInfoDo> selectByExample(AdminUserInfoDoExample example);

    AdminUserInfoDo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminUserInfoDo record, @Param("example") AdminUserInfoDoExample example);

    int updateByExample(@Param("record") AdminUserInfoDo record, @Param("example") AdminUserInfoDoExample example);

    int updateByPrimaryKeySelective(AdminUserInfoDo record);

    int updateByPrimaryKey(AdminUserInfoDo record);
}
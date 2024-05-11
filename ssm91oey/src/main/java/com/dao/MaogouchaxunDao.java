package com.dao;

import com.entity.MaogouchaxunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MaogouchaxunVO;
import com.entity.view.MaogouchaxunView;


/**
 * 猫狗查询
 * 
 * @author 
 * @email 
 * @date 2021-03-30 19:16:27
 */
public interface MaogouchaxunDao extends BaseMapper<MaogouchaxunEntity> {
	
	List<MaogouchaxunVO> selectListVO(@Param("ew") Wrapper<MaogouchaxunEntity> wrapper);
	
	MaogouchaxunVO selectVO(@Param("ew") Wrapper<MaogouchaxunEntity> wrapper);
	
	List<MaogouchaxunView> selectListView(@Param("ew") Wrapper<MaogouchaxunEntity> wrapper);

	List<MaogouchaxunView> selectListView(Pagination page,@Param("ew") Wrapper<MaogouchaxunEntity> wrapper);
	
	MaogouchaxunView selectView(@Param("ew") Wrapper<MaogouchaxunEntity> wrapper);
	
}

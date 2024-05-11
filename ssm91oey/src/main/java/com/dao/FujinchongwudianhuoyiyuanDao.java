package com.dao;

import com.entity.FujinchongwudianhuoyiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FujinchongwudianhuoyiyuanVO;
import com.entity.view.FujinchongwudianhuoyiyuanView;


/**
 * 附近宠物店或医院
 * 
 * @author 
 * @email 
 * @date 2021-03-30 19:16:27
 */
public interface FujinchongwudianhuoyiyuanDao extends BaseMapper<FujinchongwudianhuoyiyuanEntity> {
	
	List<FujinchongwudianhuoyiyuanVO> selectListVO(@Param("ew") Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper);
	
	FujinchongwudianhuoyiyuanVO selectVO(@Param("ew") Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper);
	
	List<FujinchongwudianhuoyiyuanView> selectListView(@Param("ew") Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper);

	List<FujinchongwudianhuoyiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper);
	
	FujinchongwudianhuoyiyuanView selectView(@Param("ew") Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper);
	
}

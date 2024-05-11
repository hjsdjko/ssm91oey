package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FujinchongwudianhuoyiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FujinchongwudianhuoyiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FujinchongwudianhuoyiyuanView;


/**
 * 附近宠物店或医院
 *
 * @author 
 * @email 
 * @date 2021-03-30 19:16:27
 */
public interface FujinchongwudianhuoyiyuanService extends IService<FujinchongwudianhuoyiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FujinchongwudianhuoyiyuanVO> selectListVO(Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper);
   	
   	FujinchongwudianhuoyiyuanVO selectVO(@Param("ew") Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper);
   	
   	List<FujinchongwudianhuoyiyuanView> selectListView(Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper);
   	
   	FujinchongwudianhuoyiyuanView selectView(@Param("ew") Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper);
   	
}


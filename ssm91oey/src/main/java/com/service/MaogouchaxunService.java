package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MaogouchaxunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MaogouchaxunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MaogouchaxunView;


/**
 * 猫狗查询
 *
 * @author 
 * @email 
 * @date 2021-03-30 19:16:27
 */
public interface MaogouchaxunService extends IService<MaogouchaxunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MaogouchaxunVO> selectListVO(Wrapper<MaogouchaxunEntity> wrapper);
   	
   	MaogouchaxunVO selectVO(@Param("ew") Wrapper<MaogouchaxunEntity> wrapper);
   	
   	List<MaogouchaxunView> selectListView(Wrapper<MaogouchaxunEntity> wrapper);
   	
   	MaogouchaxunView selectView(@Param("ew") Wrapper<MaogouchaxunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MaogouchaxunEntity> wrapper);
   	
}


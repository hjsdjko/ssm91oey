package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FujinchongwudianhuoyiyuanDao;
import com.entity.FujinchongwudianhuoyiyuanEntity;
import com.service.FujinchongwudianhuoyiyuanService;
import com.entity.vo.FujinchongwudianhuoyiyuanVO;
import com.entity.view.FujinchongwudianhuoyiyuanView;

@Service("fujinchongwudianhuoyiyuanService")
public class FujinchongwudianhuoyiyuanServiceImpl extends ServiceImpl<FujinchongwudianhuoyiyuanDao, FujinchongwudianhuoyiyuanEntity> implements FujinchongwudianhuoyiyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FujinchongwudianhuoyiyuanEntity> page = this.selectPage(
                new Query<FujinchongwudianhuoyiyuanEntity>(params).getPage(),
                new EntityWrapper<FujinchongwudianhuoyiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper) {
		  Page<FujinchongwudianhuoyiyuanView> page =new Query<FujinchongwudianhuoyiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FujinchongwudianhuoyiyuanVO> selectListVO(Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FujinchongwudianhuoyiyuanVO selectVO(Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FujinchongwudianhuoyiyuanView> selectListView(Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FujinchongwudianhuoyiyuanView selectView(Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

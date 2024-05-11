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


import com.dao.MaogouchaxunDao;
import com.entity.MaogouchaxunEntity;
import com.service.MaogouchaxunService;
import com.entity.vo.MaogouchaxunVO;
import com.entity.view.MaogouchaxunView;

@Service("maogouchaxunService")
public class MaogouchaxunServiceImpl extends ServiceImpl<MaogouchaxunDao, MaogouchaxunEntity> implements MaogouchaxunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MaogouchaxunEntity> page = this.selectPage(
                new Query<MaogouchaxunEntity>(params).getPage(),
                new EntityWrapper<MaogouchaxunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MaogouchaxunEntity> wrapper) {
		  Page<MaogouchaxunView> page =new Query<MaogouchaxunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MaogouchaxunVO> selectListVO(Wrapper<MaogouchaxunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MaogouchaxunVO selectVO(Wrapper<MaogouchaxunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MaogouchaxunView> selectListView(Wrapper<MaogouchaxunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MaogouchaxunView selectView(Wrapper<MaogouchaxunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

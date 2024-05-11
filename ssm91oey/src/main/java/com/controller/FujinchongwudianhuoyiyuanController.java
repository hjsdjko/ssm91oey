package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FujinchongwudianhuoyiyuanEntity;
import com.entity.view.FujinchongwudianhuoyiyuanView;

import com.service.FujinchongwudianhuoyiyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 附近宠物店或医院
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-30 19:16:27
 */
@RestController
@RequestMapping("/fujinchongwudianhuoyiyuan")
public class FujinchongwudianhuoyiyuanController {
    @Autowired
    private FujinchongwudianhuoyiyuanService fujinchongwudianhuoyiyuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FujinchongwudianhuoyiyuanEntity fujinchongwudianhuoyiyuan, 
		HttpServletRequest request){

        EntityWrapper<FujinchongwudianhuoyiyuanEntity> ew = new EntityWrapper<FujinchongwudianhuoyiyuanEntity>();
		PageUtils page = fujinchongwudianhuoyiyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fujinchongwudianhuoyiyuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FujinchongwudianhuoyiyuanEntity fujinchongwudianhuoyiyuan, HttpServletRequest request){
        EntityWrapper<FujinchongwudianhuoyiyuanEntity> ew = new EntityWrapper<FujinchongwudianhuoyiyuanEntity>();
		PageUtils page = fujinchongwudianhuoyiyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fujinchongwudianhuoyiyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FujinchongwudianhuoyiyuanEntity fujinchongwudianhuoyiyuan){
       	EntityWrapper<FujinchongwudianhuoyiyuanEntity> ew = new EntityWrapper<FujinchongwudianhuoyiyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fujinchongwudianhuoyiyuan, "fujinchongwudianhuoyiyuan")); 
        return R.ok().put("data", fujinchongwudianhuoyiyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FujinchongwudianhuoyiyuanEntity fujinchongwudianhuoyiyuan){
        EntityWrapper< FujinchongwudianhuoyiyuanEntity> ew = new EntityWrapper< FujinchongwudianhuoyiyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fujinchongwudianhuoyiyuan, "fujinchongwudianhuoyiyuan")); 
		FujinchongwudianhuoyiyuanView fujinchongwudianhuoyiyuanView =  fujinchongwudianhuoyiyuanService.selectView(ew);
		return R.ok("查询附近宠物店或医院成功").put("data", fujinchongwudianhuoyiyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FujinchongwudianhuoyiyuanEntity fujinchongwudianhuoyiyuan = fujinchongwudianhuoyiyuanService.selectById(id);
        return R.ok().put("data", fujinchongwudianhuoyiyuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FujinchongwudianhuoyiyuanEntity fujinchongwudianhuoyiyuan = fujinchongwudianhuoyiyuanService.selectById(id);
        return R.ok().put("data", fujinchongwudianhuoyiyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FujinchongwudianhuoyiyuanEntity fujinchongwudianhuoyiyuan, HttpServletRequest request){
    	fujinchongwudianhuoyiyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fujinchongwudianhuoyiyuan);

        fujinchongwudianhuoyiyuanService.insert(fujinchongwudianhuoyiyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FujinchongwudianhuoyiyuanEntity fujinchongwudianhuoyiyuan, HttpServletRequest request){
    	fujinchongwudianhuoyiyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fujinchongwudianhuoyiyuan);

        fujinchongwudianhuoyiyuanService.insert(fujinchongwudianhuoyiyuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FujinchongwudianhuoyiyuanEntity fujinchongwudianhuoyiyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fujinchongwudianhuoyiyuan);
        fujinchongwudianhuoyiyuanService.updateById(fujinchongwudianhuoyiyuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fujinchongwudianhuoyiyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FujinchongwudianhuoyiyuanEntity> wrapper = new EntityWrapper<FujinchongwudianhuoyiyuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = fujinchongwudianhuoyiyuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

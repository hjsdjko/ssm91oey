package com.entity.view;

import com.entity.FujinchongwudianhuoyiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 附近宠物店或医院
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-30 19:16:27
 */
@TableName("fujinchongwudianhuoyiyuan")
public class FujinchongwudianhuoyiyuanView  extends FujinchongwudianhuoyiyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FujinchongwudianhuoyiyuanView(){
	}
 
 	public FujinchongwudianhuoyiyuanView(FujinchongwudianhuoyiyuanEntity fujinchongwudianhuoyiyuanEntity){
 	try {
			BeanUtils.copyProperties(this, fujinchongwudianhuoyiyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

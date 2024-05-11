package com.entity.view;

import com.entity.MaogouchaxunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 猫狗查询
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-30 19:16:27
 */
@TableName("maogouchaxun")
public class MaogouchaxunView  extends MaogouchaxunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MaogouchaxunView(){
	}
 
 	public MaogouchaxunView(MaogouchaxunEntity maogouchaxunEntity){
 	try {
			BeanUtils.copyProperties(this, maogouchaxunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

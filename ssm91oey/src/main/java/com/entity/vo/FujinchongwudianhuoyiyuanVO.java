package com.entity.vo;

import com.entity.FujinchongwudianhuoyiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 附近宠物店或医院
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-30 19:16:27
 */
public class FujinchongwudianhuoyiyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 店名
	 */
	
	private String dianming;
		
	/**
	 * 营业时间
	 */
	
	private String yingyeshijian;
		
	/**
	 * 具体地址
	 */
	
	private String jutidizhi;
				
	
	/**
	 * 设置：店名
	 */
	 
	public void setDianming(String dianming) {
		this.dianming = dianming;
	}
	
	/**
	 * 获取：店名
	 */
	public String getDianming() {
		return dianming;
	}
				
	
	/**
	 * 设置：营业时间
	 */
	 
	public void setYingyeshijian(String yingyeshijian) {
		this.yingyeshijian = yingyeshijian;
	}
	
	/**
	 * 获取：营业时间
	 */
	public String getYingyeshijian() {
		return yingyeshijian;
	}
				
	
	/**
	 * 设置：具体地址
	 */
	 
	public void setJutidizhi(String jutidizhi) {
		this.jutidizhi = jutidizhi;
	}
	
	/**
	 * 获取：具体地址
	 */
	public String getJutidizhi() {
		return jutidizhi;
	}
			
}

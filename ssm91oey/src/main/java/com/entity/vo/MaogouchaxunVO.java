package com.entity.vo;

import com.entity.MaogouchaxunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 猫狗查询
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-30 19:16:27
 */
public class MaogouchaxunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 品种名
	 */
	
	private String pinzhongming;
		
	/**
	 * 大概价格
	 */
	
	private String dagaijiage;
		
	/**
	 * 特征描述
	 */
	
	private String tezhengmiaoshu;
		
	/**
	 * 介绍
	 */
	
	private String jieshao;
				
	
	/**
	 * 设置：品种名
	 */
	 
	public void setPinzhongming(String pinzhongming) {
		this.pinzhongming = pinzhongming;
	}
	
	/**
	 * 获取：品种名
	 */
	public String getPinzhongming() {
		return pinzhongming;
	}
				
	
	/**
	 * 设置：大概价格
	 */
	 
	public void setDagaijiage(String dagaijiage) {
		this.dagaijiage = dagaijiage;
	}
	
	/**
	 * 获取：大概价格
	 */
	public String getDagaijiage() {
		return dagaijiage;
	}
				
	
	/**
	 * 设置：特征描述
	 */
	 
	public void setTezhengmiaoshu(String tezhengmiaoshu) {
		this.tezhengmiaoshu = tezhengmiaoshu;
	}
	
	/**
	 * 获取：特征描述
	 */
	public String getTezhengmiaoshu() {
		return tezhengmiaoshu;
	}
				
	
	/**
	 * 设置：介绍
	 */
	 
	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}
	
	/**
	 * 获取：介绍
	 */
	public String getJieshao() {
		return jieshao;
	}
			
}

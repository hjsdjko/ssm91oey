package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 猫狗查询
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-30 19:16:27
 */
@TableName("maogouchaxun")
public class MaogouchaxunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MaogouchaxunEntity() {
		
	}
	
	public MaogouchaxunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
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

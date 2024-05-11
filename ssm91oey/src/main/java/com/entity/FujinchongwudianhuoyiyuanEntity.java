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
 * 附近宠物店或医院
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-30 19:16:27
 */
@TableName("fujinchongwudianhuoyiyuan")
public class FujinchongwudianhuoyiyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FujinchongwudianhuoyiyuanEntity() {
		
	}
	
	public FujinchongwudianhuoyiyuanEntity(T t) {
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
	 * 店面照片
	 */
					
	private String dianmianzhaopian;
	
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
	 * 设置：店面照片
	 */
	public void setDianmianzhaopian(String dianmianzhaopian) {
		this.dianmianzhaopian = dianmianzhaopian;
	}
	/**
	 * 获取：店面照片
	 */
	public String getDianmianzhaopian() {
		return dianmianzhaopian;
	}
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

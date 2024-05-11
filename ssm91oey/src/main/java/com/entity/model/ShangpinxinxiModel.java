package com.entity.model;

import com.entity.ShangpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 商品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-30 19:16:27
 */
public class ShangpinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品类别
	 */
	
	private String shangpinleibie;
		
	/**
	 * 销量
	 */
	
	private Integer xiaoliang;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 商品信息
	 */
	
	private String shangpinxinxi;
		
	/**
	 * 店主姓名
	 */
	
	private String dianzhuxingming;
		
	/**
	 * 店主账号
	 */
	
	private String dianzhuzhanghao;
		
	/**
	 * 商品状态
	 */
	
	private String shangpinzhuangtai;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
		
	/**
	 * 单限
	 */
	
	private Integer onelimittimes;
		
	/**
	 * 库存
	 */
	
	private Integer alllimittimes;
				
	
	/**
	 * 设置：商品类别
	 */
	 
	public void setShangpinleibie(String shangpinleibie) {
		this.shangpinleibie = shangpinleibie;
	}
	
	/**
	 * 获取：商品类别
	 */
	public String getShangpinleibie() {
		return shangpinleibie;
	}
				
	
	/**
	 * 设置：销量
	 */
	 
	public void setXiaoliang(Integer xiaoliang) {
		this.xiaoliang = xiaoliang;
	}
	
	/**
	 * 获取：销量
	 */
	public Integer getXiaoliang() {
		return xiaoliang;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：商品信息
	 */
	 
	public void setShangpinxinxi(String shangpinxinxi) {
		this.shangpinxinxi = shangpinxinxi;
	}
	
	/**
	 * 获取：商品信息
	 */
	public String getShangpinxinxi() {
		return shangpinxinxi;
	}
				
	
	/**
	 * 设置：店主姓名
	 */
	 
	public void setDianzhuxingming(String dianzhuxingming) {
		this.dianzhuxingming = dianzhuxingming;
	}
	
	/**
	 * 获取：店主姓名
	 */
	public String getDianzhuxingming() {
		return dianzhuxingming;
	}
				
	
	/**
	 * 设置：店主账号
	 */
	 
	public void setDianzhuzhanghao(String dianzhuzhanghao) {
		this.dianzhuzhanghao = dianzhuzhanghao;
	}
	
	/**
	 * 获取：店主账号
	 */
	public String getDianzhuzhanghao() {
		return dianzhuzhanghao;
	}
				
	
	/**
	 * 设置：商品状态
	 */
	 
	public void setShangpinzhuangtai(String shangpinzhuangtai) {
		this.shangpinzhuangtai = shangpinzhuangtai;
	}
	
	/**
	 * 获取：商品状态
	 */
	public String getShangpinzhuangtai() {
		return shangpinzhuangtai;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：单限
	 */
	 
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
				
	
	/**
	 * 设置：库存
	 */
	 
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
			
}

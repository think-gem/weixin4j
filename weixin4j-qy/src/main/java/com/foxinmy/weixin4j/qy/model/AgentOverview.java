package com.foxinmy.weixin4j.qy.model;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 企业号应用的概况信息
 * 
 * @className AgentOverview
 * @author jy
 * @date 2015年4月9日
 * @since JDK 1.6
 * @see
 */
public class AgentOverview implements Serializable {

	private static final long serialVersionUID = 5459274811502476460L;
	/**
	 * 企业应用的id
	 */
	@JSONField(name = "agentid")
	private int agentId;
	/**
	 * 企业应用名称
	 */
	private String name;
	/**
	 * 企业应用方形头像
	 */
	@JSONField(name = "square_logo_url")
	private String squareLogoUrl;
	/**
	 * 企业应用圆形头像
	 */
	@JSONField(name = "round_logo_url")
	private String roundLogoUrl;

	public int getAgentId() {
		return agentId;
	}

	public String getName() {
		return name;
	}

	public String getSquareLogoUrl() {
		return squareLogoUrl;
	}

	public String getRoundLogoUrl() {
		return roundLogoUrl;
	}

	// ---------- setter 应该全部去掉
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSquareLogoUrl(String squareLogoUrl) {
		this.squareLogoUrl = squareLogoUrl;
	}

	public void setRoundLogoUrl(String roundLogoUrl) {
		this.roundLogoUrl = roundLogoUrl;
	}

	@Override
	public String toString() {
		return "AgentOverview [agentId=" + agentId + ", name=" + name
				+ ", squareLogoUrl=" + squareLogoUrl + ", roundLogoUrl="
				+ roundLogoUrl + "]";
	}
}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.04.16 at 11:50:14 ���� CST 
//


package com.ics.tcg.web.workflow.client.examples;

import java.util.ArrayList;

import com.ics.tcg.web.workflow.client.service.ParamInfo;

public class Client_Choice extends Client_Node {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9122688963830854120L;
	public String contentPath;					//存储配置好的输入变量路径
	public ParamInfo paramInfo;					////指向设置好路径后的输入参数的引用,为choice配置界面的显示方式和显示内容服务
    public ArrayList<Client_ConditionalOutputPort> conditionalOutputPort;
    public int actual_outport;

    public int getActual_outport() {
		return actual_outport;
	}

	public void setActual_outport(int actual_outport) {
		this.actual_outport = actual_outport;
	}

    public String getContentPath() {
		return contentPath;
	}

	public void setContentPath(String contentPath) {
		this.contentPath = contentPath;
	}
	
	public ParamInfo getParamInfo() {
		return paramInfo;
	}

	public void setParamInfo(ParamInfo paramInfo) {
		this.paramInfo = paramInfo;
	}


    public ArrayList<Client_ConditionalOutputPort> getConditionalOutputPort() {
        if (conditionalOutputPort == null) {
            conditionalOutputPort = new ArrayList<Client_ConditionalOutputPort>();
        }
        return this.conditionalOutputPort;
    }
}

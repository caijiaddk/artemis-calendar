//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.04.16 at 11:50:14 ���� CST 
//


package com.ics.tcg.web.workflow.client.examples;

import java.io.Serializable;

public class Client_NextNode implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 8335330889319535458L;
	protected Client_ServiceTask serviceTask;
    protected Client_Loop loop;
    protected Client_Choice choice;

    public Client_ServiceTask getServiceTask() {
        return serviceTask;
    }

    public void setServiceTask(Client_ServiceTask value) {
        this.serviceTask = value;
    }

    public Client_Loop getLoop() {
        return loop;
    }

    public void setLoop(Client_Loop value) {
        this.loop = value;
    }

    public Client_Choice getChoice() {
        return choice;
    }

    public void setChoice(Client_Choice value) {
        this.choice = value;
    }

}

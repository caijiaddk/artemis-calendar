//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.04.16 at 11:50:14 ���� CST 
//


package com.ics.tcg.web.workflow.client.examples;

import java.io.Serializable;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tcs.workflow package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class Client_ObjectFactory implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 7223637495747965264L;

	/**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ics.tcg.workflow
     * 
     */
    public Client_ObjectFactory() {
    }

    /**
     * Create an instance of {@link Server_Loop }
     * 
     */
    public Client_Loop createTLoop() {
        return new Client_Loop();
    }

    /**
     * Create an instance of {@link Server_NonFixedNumFor }
     * 
     */
    public Client_NonFixedNumFor createTNonFixedNumFor() {
        return new Client_NonFixedNumFor();
    }

    /**
     * Create an instance of {@link Server_Timer }
     * 
     */
    public Client_Timer createTTimer() {
        return new Client_Timer();
    }

    /**
     * Create an instance of {@link Server_FixedNumFor }
     * 
     */
    public Client_FixedNumFor createTFixedNumFor() {
        return new Client_FixedNumFor();
    }

    /**
     * Create an instance of {@link Server_ServiceDescription }
     * 
     */
    public Client_ServiceDescription createTServiceDescription() {
        return new Client_ServiceDescription();
    }

    /**
     * Create an instance of {@link Server_Port }
     * 
     */
    public Client_Port createTPort() {
        return new Client_Port();
    }

    /**
     * Create an instance of {@link Server_WhileCondition }
     * 
     */
    public Client_WhileCondition createTWhileCondition() {
        return new Client_WhileCondition();
    }

    /**
     * Create an instance of {@link Server_IfCondition }
     * 
     */
    public Client_IfCondition createTIfCondition() {
        return new Client_IfCondition();
    }

    /**
     * Create an instance of {@link Server_ServiceTask }
     * 
     */
    public Client_ServiceTask createTServiceTask() {
        return new Client_ServiceTask();
    }

    /**
     * Create an instance of {@link Server_Operation }
     * 
     */
    public Client_Operation createTOperation() {
        return new Client_Operation();
    }

    /**
     * Create an instance of {@link Server_QosRequirement }
     * 
     */
    public Client_QosRequirement createTQosRequirement() {
        return new Client_QosRequirement();
    }

    /**
     * Create an instance of {@link Server_InputPort }
     * 
     */
    public Client_InputPort createTInputPort() {
        return new Client_InputPort();
    }

    /**
     * Create an instance of {@link Server_ConditionalOutputPort }
     * 
     */
    public Client_ConditionalOutputPort createTConditionalOutputPort() {
        return new Client_ConditionalOutputPort();
    }

    /**
     * Create an instance of {@link Server_Element }
     * 
     */
    public Client_Element createTElement() {
        return new Client_Element();
    }

    /**
     * Create an instance of {@link Server_Choice }
     * 
     */
    public Client_Choice createTChoice() {
        return new Client_Choice();
    }

    /**
     * Create an instance of {@link Server_Workflow }
     * 
     */
    public Client_Workflow createTWorkflow() {
        return new Client_Workflow();
    }

    /**
     * Create an instance of {@link Server_OutputPort }
     * 
     */
    public Client_OutputPort createTOutputPort() {
        return new Client_OutputPort();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public Client_DataType createDataType() {
        return new Client_DataType();
    }

    /**
     * Create an instance of {@link Server_Operation.FromService }
     * 
     */
    public Client_Operation.Client_FromService createTOperationFromService() {
        return new Client_Operation.Client_FromService();
    }

    /**
     * Create an instance of {@link Server_Configuration }
     * 
     */
    public Client_Configuration createTConfiguration() {
        return new Client_Configuration();
    }

    /**
     * Create an instance of {@link Server_Edge }
     * 
     */
    public Client_Edge createTEdge() {
        return new Client_Edge();
    }

    /**
     * Create an instance of {@link Server_Node }
     * 
     */
    public Client_Node createTNode() {
        return new Client_Node();
    }

    /**
     * Create an instance of {@link Server_FaultOutputPort }
     * 
     */
    public Client_FaultOutputPort createTFaultOnputPort() {
        return new Client_FaultOutputPort();
    }

    /**
     * Create an instance of {@link Server_Service }
     * 
     */
    public Client_Service createTService() {
        return new Client_Service();
    }

    
}
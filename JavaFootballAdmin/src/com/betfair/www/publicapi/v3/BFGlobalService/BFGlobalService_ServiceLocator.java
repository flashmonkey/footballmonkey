/**
 * BFGlobalService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.v3.BFGlobalService;

public class BFGlobalService_ServiceLocator extends org.apache.axis.client.Service implements com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_Service {

    public BFGlobalService_ServiceLocator() {
    }


    public BFGlobalService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BFGlobalService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BFGlobalService
    private java.lang.String BFGlobalService_address = "https://api.betfair.com/global/v3/BFGlobalService";

    public java.lang.String getBFGlobalServiceAddress() {
        return BFGlobalService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BFGlobalServiceWSDDServiceName = "BFGlobalService";

    public java.lang.String getBFGlobalServiceWSDDServiceName() {
        return BFGlobalServiceWSDDServiceName;
    }

    public void setBFGlobalServiceWSDDServiceName(java.lang.String name) {
        BFGlobalServiceWSDDServiceName = name;
    }

    public com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_PortType getBFGlobalService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BFGlobalService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBFGlobalService(endpoint);
    }

    public com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_PortType getBFGlobalService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_BindingStub _stub = new com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_BindingStub(portAddress, this);
            _stub.setPortName(getBFGlobalServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBFGlobalServiceEndpointAddress(java.lang.String address) {
        BFGlobalService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_BindingStub _stub = new com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_BindingStub(new java.net.URL(BFGlobalService_address), this);
                _stub.setPortName(getBFGlobalServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BFGlobalService".equals(inputPortName)) {
            return getBFGlobalService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "BFGlobalService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "BFGlobalService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BFGlobalService".equals(portName)) {
            setBFGlobalServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

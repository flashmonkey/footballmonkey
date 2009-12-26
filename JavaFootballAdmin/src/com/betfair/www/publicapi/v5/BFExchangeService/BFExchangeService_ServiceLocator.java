/**
 * BFExchangeService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.v5.BFExchangeService;

public class BFExchangeService_ServiceLocator extends org.apache.axis.client.Service implements com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_Service {

    public BFExchangeService_ServiceLocator() {
    }


    public BFExchangeService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BFExchangeService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BFExchangeService
    private java.lang.String BFExchangeService_address = "https://api.betfair.com/exchange/v5/BFExchangeService";

    public java.lang.String getBFExchangeServiceAddress() {
        return BFExchangeService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BFExchangeServiceWSDDServiceName = "BFExchangeService";

    public java.lang.String getBFExchangeServiceWSDDServiceName() {
        return BFExchangeServiceWSDDServiceName;
    }

    public void setBFExchangeServiceWSDDServiceName(java.lang.String name) {
        BFExchangeServiceWSDDServiceName = name;
    }

    public com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_PortType getBFExchangeService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BFExchangeService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBFExchangeService(endpoint);
    }

    public com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_PortType getBFExchangeService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_BindingStub _stub = new com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_BindingStub(portAddress, this);
            _stub.setPortName(getBFExchangeServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBFExchangeServiceEndpointAddress(java.lang.String address) {
        BFExchangeService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_BindingStub _stub = new com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_BindingStub(new java.net.URL(BFExchangeService_address), this);
                _stub.setPortName(getBFExchangeServiceWSDDServiceName());
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
        if ("BFExchangeService".equals(inputPortName)) {
            return getBFExchangeService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "BFExchangeService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "BFExchangeService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BFExchangeService".equals(portName)) {
            setBFExchangeServiceEndpointAddress(address);
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

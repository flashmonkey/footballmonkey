/**
 * APIRequestHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class APIRequestHeader  implements java.io.Serializable {
    private long clientStamp;

    private java.lang.String sessionToken;

    public APIRequestHeader() {
    }

    public APIRequestHeader(
           long clientStamp,
           java.lang.String sessionToken) {
           this.clientStamp = clientStamp;
           this.sessionToken = sessionToken;
    }


    /**
     * Gets the clientStamp value for this APIRequestHeader.
     * 
     * @return clientStamp
     */
    public long getClientStamp() {
        return clientStamp;
    }


    /**
     * Sets the clientStamp value for this APIRequestHeader.
     * 
     * @param clientStamp
     */
    public void setClientStamp(long clientStamp) {
        this.clientStamp = clientStamp;
    }


    /**
     * Gets the sessionToken value for this APIRequestHeader.
     * 
     * @return sessionToken
     */
    public java.lang.String getSessionToken() {
        return sessionToken;
    }


    /**
     * Sets the sessionToken value for this APIRequestHeader.
     * 
     * @param sessionToken
     */
    public void setSessionToken(java.lang.String sessionToken) {
        this.sessionToken = sessionToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APIRequestHeader)) return false;
        APIRequestHeader other = (APIRequestHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.clientStamp == other.getClientStamp() &&
            ((this.sessionToken==null && other.getSessionToken()==null) || 
             (this.sessionToken!=null &&
              this.sessionToken.equals(other.getSessionToken())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getClientStamp()).hashCode();
        if (getSessionToken() != null) {
            _hashCode += getSessionToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APIRequestHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "APIRequestHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

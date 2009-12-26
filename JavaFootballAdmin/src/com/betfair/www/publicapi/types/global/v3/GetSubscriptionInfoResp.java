/**
 * GetSubscriptionInfoResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class GetSubscriptionInfoResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private java.lang.String minorErrorCode;

    private com.betfair.www.publicapi.types.global.v3.Subscription[] subscriptions;

    public GetSubscriptionInfoResp() {
    }

    public GetSubscriptionInfoResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           java.lang.String minorErrorCode,
           com.betfair.www.publicapi.types.global.v3.Subscription[] subscriptions) {
        super(
            header);
        this.minorErrorCode = minorErrorCode;
        this.subscriptions = subscriptions;
    }


    /**
     * Gets the minorErrorCode value for this GetSubscriptionInfoResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this GetSubscriptionInfoResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the subscriptions value for this GetSubscriptionInfoResp.
     * 
     * @return subscriptions
     */
    public com.betfair.www.publicapi.types.global.v3.Subscription[] getSubscriptions() {
        return subscriptions;
    }


    /**
     * Sets the subscriptions value for this GetSubscriptionInfoResp.
     * 
     * @param subscriptions
     */
    public void setSubscriptions(com.betfair.www.publicapi.types.global.v3.Subscription[] subscriptions) {
        this.subscriptions = subscriptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubscriptionInfoResp)) return false;
        GetSubscriptionInfoResp other = (GetSubscriptionInfoResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode()))) &&
            ((this.subscriptions==null && other.getSubscriptions()==null) || 
             (this.subscriptions!=null &&
              java.util.Arrays.equals(this.subscriptions, other.getSubscriptions())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        if (getSubscriptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubscriptionInfoResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetSubscriptionInfoResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "Subscription"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Subscription"));
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

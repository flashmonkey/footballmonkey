/**
 * CouponLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class CouponLink  implements java.io.Serializable {
    private int couponId;

    private java.lang.String couponName;

    public CouponLink() {
    }

    public CouponLink(
           int couponId,
           java.lang.String couponName) {
           this.couponId = couponId;
           this.couponName = couponName;
    }


    /**
     * Gets the couponId value for this CouponLink.
     * 
     * @return couponId
     */
    public int getCouponId() {
        return couponId;
    }


    /**
     * Sets the couponId value for this CouponLink.
     * 
     * @param couponId
     */
    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }


    /**
     * Gets the couponName value for this CouponLink.
     * 
     * @return couponName
     */
    public java.lang.String getCouponName() {
        return couponName;
    }


    /**
     * Sets the couponName value for this CouponLink.
     * 
     * @param couponName
     */
    public void setCouponName(java.lang.String couponName) {
        this.couponName = couponName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CouponLink)) return false;
        CouponLink other = (CouponLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.couponId == other.getCouponId() &&
            ((this.couponName==null && other.getCouponName()==null) || 
             (this.couponName!=null &&
              this.couponName.equals(other.getCouponName())));
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
        _hashCode += getCouponId();
        if (getCouponName() != null) {
            _hashCode += getCouponName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CouponLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CouponLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "couponId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "couponName"));
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

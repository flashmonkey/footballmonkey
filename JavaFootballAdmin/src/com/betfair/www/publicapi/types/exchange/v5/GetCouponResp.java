/**
 * GetCouponResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetCouponResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private int couponId;

    private java.lang.String couponName;

    private com.betfair.www.publicapi.types.exchange.v5.CouponMarket[] couponMarketItems;

    private int parentEventId;

    private com.betfair.www.publicapi.types.exchange.v5.GetCouponErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    public GetCouponResp() {
    }

    public GetCouponResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           int couponId,
           java.lang.String couponName,
           com.betfair.www.publicapi.types.exchange.v5.CouponMarket[] couponMarketItems,
           int parentEventId,
           com.betfair.www.publicapi.types.exchange.v5.GetCouponErrorEnum errorCode,
           java.lang.String minorErrorCode) {
        super(
            header);
        this.couponId = couponId;
        this.couponName = couponName;
        this.couponMarketItems = couponMarketItems;
        this.parentEventId = parentEventId;
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the couponId value for this GetCouponResp.
     * 
     * @return couponId
     */
    public int getCouponId() {
        return couponId;
    }


    /**
     * Sets the couponId value for this GetCouponResp.
     * 
     * @param couponId
     */
    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }


    /**
     * Gets the couponName value for this GetCouponResp.
     * 
     * @return couponName
     */
    public java.lang.String getCouponName() {
        return couponName;
    }


    /**
     * Sets the couponName value for this GetCouponResp.
     * 
     * @param couponName
     */
    public void setCouponName(java.lang.String couponName) {
        this.couponName = couponName;
    }


    /**
     * Gets the couponMarketItems value for this GetCouponResp.
     * 
     * @return couponMarketItems
     */
    public com.betfair.www.publicapi.types.exchange.v5.CouponMarket[] getCouponMarketItems() {
        return couponMarketItems;
    }


    /**
     * Sets the couponMarketItems value for this GetCouponResp.
     * 
     * @param couponMarketItems
     */
    public void setCouponMarketItems(com.betfair.www.publicapi.types.exchange.v5.CouponMarket[] couponMarketItems) {
        this.couponMarketItems = couponMarketItems;
    }


    /**
     * Gets the parentEventId value for this GetCouponResp.
     * 
     * @return parentEventId
     */
    public int getParentEventId() {
        return parentEventId;
    }


    /**
     * Sets the parentEventId value for this GetCouponResp.
     * 
     * @param parentEventId
     */
    public void setParentEventId(int parentEventId) {
        this.parentEventId = parentEventId;
    }


    /**
     * Gets the errorCode value for this GetCouponResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.GetCouponErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetCouponResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.GetCouponErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this GetCouponResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this GetCouponResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCouponResp)) return false;
        GetCouponResp other = (GetCouponResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.couponId == other.getCouponId() &&
            ((this.couponName==null && other.getCouponName()==null) || 
             (this.couponName!=null &&
              this.couponName.equals(other.getCouponName()))) &&
            ((this.couponMarketItems==null && other.getCouponMarketItems()==null) || 
             (this.couponMarketItems!=null &&
              java.util.Arrays.equals(this.couponMarketItems, other.getCouponMarketItems()))) &&
            this.parentEventId == other.getParentEventId() &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode())));
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
        _hashCode += getCouponId();
        if (getCouponName() != null) {
            _hashCode += getCouponName().hashCode();
        }
        if (getCouponMarketItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCouponMarketItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCouponMarketItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getParentEventId();
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCouponResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCouponResp"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponMarketItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "couponMarketItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CouponMarket"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CouponMarket"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentEventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentEventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCouponErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
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

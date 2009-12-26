/**
 * GetMarketTradedVolumeResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetMarketTradedVolumeResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    private com.betfair.www.publicapi.types.exchange.v5.VolumeInfo[] priceItems;

    private java.lang.Double actualBSP;

    public GetMarketTradedVolumeResp() {
    }

    public GetMarketTradedVolumeResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeErrorEnum errorCode,
           java.lang.String minorErrorCode,
           com.betfair.www.publicapi.types.exchange.v5.VolumeInfo[] priceItems,
           java.lang.Double actualBSP) {
        super(
            header);
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
        this.priceItems = priceItems;
        this.actualBSP = actualBSP;
    }


    /**
     * Gets the errorCode value for this GetMarketTradedVolumeResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetMarketTradedVolumeResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this GetMarketTradedVolumeResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this GetMarketTradedVolumeResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the priceItems value for this GetMarketTradedVolumeResp.
     * 
     * @return priceItems
     */
    public com.betfair.www.publicapi.types.exchange.v5.VolumeInfo[] getPriceItems() {
        return priceItems;
    }


    /**
     * Sets the priceItems value for this GetMarketTradedVolumeResp.
     * 
     * @param priceItems
     */
    public void setPriceItems(com.betfair.www.publicapi.types.exchange.v5.VolumeInfo[] priceItems) {
        this.priceItems = priceItems;
    }


    /**
     * Gets the actualBSP value for this GetMarketTradedVolumeResp.
     * 
     * @return actualBSP
     */
    public java.lang.Double getActualBSP() {
        return actualBSP;
    }


    /**
     * Sets the actualBSP value for this GetMarketTradedVolumeResp.
     * 
     * @param actualBSP
     */
    public void setActualBSP(java.lang.Double actualBSP) {
        this.actualBSP = actualBSP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMarketTradedVolumeResp)) return false;
        GetMarketTradedVolumeResp other = (GetMarketTradedVolumeResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode()))) &&
            ((this.priceItems==null && other.getPriceItems()==null) || 
             (this.priceItems!=null &&
              java.util.Arrays.equals(this.priceItems, other.getPriceItems()))) &&
            ((this.actualBSP==null && other.getActualBSP()==null) || 
             (this.actualBSP!=null &&
              this.actualBSP.equals(other.getActualBSP())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        if (getPriceItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriceItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActualBSP() != null) {
            _hashCode += getActualBSP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMarketTradedVolumeResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "VolumeInfo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "VolumeInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualBSP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actualBSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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

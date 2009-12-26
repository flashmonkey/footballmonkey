/**
 * GetBetHistoryResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetBetHistoryResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.Bet[] betHistoryItems;

    private com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    private int totalRecordCount;

    public GetBetHistoryResp() {
    }

    public GetBetHistoryResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           com.betfair.www.publicapi.types.exchange.v5.Bet[] betHistoryItems,
           com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryErrorEnum errorCode,
           java.lang.String minorErrorCode,
           int totalRecordCount) {
        super(
            header);
        this.betHistoryItems = betHistoryItems;
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
        this.totalRecordCount = totalRecordCount;
    }


    /**
     * Gets the betHistoryItems value for this GetBetHistoryResp.
     * 
     * @return betHistoryItems
     */
    public com.betfair.www.publicapi.types.exchange.v5.Bet[] getBetHistoryItems() {
        return betHistoryItems;
    }


    /**
     * Sets the betHistoryItems value for this GetBetHistoryResp.
     * 
     * @param betHistoryItems
     */
    public void setBetHistoryItems(com.betfair.www.publicapi.types.exchange.v5.Bet[] betHistoryItems) {
        this.betHistoryItems = betHistoryItems;
    }


    /**
     * Gets the errorCode value for this GetBetHistoryResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetBetHistoryResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this GetBetHistoryResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this GetBetHistoryResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the totalRecordCount value for this GetBetHistoryResp.
     * 
     * @return totalRecordCount
     */
    public int getTotalRecordCount() {
        return totalRecordCount;
    }


    /**
     * Sets the totalRecordCount value for this GetBetHistoryResp.
     * 
     * @param totalRecordCount
     */
    public void setTotalRecordCount(int totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBetHistoryResp)) return false;
        GetBetHistoryResp other = (GetBetHistoryResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.betHistoryItems==null && other.getBetHistoryItems()==null) || 
             (this.betHistoryItems!=null &&
              java.util.Arrays.equals(this.betHistoryItems, other.getBetHistoryItems()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode()))) &&
            this.totalRecordCount == other.getTotalRecordCount();
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
        if (getBetHistoryItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBetHistoryItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBetHistoryItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        _hashCode += getTotalRecordCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBetHistoryResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetHistoryResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betHistoryItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betHistoryItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Bet"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Bet"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetHistoryErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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

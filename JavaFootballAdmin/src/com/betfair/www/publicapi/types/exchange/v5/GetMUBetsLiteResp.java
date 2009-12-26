/**
 * GetMUBetsLiteResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetMUBetsLiteResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.MUBetLite[] betLites;

    private com.betfair.www.publicapi.types.exchange.v5.GetMUBetsErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    private int totalRecordCount;

    public GetMUBetsLiteResp() {
    }

    public GetMUBetsLiteResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           com.betfair.www.publicapi.types.exchange.v5.MUBetLite[] betLites,
           com.betfair.www.publicapi.types.exchange.v5.GetMUBetsErrorEnum errorCode,
           java.lang.String minorErrorCode,
           int totalRecordCount) {
        super(
            header);
        this.betLites = betLites;
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
        this.totalRecordCount = totalRecordCount;
    }


    /**
     * Gets the betLites value for this GetMUBetsLiteResp.
     * 
     * @return betLites
     */
    public com.betfair.www.publicapi.types.exchange.v5.MUBetLite[] getBetLites() {
        return betLites;
    }


    /**
     * Sets the betLites value for this GetMUBetsLiteResp.
     * 
     * @param betLites
     */
    public void setBetLites(com.betfair.www.publicapi.types.exchange.v5.MUBetLite[] betLites) {
        this.betLites = betLites;
    }


    /**
     * Gets the errorCode value for this GetMUBetsLiteResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.GetMUBetsErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetMUBetsLiteResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.GetMUBetsErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this GetMUBetsLiteResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this GetMUBetsLiteResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the totalRecordCount value for this GetMUBetsLiteResp.
     * 
     * @return totalRecordCount
     */
    public int getTotalRecordCount() {
        return totalRecordCount;
    }


    /**
     * Sets the totalRecordCount value for this GetMUBetsLiteResp.
     * 
     * @param totalRecordCount
     */
    public void setTotalRecordCount(int totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMUBetsLiteResp)) return false;
        GetMUBetsLiteResp other = (GetMUBetsLiteResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.betLites==null && other.getBetLites()==null) || 
             (this.betLites!=null &&
              java.util.Arrays.equals(this.betLites, other.getBetLites()))) &&
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
        if (getBetLites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBetLites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBetLites(), i);
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
        new org.apache.axis.description.TypeDesc(GetMUBetsLiteResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMUBetsLiteResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betLites");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betLites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MUBetLite"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "MUBetLite"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMUBetsErrorEnum"));
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

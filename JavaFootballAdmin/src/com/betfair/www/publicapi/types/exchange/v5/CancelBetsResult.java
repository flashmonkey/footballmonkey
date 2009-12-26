/**
 * CancelBetsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class CancelBetsResult  implements java.io.Serializable {
    private long betId;

    private com.betfair.www.publicapi.types.exchange.v5.CancelBetsResultEnum resultCode;

    private double sizeCancelled;

    private double sizeMatched;

    private boolean success;

    public CancelBetsResult() {
    }

    public CancelBetsResult(
           long betId,
           com.betfair.www.publicapi.types.exchange.v5.CancelBetsResultEnum resultCode,
           double sizeCancelled,
           double sizeMatched,
           boolean success) {
           this.betId = betId;
           this.resultCode = resultCode;
           this.sizeCancelled = sizeCancelled;
           this.sizeMatched = sizeMatched;
           this.success = success;
    }


    /**
     * Gets the betId value for this CancelBetsResult.
     * 
     * @return betId
     */
    public long getBetId() {
        return betId;
    }


    /**
     * Sets the betId value for this CancelBetsResult.
     * 
     * @param betId
     */
    public void setBetId(long betId) {
        this.betId = betId;
    }


    /**
     * Gets the resultCode value for this CancelBetsResult.
     * 
     * @return resultCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.CancelBetsResultEnum getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this CancelBetsResult.
     * 
     * @param resultCode
     */
    public void setResultCode(com.betfair.www.publicapi.types.exchange.v5.CancelBetsResultEnum resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the sizeCancelled value for this CancelBetsResult.
     * 
     * @return sizeCancelled
     */
    public double getSizeCancelled() {
        return sizeCancelled;
    }


    /**
     * Sets the sizeCancelled value for this CancelBetsResult.
     * 
     * @param sizeCancelled
     */
    public void setSizeCancelled(double sizeCancelled) {
        this.sizeCancelled = sizeCancelled;
    }


    /**
     * Gets the sizeMatched value for this CancelBetsResult.
     * 
     * @return sizeMatched
     */
    public double getSizeMatched() {
        return sizeMatched;
    }


    /**
     * Sets the sizeMatched value for this CancelBetsResult.
     * 
     * @param sizeMatched
     */
    public void setSizeMatched(double sizeMatched) {
        this.sizeMatched = sizeMatched;
    }


    /**
     * Gets the success value for this CancelBetsResult.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this CancelBetsResult.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelBetsResult)) return false;
        CancelBetsResult other = (CancelBetsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.betId == other.getBetId() &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            this.sizeCancelled == other.getSizeCancelled() &&
            this.sizeMatched == other.getSizeMatched() &&
            this.success == other.isSuccess();
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
        _hashCode += new Long(getBetId()).hashCode();
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        _hashCode += new Double(getSizeCancelled()).hashCode();
        _hashCode += new Double(getSizeMatched()).hashCode();
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelBetsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsResultEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeCancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeCancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeMatched");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeMatched"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

/**
 * UpdateBetsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class UpdateBetsResult  implements java.io.Serializable {
    private long betId;

    private java.lang.Long newBetId;

    private java.lang.Double sizeCancelled;

    private java.lang.Double newSize;

    private java.lang.Double newPrice;

    private com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResultEnum resultCode;

    private boolean success;

    public UpdateBetsResult() {
    }

    public UpdateBetsResult(
           long betId,
           java.lang.Long newBetId,
           java.lang.Double sizeCancelled,
           java.lang.Double newSize,
           java.lang.Double newPrice,
           com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResultEnum resultCode,
           boolean success) {
           this.betId = betId;
           this.newBetId = newBetId;
           this.sizeCancelled = sizeCancelled;
           this.newSize = newSize;
           this.newPrice = newPrice;
           this.resultCode = resultCode;
           this.success = success;
    }


    /**
     * Gets the betId value for this UpdateBetsResult.
     * 
     * @return betId
     */
    public long getBetId() {
        return betId;
    }


    /**
     * Sets the betId value for this UpdateBetsResult.
     * 
     * @param betId
     */
    public void setBetId(long betId) {
        this.betId = betId;
    }


    /**
     * Gets the newBetId value for this UpdateBetsResult.
     * 
     * @return newBetId
     */
    public java.lang.Long getNewBetId() {
        return newBetId;
    }


    /**
     * Sets the newBetId value for this UpdateBetsResult.
     * 
     * @param newBetId
     */
    public void setNewBetId(java.lang.Long newBetId) {
        this.newBetId = newBetId;
    }


    /**
     * Gets the sizeCancelled value for this UpdateBetsResult.
     * 
     * @return sizeCancelled
     */
    public java.lang.Double getSizeCancelled() {
        return sizeCancelled;
    }


    /**
     * Sets the sizeCancelled value for this UpdateBetsResult.
     * 
     * @param sizeCancelled
     */
    public void setSizeCancelled(java.lang.Double sizeCancelled) {
        this.sizeCancelled = sizeCancelled;
    }


    /**
     * Gets the newSize value for this UpdateBetsResult.
     * 
     * @return newSize
     */
    public java.lang.Double getNewSize() {
        return newSize;
    }


    /**
     * Sets the newSize value for this UpdateBetsResult.
     * 
     * @param newSize
     */
    public void setNewSize(java.lang.Double newSize) {
        this.newSize = newSize;
    }


    /**
     * Gets the newPrice value for this UpdateBetsResult.
     * 
     * @return newPrice
     */
    public java.lang.Double getNewPrice() {
        return newPrice;
    }


    /**
     * Sets the newPrice value for this UpdateBetsResult.
     * 
     * @param newPrice
     */
    public void setNewPrice(java.lang.Double newPrice) {
        this.newPrice = newPrice;
    }


    /**
     * Gets the resultCode value for this UpdateBetsResult.
     * 
     * @return resultCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResultEnum getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this UpdateBetsResult.
     * 
     * @param resultCode
     */
    public void setResultCode(com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResultEnum resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the success value for this UpdateBetsResult.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this UpdateBetsResult.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBetsResult)) return false;
        UpdateBetsResult other = (UpdateBetsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.betId == other.getBetId() &&
            ((this.newBetId==null && other.getNewBetId()==null) || 
             (this.newBetId!=null &&
              this.newBetId.equals(other.getNewBetId()))) &&
            ((this.sizeCancelled==null && other.getSizeCancelled()==null) || 
             (this.sizeCancelled!=null &&
              this.sizeCancelled.equals(other.getSizeCancelled()))) &&
            ((this.newSize==null && other.getNewSize()==null) || 
             (this.newSize!=null &&
              this.newSize.equals(other.getNewSize()))) &&
            ((this.newPrice==null && other.getNewPrice()==null) || 
             (this.newPrice!=null &&
              this.newPrice.equals(other.getNewPrice()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
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
        if (getNewBetId() != null) {
            _hashCode += getNewBetId().hashCode();
        }
        if (getSizeCancelled() != null) {
            _hashCode += getSizeCancelled().hashCode();
        }
        if (getNewSize() != null) {
            _hashCode += getNewSize().hashCode();
        }
        if (getNewPrice() != null) {
            _hashCode += getNewPrice().hashCode();
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateBetsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newBetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeCancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeCancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsResultEnum"));
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

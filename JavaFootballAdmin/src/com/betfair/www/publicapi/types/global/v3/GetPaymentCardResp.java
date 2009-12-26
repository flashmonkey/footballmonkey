/**
 * GetPaymentCardResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class GetPaymentCardResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.global.v3.GetPaymentCardErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    private com.betfair.www.publicapi.types.global.v3.PaymentCard[] paymentCardItems;

    public GetPaymentCardResp() {
    }

    public GetPaymentCardResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           com.betfair.www.publicapi.types.global.v3.GetPaymentCardErrorEnum errorCode,
           java.lang.String minorErrorCode,
           com.betfair.www.publicapi.types.global.v3.PaymentCard[] paymentCardItems) {
        super(
            header);
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
        this.paymentCardItems = paymentCardItems;
    }


    /**
     * Gets the errorCode value for this GetPaymentCardResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.global.v3.GetPaymentCardErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetPaymentCardResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.global.v3.GetPaymentCardErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this GetPaymentCardResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this GetPaymentCardResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the paymentCardItems value for this GetPaymentCardResp.
     * 
     * @return paymentCardItems
     */
    public com.betfair.www.publicapi.types.global.v3.PaymentCard[] getPaymentCardItems() {
        return paymentCardItems;
    }


    /**
     * Sets the paymentCardItems value for this GetPaymentCardResp.
     * 
     * @param paymentCardItems
     */
    public void setPaymentCardItems(com.betfair.www.publicapi.types.global.v3.PaymentCard[] paymentCardItems) {
        this.paymentCardItems = paymentCardItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPaymentCardResp)) return false;
        GetPaymentCardResp other = (GetPaymentCardResp) obj;
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
            ((this.paymentCardItems==null && other.getPaymentCardItems()==null) || 
             (this.paymentCardItems!=null &&
              java.util.Arrays.equals(this.paymentCardItems, other.getPaymentCardItems())));
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
        if (getPaymentCardItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentCardItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentCardItems(), i);
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
        new org.apache.axis.description.TypeDesc(GetPaymentCardResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetPaymentCardResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetPaymentCardErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentCardItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentCardItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "PaymentCard"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "PaymentCard"));
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

/**
 * ViewReferAndEarnResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ViewReferAndEarnResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private java.lang.String minorErrorCode;

    private com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnErrorEnum errorCode;

    private java.lang.String referAndEarnCode;

    public ViewReferAndEarnResp() {
    }

    public ViewReferAndEarnResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           java.lang.String minorErrorCode,
           com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnErrorEnum errorCode,
           java.lang.String referAndEarnCode) {
        super(
            header);
        this.minorErrorCode = minorErrorCode;
        this.errorCode = errorCode;
        this.referAndEarnCode = referAndEarnCode;
    }


    /**
     * Gets the minorErrorCode value for this ViewReferAndEarnResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this ViewReferAndEarnResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the errorCode value for this ViewReferAndEarnResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ViewReferAndEarnResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the referAndEarnCode value for this ViewReferAndEarnResp.
     * 
     * @return referAndEarnCode
     */
    public java.lang.String getReferAndEarnCode() {
        return referAndEarnCode;
    }


    /**
     * Sets the referAndEarnCode value for this ViewReferAndEarnResp.
     * 
     * @param referAndEarnCode
     */
    public void setReferAndEarnCode(java.lang.String referAndEarnCode) {
        this.referAndEarnCode = referAndEarnCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewReferAndEarnResp)) return false;
        ViewReferAndEarnResp other = (ViewReferAndEarnResp) obj;
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
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.referAndEarnCode==null && other.getReferAndEarnCode()==null) || 
             (this.referAndEarnCode!=null &&
              this.referAndEarnCode.equals(other.getReferAndEarnCode())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getReferAndEarnCode() != null) {
            _hashCode += getReferAndEarnCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewReferAndEarnResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewReferAndEarnResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewReferAndEarnErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referAndEarnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referAndEarnCode"));
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

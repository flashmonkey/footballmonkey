/**
 * SubmitTCPrivacyPolicyChangeLIMBMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class SubmitTCPrivacyPolicyChangeLIMBMessage  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.global.v3.PrivacyPolicyChangeResponseEnum tCPrivacyPolicyChangeAcceptance;

    public SubmitTCPrivacyPolicyChangeLIMBMessage() {
    }

    public SubmitTCPrivacyPolicyChangeLIMBMessage(
           com.betfair.www.publicapi.types.global.v3.PrivacyPolicyChangeResponseEnum tCPrivacyPolicyChangeAcceptance) {
           this.tCPrivacyPolicyChangeAcceptance = tCPrivacyPolicyChangeAcceptance;
    }


    /**
     * Gets the tCPrivacyPolicyChangeAcceptance value for this SubmitTCPrivacyPolicyChangeLIMBMessage.
     * 
     * @return tCPrivacyPolicyChangeAcceptance
     */
    public com.betfair.www.publicapi.types.global.v3.PrivacyPolicyChangeResponseEnum getTCPrivacyPolicyChangeAcceptance() {
        return tCPrivacyPolicyChangeAcceptance;
    }


    /**
     * Sets the tCPrivacyPolicyChangeAcceptance value for this SubmitTCPrivacyPolicyChangeLIMBMessage.
     * 
     * @param tCPrivacyPolicyChangeAcceptance
     */
    public void setTCPrivacyPolicyChangeAcceptance(com.betfair.www.publicapi.types.global.v3.PrivacyPolicyChangeResponseEnum tCPrivacyPolicyChangeAcceptance) {
        this.tCPrivacyPolicyChangeAcceptance = tCPrivacyPolicyChangeAcceptance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitTCPrivacyPolicyChangeLIMBMessage)) return false;
        SubmitTCPrivacyPolicyChangeLIMBMessage other = (SubmitTCPrivacyPolicyChangeLIMBMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tCPrivacyPolicyChangeAcceptance==null && other.getTCPrivacyPolicyChangeAcceptance()==null) || 
             (this.tCPrivacyPolicyChangeAcceptance!=null &&
              this.tCPrivacyPolicyChangeAcceptance.equals(other.getTCPrivacyPolicyChangeAcceptance())));
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
        if (getTCPrivacyPolicyChangeAcceptance() != null) {
            _hashCode += getTCPrivacyPolicyChangeAcceptance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitTCPrivacyPolicyChangeLIMBMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitTCPrivacyPolicyChangeLIMBMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCPrivacyPolicyChangeAcceptance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tCPrivacyPolicyChangeAcceptance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "PrivacyPolicyChangeResponseEnum"));
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

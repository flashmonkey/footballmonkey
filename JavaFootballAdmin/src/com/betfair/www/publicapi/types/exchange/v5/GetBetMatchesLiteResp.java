/**
 * GetBetMatchesLiteResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetBetMatchesLiteResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.MatchLite[] matchLites;

    private com.betfair.www.publicapi.types.exchange.v5.GetBetErrorEnum errorCode;

    public GetBetMatchesLiteResp() {
    }

    public GetBetMatchesLiteResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           com.betfair.www.publicapi.types.exchange.v5.MatchLite[] matchLites,
           com.betfair.www.publicapi.types.exchange.v5.GetBetErrorEnum errorCode) {
        super(
            header);
        this.matchLites = matchLites;
        this.errorCode = errorCode;
    }


    /**
     * Gets the matchLites value for this GetBetMatchesLiteResp.
     * 
     * @return matchLites
     */
    public com.betfair.www.publicapi.types.exchange.v5.MatchLite[] getMatchLites() {
        return matchLites;
    }


    /**
     * Sets the matchLites value for this GetBetMatchesLiteResp.
     * 
     * @param matchLites
     */
    public void setMatchLites(com.betfair.www.publicapi.types.exchange.v5.MatchLite[] matchLites) {
        this.matchLites = matchLites;
    }


    /**
     * Gets the errorCode value for this GetBetMatchesLiteResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.GetBetErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetBetMatchesLiteResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.GetBetErrorEnum errorCode) {
        this.errorCode = errorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBetMatchesLiteResp)) return false;
        GetBetMatchesLiteResp other = (GetBetMatchesLiteResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.matchLites==null && other.getMatchLites()==null) || 
             (this.matchLites!=null &&
              java.util.Arrays.equals(this.matchLites, other.getMatchLites()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode())));
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
        if (getMatchLites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchLites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchLites(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBetMatchesLiteResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetMatchesLiteResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchLites");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchLites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MatchLite"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "MatchLite"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetErrorEnum"));
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

/**
 * CancelBetsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class CancelBetsReq  extends com.betfair.www.publicapi.types.exchange.v5.APIRequest  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.CancelBets[] bets;

    public CancelBetsReq() {
    }

    public CancelBetsReq(
           com.betfair.www.publicapi.types.exchange.v5.APIRequestHeader header,
           com.betfair.www.publicapi.types.exchange.v5.CancelBets[] bets) {
        super(
            header);
        this.bets = bets;
    }


    /**
     * Gets the bets value for this CancelBetsReq.
     * 
     * @return bets
     */
    public com.betfair.www.publicapi.types.exchange.v5.CancelBets[] getBets() {
        return bets;
    }


    /**
     * Sets the bets value for this CancelBetsReq.
     * 
     * @param bets
     */
    public void setBets(com.betfair.www.publicapi.types.exchange.v5.CancelBets[] bets) {
        this.bets = bets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelBetsReq)) return false;
        CancelBetsReq other = (CancelBetsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bets==null && other.getBets()==null) || 
             (this.bets!=null &&
              java.util.Arrays.equals(this.bets, other.getBets())));
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
        if (getBets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBets(), i);
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
        new org.apache.axis.description.TypeDesc(CancelBetsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBets"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CancelBets"));
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

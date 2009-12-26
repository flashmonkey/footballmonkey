/**
 * GetCurrenciesResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class GetCurrenciesResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.global.v3.Currency[] currencyItems;

    public GetCurrenciesResp() {
    }

    public GetCurrenciesResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           com.betfair.www.publicapi.types.global.v3.Currency[] currencyItems) {
        super(
            header);
        this.currencyItems = currencyItems;
    }


    /**
     * Gets the currencyItems value for this GetCurrenciesResp.
     * 
     * @return currencyItems
     */
    public com.betfair.www.publicapi.types.global.v3.Currency[] getCurrencyItems() {
        return currencyItems;
    }


    /**
     * Sets the currencyItems value for this GetCurrenciesResp.
     * 
     * @param currencyItems
     */
    public void setCurrencyItems(com.betfair.www.publicapi.types.global.v3.Currency[] currencyItems) {
        this.currencyItems = currencyItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCurrenciesResp)) return false;
        GetCurrenciesResp other = (GetCurrenciesResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.currencyItems==null && other.getCurrencyItems()==null) || 
             (this.currencyItems!=null &&
              java.util.Arrays.equals(this.currencyItems, other.getCurrencyItems())));
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
        if (getCurrencyItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrencyItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrencyItems(), i);
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
        new org.apache.axis.description.TypeDesc(GetCurrenciesResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetCurrenciesResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "Currency"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Currency"));
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

/**
 * ConvertCurrencyErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ConvertCurrencyErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConvertCurrencyErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_AMOUNT = "INVALID_AMOUNT";
    public static final java.lang.String _INVALID_FROM_CURRENCY = "INVALID_FROM_CURRENCY";
    public static final java.lang.String _INVALID_TO_CURRENCY = "INVALID_TO_CURRENCY";
    public static final java.lang.String _CANNOT_CONVERT = "CANNOT_CONVERT";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final ConvertCurrencyErrorEnum OK = new ConvertCurrencyErrorEnum(_OK);
    public static final ConvertCurrencyErrorEnum INVALID_AMOUNT = new ConvertCurrencyErrorEnum(_INVALID_AMOUNT);
    public static final ConvertCurrencyErrorEnum INVALID_FROM_CURRENCY = new ConvertCurrencyErrorEnum(_INVALID_FROM_CURRENCY);
    public static final ConvertCurrencyErrorEnum INVALID_TO_CURRENCY = new ConvertCurrencyErrorEnum(_INVALID_TO_CURRENCY);
    public static final ConvertCurrencyErrorEnum CANNOT_CONVERT = new ConvertCurrencyErrorEnum(_CANNOT_CONVERT);
    public static final ConvertCurrencyErrorEnum API_ERROR = new ConvertCurrencyErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static ConvertCurrencyErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConvertCurrencyErrorEnum enumeration = (ConvertCurrencyErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConvertCurrencyErrorEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConvertCurrencyErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ConvertCurrencyErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
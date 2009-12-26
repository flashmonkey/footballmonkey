/**
 * GetAllMarketsErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetAllMarketsErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetAllMarketsErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_COUNTRY_CODE = "INVALID_COUNTRY_CODE";
    public static final java.lang.String _INVALID_LOCALE = "INVALID_LOCALE";
    public static final java.lang.String _INVALID_EVENT_TYPE_ID = "INVALID_EVENT_TYPE_ID";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final GetAllMarketsErrorEnum OK = new GetAllMarketsErrorEnum(_OK);
    public static final GetAllMarketsErrorEnum INVALID_COUNTRY_CODE = new GetAllMarketsErrorEnum(_INVALID_COUNTRY_CODE);
    public static final GetAllMarketsErrorEnum INVALID_LOCALE = new GetAllMarketsErrorEnum(_INVALID_LOCALE);
    public static final GetAllMarketsErrorEnum INVALID_EVENT_TYPE_ID = new GetAllMarketsErrorEnum(_INVALID_EVENT_TYPE_ID);
    public static final GetAllMarketsErrorEnum API_ERROR = new GetAllMarketsErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetAllMarketsErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetAllMarketsErrorEnum enumeration = (GetAllMarketsErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetAllMarketsErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetAllMarketsErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAllMarketsErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

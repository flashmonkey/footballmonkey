/**
 * GetPrivateMarketsErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetPrivateMarketsErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetPrivateMarketsErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_LOCALE = "INVALID_LOCALE";
    public static final java.lang.String _INVALID_EVENT_TYPE_ID = "INVALID_EVENT_TYPE_ID";
    public static final java.lang.String _INVALID_MARKET_TYPE = "INVALID_MARKET_TYPE";
    public static final java.lang.String _NO_RESULTS = "NO_RESULTS";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final GetPrivateMarketsErrorEnum OK = new GetPrivateMarketsErrorEnum(_OK);
    public static final GetPrivateMarketsErrorEnum INVALID_LOCALE = new GetPrivateMarketsErrorEnum(_INVALID_LOCALE);
    public static final GetPrivateMarketsErrorEnum INVALID_EVENT_TYPE_ID = new GetPrivateMarketsErrorEnum(_INVALID_EVENT_TYPE_ID);
    public static final GetPrivateMarketsErrorEnum INVALID_MARKET_TYPE = new GetPrivateMarketsErrorEnum(_INVALID_MARKET_TYPE);
    public static final GetPrivateMarketsErrorEnum NO_RESULTS = new GetPrivateMarketsErrorEnum(_NO_RESULTS);
    public static final GetPrivateMarketsErrorEnum API_ERROR = new GetPrivateMarketsErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetPrivateMarketsErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetPrivateMarketsErrorEnum enumeration = (GetPrivateMarketsErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetPrivateMarketsErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetPrivateMarketsErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetPrivateMarketsErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

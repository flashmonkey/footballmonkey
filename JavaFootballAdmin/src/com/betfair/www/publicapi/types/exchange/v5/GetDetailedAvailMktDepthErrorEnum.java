/**
 * GetDetailedAvailMktDepthErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetDetailedAvailMktDepthErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetDetailedAvailMktDepthErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _NO_RESULTS = "NO_RESULTS";
    public static final java.lang.String _SUSPENDED_MARKET = "SUSPENDED_MARKET";
    public static final java.lang.String _INVALID_MARKET = "INVALID_MARKET";
    public static final java.lang.String _INVALID_RUNNER = "INVALID_RUNNER";
    public static final java.lang.String _INVALID_ASIAN_LINE = "INVALID_ASIAN_LINE";
    public static final java.lang.String _INVALID_CURRENCY = "INVALID_CURRENCY";
    public static final java.lang.String _MARKET_TYPE_NOT_SUPPORTED = "MARKET_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final GetDetailedAvailMktDepthErrorEnum OK = new GetDetailedAvailMktDepthErrorEnum(_OK);
    public static final GetDetailedAvailMktDepthErrorEnum NO_RESULTS = new GetDetailedAvailMktDepthErrorEnum(_NO_RESULTS);
    public static final GetDetailedAvailMktDepthErrorEnum SUSPENDED_MARKET = new GetDetailedAvailMktDepthErrorEnum(_SUSPENDED_MARKET);
    public static final GetDetailedAvailMktDepthErrorEnum INVALID_MARKET = new GetDetailedAvailMktDepthErrorEnum(_INVALID_MARKET);
    public static final GetDetailedAvailMktDepthErrorEnum INVALID_RUNNER = new GetDetailedAvailMktDepthErrorEnum(_INVALID_RUNNER);
    public static final GetDetailedAvailMktDepthErrorEnum INVALID_ASIAN_LINE = new GetDetailedAvailMktDepthErrorEnum(_INVALID_ASIAN_LINE);
    public static final GetDetailedAvailMktDepthErrorEnum INVALID_CURRENCY = new GetDetailedAvailMktDepthErrorEnum(_INVALID_CURRENCY);
    public static final GetDetailedAvailMktDepthErrorEnum MARKET_TYPE_NOT_SUPPORTED = new GetDetailedAvailMktDepthErrorEnum(_MARKET_TYPE_NOT_SUPPORTED);
    public static final GetDetailedAvailMktDepthErrorEnum API_ERROR = new GetDetailedAvailMktDepthErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetDetailedAvailMktDepthErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetDetailedAvailMktDepthErrorEnum enumeration = (GetDetailedAvailMktDepthErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetDetailedAvailMktDepthErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetDetailedAvailMktDepthErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetDetailedAvailMktDepthErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * GetAccountStatementErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetAccountStatementErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetAccountStatementErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_START_RECORD = "INVALID_START_RECORD";
    public static final java.lang.String _INVALID_RECORD_COUNT = "INVALID_RECORD_COUNT";
    public static final java.lang.String _INVALID_END_DATE = "INVALID_END_DATE";
    public static final java.lang.String _INVALID_START_DATE = "INVALID_START_DATE";
    public static final java.lang.String _NO_RESULTS = "NO_RESULTS";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final java.lang.String _INVALID_LOCALE_DEFAULTING_TO_ENGLISH = "INVALID_LOCALE_DEFAULTING_TO_ENGLISH";
    public static final GetAccountStatementErrorEnum OK = new GetAccountStatementErrorEnum(_OK);
    public static final GetAccountStatementErrorEnum INVALID_START_RECORD = new GetAccountStatementErrorEnum(_INVALID_START_RECORD);
    public static final GetAccountStatementErrorEnum INVALID_RECORD_COUNT = new GetAccountStatementErrorEnum(_INVALID_RECORD_COUNT);
    public static final GetAccountStatementErrorEnum INVALID_END_DATE = new GetAccountStatementErrorEnum(_INVALID_END_DATE);
    public static final GetAccountStatementErrorEnum INVALID_START_DATE = new GetAccountStatementErrorEnum(_INVALID_START_DATE);
    public static final GetAccountStatementErrorEnum NO_RESULTS = new GetAccountStatementErrorEnum(_NO_RESULTS);
    public static final GetAccountStatementErrorEnum API_ERROR = new GetAccountStatementErrorEnum(_API_ERROR);
    public static final GetAccountStatementErrorEnum INVALID_LOCALE_DEFAULTING_TO_ENGLISH = new GetAccountStatementErrorEnum(_INVALID_LOCALE_DEFAULTING_TO_ENGLISH);
    public java.lang.String getValue() { return _value_;}
    public static GetAccountStatementErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetAccountStatementErrorEnum enumeration = (GetAccountStatementErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetAccountStatementErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetAccountStatementErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountStatementErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * GetEventsErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class GetEventsErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetEventsErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_EVENT_ID = "INVALID_EVENT_ID";
    public static final java.lang.String _NO_RESULTS = "NO_RESULTS";
    public static final java.lang.String _INVALID_LOCALE_DEFAULTING_TO_ENGLISH = "INVALID_LOCALE_DEFAULTING_TO_ENGLISH";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final GetEventsErrorEnum OK = new GetEventsErrorEnum(_OK);
    public static final GetEventsErrorEnum INVALID_EVENT_ID = new GetEventsErrorEnum(_INVALID_EVENT_ID);
    public static final GetEventsErrorEnum NO_RESULTS = new GetEventsErrorEnum(_NO_RESULTS);
    public static final GetEventsErrorEnum INVALID_LOCALE_DEFAULTING_TO_ENGLISH = new GetEventsErrorEnum(_INVALID_LOCALE_DEFAULTING_TO_ENGLISH);
    public static final GetEventsErrorEnum API_ERROR = new GetEventsErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetEventsErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetEventsErrorEnum enumeration = (GetEventsErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetEventsErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetEventsErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventsErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

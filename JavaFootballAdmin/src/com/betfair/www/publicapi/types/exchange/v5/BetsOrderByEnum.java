/**
 * BetsOrderByEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class BetsOrderByEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BetsOrderByEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _BET_ID = "BET_ID";
    public static final java.lang.String _MARKET_NAME = "MARKET_NAME";
    public static final java.lang.String _PLACED_DATE = "PLACED_DATE";
    public static final java.lang.String _MATCHED_DATE = "MATCHED_DATE";
    public static final java.lang.String _CANCELLED_DATE = "CANCELLED_DATE";
    public static final BetsOrderByEnum NONE = new BetsOrderByEnum(_NONE);
    public static final BetsOrderByEnum BET_ID = new BetsOrderByEnum(_BET_ID);
    public static final BetsOrderByEnum MARKET_NAME = new BetsOrderByEnum(_MARKET_NAME);
    public static final BetsOrderByEnum PLACED_DATE = new BetsOrderByEnum(_PLACED_DATE);
    public static final BetsOrderByEnum MATCHED_DATE = new BetsOrderByEnum(_MATCHED_DATE);
    public static final BetsOrderByEnum CANCELLED_DATE = new BetsOrderByEnum(_CANCELLED_DATE);
    public java.lang.String getValue() { return _value_;}
    public static BetsOrderByEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BetsOrderByEnum enumeration = (BetsOrderByEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BetsOrderByEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BetsOrderByEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetsOrderByEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

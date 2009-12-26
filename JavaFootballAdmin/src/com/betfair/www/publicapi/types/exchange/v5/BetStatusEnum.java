/**
 * BetStatusEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class BetStatusEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BetStatusEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _U = "U";
    public static final java.lang.String _M = "M";
    public static final java.lang.String _S = "S";
    public static final java.lang.String _C = "C";
    public static final java.lang.String _V = "V";
    public static final java.lang.String _L = "L";
    public static final java.lang.String _MU = "MU";
    public static final BetStatusEnum U = new BetStatusEnum(_U);
    public static final BetStatusEnum M = new BetStatusEnum(_M);
    public static final BetStatusEnum S = new BetStatusEnum(_S);
    public static final BetStatusEnum C = new BetStatusEnum(_C);
    public static final BetStatusEnum V = new BetStatusEnum(_V);
    public static final BetStatusEnum L = new BetStatusEnum(_L);
    public static final BetStatusEnum MU = new BetStatusEnum(_MU);
    public java.lang.String getValue() { return _value_;}
    public static BetStatusEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BetStatusEnum enumeration = (BetStatusEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BetStatusEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BetStatusEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetStatusEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

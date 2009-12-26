/**
 * SecurityQuestion2Enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class SecurityQuestion2Enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SecurityQuestion2Enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SQ2A = "SQ2A";
    public static final java.lang.String _SQ2B = "SQ2B";
    public static final java.lang.String _SQ2C = "SQ2C";
    public static final java.lang.String _SQ2D = "SQ2D";
    public static final SecurityQuestion2Enum SQ2A = new SecurityQuestion2Enum(_SQ2A);
    public static final SecurityQuestion2Enum SQ2B = new SecurityQuestion2Enum(_SQ2B);
    public static final SecurityQuestion2Enum SQ2C = new SecurityQuestion2Enum(_SQ2C);
    public static final SecurityQuestion2Enum SQ2D = new SecurityQuestion2Enum(_SQ2D);
    public java.lang.String getValue() { return _value_;}
    public static SecurityQuestion2Enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SecurityQuestion2Enum enumeration = (SecurityQuestion2Enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SecurityQuestion2Enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SecurityQuestion2Enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SecurityQuestion2Enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

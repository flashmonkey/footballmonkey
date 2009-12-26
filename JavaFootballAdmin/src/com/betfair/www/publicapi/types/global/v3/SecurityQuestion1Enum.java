/**
 * SecurityQuestion1Enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class SecurityQuestion1Enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SecurityQuestion1Enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SQ1A = "SQ1A";
    public static final java.lang.String _SQ1B = "SQ1B";
    public static final java.lang.String _SQ1C = "SQ1C";
    public static final java.lang.String _SQ1D = "SQ1D";
    public static final SecurityQuestion1Enum SQ1A = new SecurityQuestion1Enum(_SQ1A);
    public static final SecurityQuestion1Enum SQ1B = new SecurityQuestion1Enum(_SQ1B);
    public static final SecurityQuestion1Enum SQ1C = new SecurityQuestion1Enum(_SQ1C);
    public static final SecurityQuestion1Enum SQ1D = new SecurityQuestion1Enum(_SQ1D);
    public java.lang.String getValue() { return _value_;}
    public static SecurityQuestion1Enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SecurityQuestion1Enum enumeration = (SecurityQuestion1Enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SecurityQuestion1Enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SecurityQuestion1Enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SecurityQuestion1Enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

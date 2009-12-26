/**
 * RegionEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class RegionEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RegionEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ZAF = "ZAF";
    public static final java.lang.String _NA = "NA";
    public static final java.lang.String _NORD = "NORD";
    public static final java.lang.String _GBR = "GBR";
    public static final java.lang.String _IRL = "IRL";
    public static final java.lang.String _AUS_NZL = "AUS_NZL";
    public static final RegionEnum ZAF = new RegionEnum(_ZAF);
    public static final RegionEnum NA = new RegionEnum(_NA);
    public static final RegionEnum NORD = new RegionEnum(_NORD);
    public static final RegionEnum GBR = new RegionEnum(_GBR);
    public static final RegionEnum IRL = new RegionEnum(_IRL);
    public static final RegionEnum AUS_NZL = new RegionEnum(_AUS_NZL);
    public java.lang.String getValue() { return _value_;}
    public static RegionEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RegionEnum enumeration = (RegionEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RegionEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RegionEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RegionEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

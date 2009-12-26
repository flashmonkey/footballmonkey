/**
 * ModifyProfileErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ModifyProfileErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ModifyProfileErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _VALIDATION_ERRORS = "VALIDATION_ERRORS";
    public static final java.lang.String _PROFILE_MODIFICATION_ERROR = "PROFILE_MODIFICATION_ERROR";
    public static final java.lang.String _UNAUTHORIZED = "UNAUTHORIZED";
    public static final java.lang.String _INVALID_PASSWORD = "INVALID_PASSWORD";
    public static final java.lang.String _ACCOUNT_INACTIVE = "ACCOUNT_INACTIVE";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final ModifyProfileErrorEnum OK = new ModifyProfileErrorEnum(_OK);
    public static final ModifyProfileErrorEnum VALIDATION_ERRORS = new ModifyProfileErrorEnum(_VALIDATION_ERRORS);
    public static final ModifyProfileErrorEnum PROFILE_MODIFICATION_ERROR = new ModifyProfileErrorEnum(_PROFILE_MODIFICATION_ERROR);
    public static final ModifyProfileErrorEnum UNAUTHORIZED = new ModifyProfileErrorEnum(_UNAUTHORIZED);
    public static final ModifyProfileErrorEnum INVALID_PASSWORD = new ModifyProfileErrorEnum(_INVALID_PASSWORD);
    public static final ModifyProfileErrorEnum ACCOUNT_INACTIVE = new ModifyProfileErrorEnum(_ACCOUNT_INACTIVE);
    public static final ModifyProfileErrorEnum API_ERROR = new ModifyProfileErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static ModifyProfileErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ModifyProfileErrorEnum enumeration = (ModifyProfileErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ModifyProfileErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ModifyProfileErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ModifyProfileErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

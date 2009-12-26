/**
 * ForgotPasswordErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ForgotPasswordErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ForgotPasswordErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_USERNAME = "INVALID_USERNAME";
    public static final java.lang.String _INVALID_COUNTRY_OF_RESIDENCE = "INVALID_COUNTRY_OF_RESIDENCE";
    public static final java.lang.String _INVALID_EMAIL = "INVALID_EMAIL";
    public static final java.lang.String _INVALID_ANSWER = "INVALID_ANSWER";
    public static final java.lang.String _INVALID_PASSWORD = "INVALID_PASSWORD";
    public static final java.lang.String _TOO_MANY_ATTEMPTS_ACCOUNT_SUSPENDED = "TOO_MANY_ATTEMPTS_ACCOUNT_SUSPENDED";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final ForgotPasswordErrorEnum OK = new ForgotPasswordErrorEnum(_OK);
    public static final ForgotPasswordErrorEnum INVALID_USERNAME = new ForgotPasswordErrorEnum(_INVALID_USERNAME);
    public static final ForgotPasswordErrorEnum INVALID_COUNTRY_OF_RESIDENCE = new ForgotPasswordErrorEnum(_INVALID_COUNTRY_OF_RESIDENCE);
    public static final ForgotPasswordErrorEnum INVALID_EMAIL = new ForgotPasswordErrorEnum(_INVALID_EMAIL);
    public static final ForgotPasswordErrorEnum INVALID_ANSWER = new ForgotPasswordErrorEnum(_INVALID_ANSWER);
    public static final ForgotPasswordErrorEnum INVALID_PASSWORD = new ForgotPasswordErrorEnum(_INVALID_PASSWORD);
    public static final ForgotPasswordErrorEnum TOO_MANY_ATTEMPTS_ACCOUNT_SUSPENDED = new ForgotPasswordErrorEnum(_TOO_MANY_ATTEMPTS_ACCOUNT_SUSPENDED);
    public static final ForgotPasswordErrorEnum API_ERROR = new ForgotPasswordErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static ForgotPasswordErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ForgotPasswordErrorEnum enumeration = (ForgotPasswordErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ForgotPasswordErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ForgotPasswordErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ForgotPasswordErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * LoginErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class LoginErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LoginErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _OK_MESSAGES = "OK_MESSAGES";
    public static final java.lang.String _FAILED_MESSAGE = "FAILED_MESSAGE";
    public static final java.lang.String _INVALID_USERNAME_OR_PASSWORD = "INVALID_USERNAME_OR_PASSWORD";
    public static final java.lang.String _USER_NOT_ACCOUNT_OWNER = "USER_NOT_ACCOUNT_OWNER";
    public static final java.lang.String _INVALID_VENDOR_SOFTWARE_ID = "INVALID_VENDOR_SOFTWARE_ID";
    public static final java.lang.String _INVALID_PRODUCT = "INVALID_PRODUCT";
    public static final java.lang.String _INVALID_LOCATION = "INVALID_LOCATION";
    public static final java.lang.String _LOGIN_FAILED_ACCOUNT_LOCKED = "LOGIN_FAILED_ACCOUNT_LOCKED";
    public static final java.lang.String _ACCOUNT_SUSPENDED = "ACCOUNT_SUSPENDED";
    public static final java.lang.String _T_AND_C_ACCEPTANCE_REQUIRED = "T_AND_C_ACCEPTANCE_REQUIRED";
    public static final java.lang.String _POKER_T_AND_C_ACCEPTANCE_REQUIRED = "POKER_T_AND_C_ACCEPTANCE_REQUIRED";
    public static final java.lang.String _LOGIN_REQUIRE_TERMS_AND_CONDITIONS_ACCEPTANCE = "LOGIN_REQUIRE_TERMS_AND_CONDITIONS_ACCEPTANCE";
    public static final java.lang.String _LOGIN_UNAUTHORIZED = "LOGIN_UNAUTHORIZED";
    public static final java.lang.String _ACCOUNT_CLOSED = "ACCOUNT_CLOSED";
    public static final java.lang.String _LOGIN_RESTRICTED_LOCATION = "LOGIN_RESTRICTED_LOCATION";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final LoginErrorEnum OK = new LoginErrorEnum(_OK);
    public static final LoginErrorEnum OK_MESSAGES = new LoginErrorEnum(_OK_MESSAGES);
    public static final LoginErrorEnum FAILED_MESSAGE = new LoginErrorEnum(_FAILED_MESSAGE);
    public static final LoginErrorEnum INVALID_USERNAME_OR_PASSWORD = new LoginErrorEnum(_INVALID_USERNAME_OR_PASSWORD);
    public static final LoginErrorEnum USER_NOT_ACCOUNT_OWNER = new LoginErrorEnum(_USER_NOT_ACCOUNT_OWNER);
    public static final LoginErrorEnum INVALID_VENDOR_SOFTWARE_ID = new LoginErrorEnum(_INVALID_VENDOR_SOFTWARE_ID);
    public static final LoginErrorEnum INVALID_PRODUCT = new LoginErrorEnum(_INVALID_PRODUCT);
    public static final LoginErrorEnum INVALID_LOCATION = new LoginErrorEnum(_INVALID_LOCATION);
    public static final LoginErrorEnum LOGIN_FAILED_ACCOUNT_LOCKED = new LoginErrorEnum(_LOGIN_FAILED_ACCOUNT_LOCKED);
    public static final LoginErrorEnum ACCOUNT_SUSPENDED = new LoginErrorEnum(_ACCOUNT_SUSPENDED);
    public static final LoginErrorEnum T_AND_C_ACCEPTANCE_REQUIRED = new LoginErrorEnum(_T_AND_C_ACCEPTANCE_REQUIRED);
    public static final LoginErrorEnum POKER_T_AND_C_ACCEPTANCE_REQUIRED = new LoginErrorEnum(_POKER_T_AND_C_ACCEPTANCE_REQUIRED);
    public static final LoginErrorEnum LOGIN_REQUIRE_TERMS_AND_CONDITIONS_ACCEPTANCE = new LoginErrorEnum(_LOGIN_REQUIRE_TERMS_AND_CONDITIONS_ACCEPTANCE);
    public static final LoginErrorEnum LOGIN_UNAUTHORIZED = new LoginErrorEnum(_LOGIN_UNAUTHORIZED);
    public static final LoginErrorEnum ACCOUNT_CLOSED = new LoginErrorEnum(_ACCOUNT_CLOSED);
    public static final LoginErrorEnum LOGIN_RESTRICTED_LOCATION = new LoginErrorEnum(_LOGIN_RESTRICTED_LOCATION);
    public static final LoginErrorEnum API_ERROR = new LoginErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static LoginErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LoginErrorEnum enumeration = (LoginErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LoginErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LoginErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LoginErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

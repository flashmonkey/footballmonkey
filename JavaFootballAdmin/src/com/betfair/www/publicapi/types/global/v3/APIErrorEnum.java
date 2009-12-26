/**
 * APIErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class APIErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected APIErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INTERNAL_ERROR = "INTERNAL_ERROR";
    public static final java.lang.String _EXCEEDED_THROTTLE = "EXCEEDED_THROTTLE";
    public static final java.lang.String _USER_NOT_SUBSCRIBED_TO_PRODUCT = "USER_NOT_SUBSCRIBED_TO_PRODUCT";
    public static final java.lang.String _SUBSCRIPTION_INACTIVE_OR_SUSPENDED = "SUBSCRIPTION_INACTIVE_OR_SUSPENDED";
    public static final java.lang.String _VENDOR_SOFTWARE_INACTIVE = "VENDOR_SOFTWARE_INACTIVE";
    public static final java.lang.String _VENDOR_SOFTWARE_INVALID = "VENDOR_SOFTWARE_INVALID";
    public static final java.lang.String _SERVICE_NOT_AVAILABLE_IN_PRODUCT = "SERVICE_NOT_AVAILABLE_IN_PRODUCT";
    public static final java.lang.String _NO_SESSION = "NO_SESSION";
    public static final java.lang.String _TOO_MANY_REQUESTS = "TOO_MANY_REQUESTS";
    public static final java.lang.String _PRODUCT_REQUIRES_FUNDED_ACCOUNT = "PRODUCT_REQUIRES_FUNDED_ACCOUNT";
    public static final java.lang.String _SERVICE_NOT_AVAILABLE_FOR_LOGIN_STATUS = "SERVICE_NOT_AVAILABLE_FOR_LOGIN_STATUS";
    public static final APIErrorEnum OK = new APIErrorEnum(_OK);
    public static final APIErrorEnum INTERNAL_ERROR = new APIErrorEnum(_INTERNAL_ERROR);
    public static final APIErrorEnum EXCEEDED_THROTTLE = new APIErrorEnum(_EXCEEDED_THROTTLE);
    public static final APIErrorEnum USER_NOT_SUBSCRIBED_TO_PRODUCT = new APIErrorEnum(_USER_NOT_SUBSCRIBED_TO_PRODUCT);
    public static final APIErrorEnum SUBSCRIPTION_INACTIVE_OR_SUSPENDED = new APIErrorEnum(_SUBSCRIPTION_INACTIVE_OR_SUSPENDED);
    public static final APIErrorEnum VENDOR_SOFTWARE_INACTIVE = new APIErrorEnum(_VENDOR_SOFTWARE_INACTIVE);
    public static final APIErrorEnum VENDOR_SOFTWARE_INVALID = new APIErrorEnum(_VENDOR_SOFTWARE_INVALID);
    public static final APIErrorEnum SERVICE_NOT_AVAILABLE_IN_PRODUCT = new APIErrorEnum(_SERVICE_NOT_AVAILABLE_IN_PRODUCT);
    public static final APIErrorEnum NO_SESSION = new APIErrorEnum(_NO_SESSION);
    public static final APIErrorEnum TOO_MANY_REQUESTS = new APIErrorEnum(_TOO_MANY_REQUESTS);
    public static final APIErrorEnum PRODUCT_REQUIRES_FUNDED_ACCOUNT = new APIErrorEnum(_PRODUCT_REQUIRES_FUNDED_ACCOUNT);
    public static final APIErrorEnum SERVICE_NOT_AVAILABLE_FOR_LOGIN_STATUS = new APIErrorEnum(_SERVICE_NOT_AVAILABLE_FOR_LOGIN_STATUS);
    public java.lang.String getValue() { return _value_;}
    public static APIErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        APIErrorEnum enumeration = (APIErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static APIErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(APIErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "APIErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

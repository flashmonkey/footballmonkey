/**
 * TransferFundsErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class TransferFundsErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransferFundsErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_AMOUNT = "INVALID_AMOUNT";
    public static final java.lang.String _TRANSFER_FAILED = "TRANSFER_FAILED";
    public static final java.lang.String _OVER_BALANCE = "OVER_BALANCE";
    public static final java.lang.String _WALLETS_MUST_BE_DIFFERENT = "WALLETS_MUST_BE_DIFFERENT";
    public static final java.lang.String _SOURCE_WALLET_UNKNOWN = "SOURCE_WALLET_UNKNOWN";
    public static final java.lang.String _SOURCE_WALLET_SUSPENDED = "SOURCE_WALLET_SUSPENDED";
    public static final java.lang.String _SOURCE_WALLET_SUSPENDED_KYC = "SOURCE_WALLET_SUSPENDED_KYC";
    public static final java.lang.String _SOURCE_WALLET_KYC_WITHDRAWAL = "SOURCE_WALLET_KYC_WITHDRAWAL";
    public static final java.lang.String _SOURCE_WALLET_KYC_DEPOSIT_TOTAL = "SOURCE_WALLET_KYC_DEPOSIT_TOTAL";
    public static final java.lang.String _SOURCE_WALLET_KYC_DEPOSIT_MONTH = "SOURCE_WALLET_KYC_DEPOSIT_MONTH";
    public static final java.lang.String _TARGET_WALLET_UNKNOWN = "TARGET_WALLET_UNKNOWN";
    public static final java.lang.String _TARGET_WALLET_SUSPENDED = "TARGET_WALLET_SUSPENDED";
    public static final java.lang.String _TARGET_WALLET_SUSPENDED_KYC = "TARGET_WALLET_SUSPENDED_KYC";
    public static final java.lang.String _TARGET_WALLET_KYC_WITHDRAWAL = "TARGET_WALLET_KYC_WITHDRAWAL";
    public static final java.lang.String _TARGET_WALLET_KYC_DEPOSIT_TOTAL = "TARGET_WALLET_KYC_DEPOSIT_TOTAL";
    public static final java.lang.String _TARGET_WALLET_KYC_DEPOSIT_MONTH = "TARGET_WALLET_KYC_DEPOSIT_MONTH";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final TransferFundsErrorEnum OK = new TransferFundsErrorEnum(_OK);
    public static final TransferFundsErrorEnum INVALID_AMOUNT = new TransferFundsErrorEnum(_INVALID_AMOUNT);
    public static final TransferFundsErrorEnum TRANSFER_FAILED = new TransferFundsErrorEnum(_TRANSFER_FAILED);
    public static final TransferFundsErrorEnum OVER_BALANCE = new TransferFundsErrorEnum(_OVER_BALANCE);
    public static final TransferFundsErrorEnum WALLETS_MUST_BE_DIFFERENT = new TransferFundsErrorEnum(_WALLETS_MUST_BE_DIFFERENT);
    public static final TransferFundsErrorEnum SOURCE_WALLET_UNKNOWN = new TransferFundsErrorEnum(_SOURCE_WALLET_UNKNOWN);
    public static final TransferFundsErrorEnum SOURCE_WALLET_SUSPENDED = new TransferFundsErrorEnum(_SOURCE_WALLET_SUSPENDED);
    public static final TransferFundsErrorEnum SOURCE_WALLET_SUSPENDED_KYC = new TransferFundsErrorEnum(_SOURCE_WALLET_SUSPENDED_KYC);
    public static final TransferFundsErrorEnum SOURCE_WALLET_KYC_WITHDRAWAL = new TransferFundsErrorEnum(_SOURCE_WALLET_KYC_WITHDRAWAL);
    public static final TransferFundsErrorEnum SOURCE_WALLET_KYC_DEPOSIT_TOTAL = new TransferFundsErrorEnum(_SOURCE_WALLET_KYC_DEPOSIT_TOTAL);
    public static final TransferFundsErrorEnum SOURCE_WALLET_KYC_DEPOSIT_MONTH = new TransferFundsErrorEnum(_SOURCE_WALLET_KYC_DEPOSIT_MONTH);
    public static final TransferFundsErrorEnum TARGET_WALLET_UNKNOWN = new TransferFundsErrorEnum(_TARGET_WALLET_UNKNOWN);
    public static final TransferFundsErrorEnum TARGET_WALLET_SUSPENDED = new TransferFundsErrorEnum(_TARGET_WALLET_SUSPENDED);
    public static final TransferFundsErrorEnum TARGET_WALLET_SUSPENDED_KYC = new TransferFundsErrorEnum(_TARGET_WALLET_SUSPENDED_KYC);
    public static final TransferFundsErrorEnum TARGET_WALLET_KYC_WITHDRAWAL = new TransferFundsErrorEnum(_TARGET_WALLET_KYC_WITHDRAWAL);
    public static final TransferFundsErrorEnum TARGET_WALLET_KYC_DEPOSIT_TOTAL = new TransferFundsErrorEnum(_TARGET_WALLET_KYC_DEPOSIT_TOTAL);
    public static final TransferFundsErrorEnum TARGET_WALLET_KYC_DEPOSIT_MONTH = new TransferFundsErrorEnum(_TARGET_WALLET_KYC_DEPOSIT_MONTH);
    public static final TransferFundsErrorEnum API_ERROR = new TransferFundsErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static TransferFundsErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransferFundsErrorEnum enumeration = (TransferFundsErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransferFundsErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransferFundsErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "TransferFundsErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

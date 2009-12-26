/**
 * MultiWinnerOddsLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class MultiWinnerOddsLine  extends com.betfair.www.publicapi.types.exchange.v5.ProfitAndLoss  implements java.io.Serializable {
    private double ifLoss;

    public MultiWinnerOddsLine() {
    }

    public MultiWinnerOddsLine(
           double futureIfWin,
           double ifWin,
           int selectionId,
           java.lang.String selectionName,
           double worstcaseIfWin,
           double ifLoss) {
        super(
            futureIfWin,
            ifWin,
            selectionId,
            selectionName,
            worstcaseIfWin);
        this.ifLoss = ifLoss;
    }


    /**
     * Gets the ifLoss value for this MultiWinnerOddsLine.
     * 
     * @return ifLoss
     */
    public double getIfLoss() {
        return ifLoss;
    }


    /**
     * Sets the ifLoss value for this MultiWinnerOddsLine.
     * 
     * @param ifLoss
     */
    public void setIfLoss(double ifLoss) {
        this.ifLoss = ifLoss;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultiWinnerOddsLine)) return false;
        MultiWinnerOddsLine other = (MultiWinnerOddsLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.ifLoss == other.getIfLoss();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += new Double(getIfLoss()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MultiWinnerOddsLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MultiWinnerOddsLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifLoss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifLoss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

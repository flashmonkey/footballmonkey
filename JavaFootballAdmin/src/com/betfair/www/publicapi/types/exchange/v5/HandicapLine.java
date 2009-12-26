/**
 * HandicapLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class HandicapLine  extends com.betfair.www.publicapi.types.exchange.v5.ProfitAndLoss  implements java.io.Serializable {
    private double from;

    private double to;

    public HandicapLine() {
    }

    public HandicapLine(
           double futureIfWin,
           double ifWin,
           int selectionId,
           java.lang.String selectionName,
           double worstcaseIfWin,
           double from,
           double to) {
        super(
            futureIfWin,
            ifWin,
            selectionId,
            selectionName,
            worstcaseIfWin);
        this.from = from;
        this.to = to;
    }


    /**
     * Gets the from value for this HandicapLine.
     * 
     * @return from
     */
    public double getFrom() {
        return from;
    }


    /**
     * Sets the from value for this HandicapLine.
     * 
     * @param from
     */
    public void setFrom(double from) {
        this.from = from;
    }


    /**
     * Gets the to value for this HandicapLine.
     * 
     * @return to
     */
    public double getTo() {
        return to;
    }


    /**
     * Sets the to value for this HandicapLine.
     * 
     * @param to
     */
    public void setTo(double to) {
        this.to = to;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HandicapLine)) return false;
        HandicapLine other = (HandicapLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.from == other.getFrom() &&
            this.to == other.getTo();
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
        _hashCode += new Double(getFrom()).hashCode();
        _hashCode += new Double(getTo()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HandicapLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "HandicapLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
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

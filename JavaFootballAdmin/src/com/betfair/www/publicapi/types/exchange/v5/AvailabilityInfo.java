/**
 * AvailabilityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class AvailabilityInfo  implements java.io.Serializable {
    private double odds;

    private double totalAvailableBackAmount;

    private double totalAvailableLayAmount;

    private double totalBspBackAmount;

    private double totalBspLayAmount;

    public AvailabilityInfo() {
    }

    public AvailabilityInfo(
           double odds,
           double totalAvailableBackAmount,
           double totalAvailableLayAmount,
           double totalBspBackAmount,
           double totalBspLayAmount) {
           this.odds = odds;
           this.totalAvailableBackAmount = totalAvailableBackAmount;
           this.totalAvailableLayAmount = totalAvailableLayAmount;
           this.totalBspBackAmount = totalBspBackAmount;
           this.totalBspLayAmount = totalBspLayAmount;
    }


    /**
     * Gets the odds value for this AvailabilityInfo.
     * 
     * @return odds
     */
    public double getOdds() {
        return odds;
    }


    /**
     * Sets the odds value for this AvailabilityInfo.
     * 
     * @param odds
     */
    public void setOdds(double odds) {
        this.odds = odds;
    }


    /**
     * Gets the totalAvailableBackAmount value for this AvailabilityInfo.
     * 
     * @return totalAvailableBackAmount
     */
    public double getTotalAvailableBackAmount() {
        return totalAvailableBackAmount;
    }


    /**
     * Sets the totalAvailableBackAmount value for this AvailabilityInfo.
     * 
     * @param totalAvailableBackAmount
     */
    public void setTotalAvailableBackAmount(double totalAvailableBackAmount) {
        this.totalAvailableBackAmount = totalAvailableBackAmount;
    }


    /**
     * Gets the totalAvailableLayAmount value for this AvailabilityInfo.
     * 
     * @return totalAvailableLayAmount
     */
    public double getTotalAvailableLayAmount() {
        return totalAvailableLayAmount;
    }


    /**
     * Sets the totalAvailableLayAmount value for this AvailabilityInfo.
     * 
     * @param totalAvailableLayAmount
     */
    public void setTotalAvailableLayAmount(double totalAvailableLayAmount) {
        this.totalAvailableLayAmount = totalAvailableLayAmount;
    }


    /**
     * Gets the totalBspBackAmount value for this AvailabilityInfo.
     * 
     * @return totalBspBackAmount
     */
    public double getTotalBspBackAmount() {
        return totalBspBackAmount;
    }


    /**
     * Sets the totalBspBackAmount value for this AvailabilityInfo.
     * 
     * @param totalBspBackAmount
     */
    public void setTotalBspBackAmount(double totalBspBackAmount) {
        this.totalBspBackAmount = totalBspBackAmount;
    }


    /**
     * Gets the totalBspLayAmount value for this AvailabilityInfo.
     * 
     * @return totalBspLayAmount
     */
    public double getTotalBspLayAmount() {
        return totalBspLayAmount;
    }


    /**
     * Sets the totalBspLayAmount value for this AvailabilityInfo.
     * 
     * @param totalBspLayAmount
     */
    public void setTotalBspLayAmount(double totalBspLayAmount) {
        this.totalBspLayAmount = totalBspLayAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityInfo)) return false;
        AvailabilityInfo other = (AvailabilityInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.odds == other.getOdds() &&
            this.totalAvailableBackAmount == other.getTotalAvailableBackAmount() &&
            this.totalAvailableLayAmount == other.getTotalAvailableLayAmount() &&
            this.totalBspBackAmount == other.getTotalBspBackAmount() &&
            this.totalBspLayAmount == other.getTotalBspLayAmount();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Double(getOdds()).hashCode();
        _hashCode += new Double(getTotalAvailableBackAmount()).hashCode();
        _hashCode += new Double(getTotalAvailableLayAmount()).hashCode();
        _hashCode += new Double(getTotalBspBackAmount()).hashCode();
        _hashCode += new Double(getTotalBspLayAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "AvailabilityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("odds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "odds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAvailableBackAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAvailableBackAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAvailableLayAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAvailableLayAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBspBackAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalBspBackAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBspLayAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalBspLayAmount"));
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

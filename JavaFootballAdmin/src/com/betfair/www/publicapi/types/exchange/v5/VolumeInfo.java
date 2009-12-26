/**
 * VolumeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class VolumeInfo  implements java.io.Serializable {
    private double odds;

    private double totalMatchedAmount;

    private double totalBspBackMatchedAmount;

    private double totalBspLiabilityMatchedAmount;

    public VolumeInfo() {
    }

    public VolumeInfo(
           double odds,
           double totalMatchedAmount,
           double totalBspBackMatchedAmount,
           double totalBspLiabilityMatchedAmount) {
           this.odds = odds;
           this.totalMatchedAmount = totalMatchedAmount;
           this.totalBspBackMatchedAmount = totalBspBackMatchedAmount;
           this.totalBspLiabilityMatchedAmount = totalBspLiabilityMatchedAmount;
    }


    /**
     * Gets the odds value for this VolumeInfo.
     * 
     * @return odds
     */
    public double getOdds() {
        return odds;
    }


    /**
     * Sets the odds value for this VolumeInfo.
     * 
     * @param odds
     */
    public void setOdds(double odds) {
        this.odds = odds;
    }


    /**
     * Gets the totalMatchedAmount value for this VolumeInfo.
     * 
     * @return totalMatchedAmount
     */
    public double getTotalMatchedAmount() {
        return totalMatchedAmount;
    }


    /**
     * Sets the totalMatchedAmount value for this VolumeInfo.
     * 
     * @param totalMatchedAmount
     */
    public void setTotalMatchedAmount(double totalMatchedAmount) {
        this.totalMatchedAmount = totalMatchedAmount;
    }


    /**
     * Gets the totalBspBackMatchedAmount value for this VolumeInfo.
     * 
     * @return totalBspBackMatchedAmount
     */
    public double getTotalBspBackMatchedAmount() {
        return totalBspBackMatchedAmount;
    }


    /**
     * Sets the totalBspBackMatchedAmount value for this VolumeInfo.
     * 
     * @param totalBspBackMatchedAmount
     */
    public void setTotalBspBackMatchedAmount(double totalBspBackMatchedAmount) {
        this.totalBspBackMatchedAmount = totalBspBackMatchedAmount;
    }


    /**
     * Gets the totalBspLiabilityMatchedAmount value for this VolumeInfo.
     * 
     * @return totalBspLiabilityMatchedAmount
     */
    public double getTotalBspLiabilityMatchedAmount() {
        return totalBspLiabilityMatchedAmount;
    }


    /**
     * Sets the totalBspLiabilityMatchedAmount value for this VolumeInfo.
     * 
     * @param totalBspLiabilityMatchedAmount
     */
    public void setTotalBspLiabilityMatchedAmount(double totalBspLiabilityMatchedAmount) {
        this.totalBspLiabilityMatchedAmount = totalBspLiabilityMatchedAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VolumeInfo)) return false;
        VolumeInfo other = (VolumeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.odds == other.getOdds() &&
            this.totalMatchedAmount == other.getTotalMatchedAmount() &&
            this.totalBspBackMatchedAmount == other.getTotalBspBackMatchedAmount() &&
            this.totalBspLiabilityMatchedAmount == other.getTotalBspLiabilityMatchedAmount();
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
        _hashCode += new Double(getTotalMatchedAmount()).hashCode();
        _hashCode += new Double(getTotalBspBackMatchedAmount()).hashCode();
        _hashCode += new Double(getTotalBspLiabilityMatchedAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VolumeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "VolumeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("odds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "odds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMatchedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalMatchedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBspBackMatchedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalBspBackMatchedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBspLiabilityMatchedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalBspLiabilityMatchedAmount"));
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

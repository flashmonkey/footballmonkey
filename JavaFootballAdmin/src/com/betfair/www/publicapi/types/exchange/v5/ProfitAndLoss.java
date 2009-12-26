/**
 * ProfitAndLoss.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class ProfitAndLoss  implements java.io.Serializable {
    private double futureIfWin;

    private double ifWin;

    private int selectionId;

    private java.lang.String selectionName;

    private double worstcaseIfWin;

    public ProfitAndLoss() {
    }

    public ProfitAndLoss(
           double futureIfWin,
           double ifWin,
           int selectionId,
           java.lang.String selectionName,
           double worstcaseIfWin) {
           this.futureIfWin = futureIfWin;
           this.ifWin = ifWin;
           this.selectionId = selectionId;
           this.selectionName = selectionName;
           this.worstcaseIfWin = worstcaseIfWin;
    }


    /**
     * Gets the futureIfWin value for this ProfitAndLoss.
     * 
     * @return futureIfWin
     */
    public double getFutureIfWin() {
        return futureIfWin;
    }


    /**
     * Sets the futureIfWin value for this ProfitAndLoss.
     * 
     * @param futureIfWin
     */
    public void setFutureIfWin(double futureIfWin) {
        this.futureIfWin = futureIfWin;
    }


    /**
     * Gets the ifWin value for this ProfitAndLoss.
     * 
     * @return ifWin
     */
    public double getIfWin() {
        return ifWin;
    }


    /**
     * Sets the ifWin value for this ProfitAndLoss.
     * 
     * @param ifWin
     */
    public void setIfWin(double ifWin) {
        this.ifWin = ifWin;
    }


    /**
     * Gets the selectionId value for this ProfitAndLoss.
     * 
     * @return selectionId
     */
    public int getSelectionId() {
        return selectionId;
    }


    /**
     * Sets the selectionId value for this ProfitAndLoss.
     * 
     * @param selectionId
     */
    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }


    /**
     * Gets the selectionName value for this ProfitAndLoss.
     * 
     * @return selectionName
     */
    public java.lang.String getSelectionName() {
        return selectionName;
    }


    /**
     * Sets the selectionName value for this ProfitAndLoss.
     * 
     * @param selectionName
     */
    public void setSelectionName(java.lang.String selectionName) {
        this.selectionName = selectionName;
    }


    /**
     * Gets the worstcaseIfWin value for this ProfitAndLoss.
     * 
     * @return worstcaseIfWin
     */
    public double getWorstcaseIfWin() {
        return worstcaseIfWin;
    }


    /**
     * Sets the worstcaseIfWin value for this ProfitAndLoss.
     * 
     * @param worstcaseIfWin
     */
    public void setWorstcaseIfWin(double worstcaseIfWin) {
        this.worstcaseIfWin = worstcaseIfWin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfitAndLoss)) return false;
        ProfitAndLoss other = (ProfitAndLoss) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.futureIfWin == other.getFutureIfWin() &&
            this.ifWin == other.getIfWin() &&
            this.selectionId == other.getSelectionId() &&
            ((this.selectionName==null && other.getSelectionName()==null) || 
             (this.selectionName!=null &&
              this.selectionName.equals(other.getSelectionName()))) &&
            this.worstcaseIfWin == other.getWorstcaseIfWin();
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
        _hashCode += new Double(getFutureIfWin()).hashCode();
        _hashCode += new Double(getIfWin()).hashCode();
        _hashCode += getSelectionId();
        if (getSelectionName() != null) {
            _hashCode += getSelectionName().hashCode();
        }
        _hashCode += new Double(getWorstcaseIfWin()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfitAndLoss.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ProfitAndLoss"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("futureIfWin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "futureIfWin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifWin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifWin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("worstcaseIfWin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "worstcaseIfWin"));
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

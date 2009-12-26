/**
 * ServiceCall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ServiceCall  implements java.io.Serializable {
    private int maxUsages;

    private long period;

    private java.util.Calendar periodExpiry;

    private com.betfair.www.publicapi.types.global.v3.ServiceEnum serviceType;

    private int usageCount;

    public ServiceCall() {
    }

    public ServiceCall(
           int maxUsages,
           long period,
           java.util.Calendar periodExpiry,
           com.betfair.www.publicapi.types.global.v3.ServiceEnum serviceType,
           int usageCount) {
           this.maxUsages = maxUsages;
           this.period = period;
           this.periodExpiry = periodExpiry;
           this.serviceType = serviceType;
           this.usageCount = usageCount;
    }


    /**
     * Gets the maxUsages value for this ServiceCall.
     * 
     * @return maxUsages
     */
    public int getMaxUsages() {
        return maxUsages;
    }


    /**
     * Sets the maxUsages value for this ServiceCall.
     * 
     * @param maxUsages
     */
    public void setMaxUsages(int maxUsages) {
        this.maxUsages = maxUsages;
    }


    /**
     * Gets the period value for this ServiceCall.
     * 
     * @return period
     */
    public long getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this ServiceCall.
     * 
     * @param period
     */
    public void setPeriod(long period) {
        this.period = period;
    }


    /**
     * Gets the periodExpiry value for this ServiceCall.
     * 
     * @return periodExpiry
     */
    public java.util.Calendar getPeriodExpiry() {
        return periodExpiry;
    }


    /**
     * Sets the periodExpiry value for this ServiceCall.
     * 
     * @param periodExpiry
     */
    public void setPeriodExpiry(java.util.Calendar periodExpiry) {
        this.periodExpiry = periodExpiry;
    }


    /**
     * Gets the serviceType value for this ServiceCall.
     * 
     * @return serviceType
     */
    public com.betfair.www.publicapi.types.global.v3.ServiceEnum getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this ServiceCall.
     * 
     * @param serviceType
     */
    public void setServiceType(com.betfair.www.publicapi.types.global.v3.ServiceEnum serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the usageCount value for this ServiceCall.
     * 
     * @return usageCount
     */
    public int getUsageCount() {
        return usageCount;
    }


    /**
     * Sets the usageCount value for this ServiceCall.
     * 
     * @param usageCount
     */
    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceCall)) return false;
        ServiceCall other = (ServiceCall) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.maxUsages == other.getMaxUsages() &&
            this.period == other.getPeriod() &&
            ((this.periodExpiry==null && other.getPeriodExpiry()==null) || 
             (this.periodExpiry!=null &&
              this.periodExpiry.equals(other.getPeriodExpiry()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            this.usageCount == other.getUsageCount();
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
        _hashCode += getMaxUsages();
        _hashCode += new Long(getPeriod()).hashCode();
        if (getPeriodExpiry() != null) {
            _hashCode += getPeriodExpiry().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        _hashCode += getUsageCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceCall.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ServiceCall"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxUsages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxUsages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodExpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodExpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ServiceEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

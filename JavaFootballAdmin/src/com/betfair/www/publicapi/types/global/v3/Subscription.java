/**
 * Subscription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class Subscription  implements java.io.Serializable {
    private double billingAmount;

    private java.util.Calendar billingDate;

    private com.betfair.www.publicapi.types.global.v3.BillingPeriodEnum billingPeriod;

    private int productId;

    private java.lang.String productName;

    private com.betfair.www.publicapi.types.global.v3.ServiceCall[] services;

    private double setupCharge;

    private boolean setupChargeActive;

    private com.betfair.www.publicapi.types.global.v3.SubscriptionStatusEnum status;

    private java.util.Calendar subscribedDate;

    private boolean vatEnabled;

    public Subscription() {
    }

    public Subscription(
           double billingAmount,
           java.util.Calendar billingDate,
           com.betfair.www.publicapi.types.global.v3.BillingPeriodEnum billingPeriod,
           int productId,
           java.lang.String productName,
           com.betfair.www.publicapi.types.global.v3.ServiceCall[] services,
           double setupCharge,
           boolean setupChargeActive,
           com.betfair.www.publicapi.types.global.v3.SubscriptionStatusEnum status,
           java.util.Calendar subscribedDate,
           boolean vatEnabled) {
           this.billingAmount = billingAmount;
           this.billingDate = billingDate;
           this.billingPeriod = billingPeriod;
           this.productId = productId;
           this.productName = productName;
           this.services = services;
           this.setupCharge = setupCharge;
           this.setupChargeActive = setupChargeActive;
           this.status = status;
           this.subscribedDate = subscribedDate;
           this.vatEnabled = vatEnabled;
    }


    /**
     * Gets the billingAmount value for this Subscription.
     * 
     * @return billingAmount
     */
    public double getBillingAmount() {
        return billingAmount;
    }


    /**
     * Sets the billingAmount value for this Subscription.
     * 
     * @param billingAmount
     */
    public void setBillingAmount(double billingAmount) {
        this.billingAmount = billingAmount;
    }


    /**
     * Gets the billingDate value for this Subscription.
     * 
     * @return billingDate
     */
    public java.util.Calendar getBillingDate() {
        return billingDate;
    }


    /**
     * Sets the billingDate value for this Subscription.
     * 
     * @param billingDate
     */
    public void setBillingDate(java.util.Calendar billingDate) {
        this.billingDate = billingDate;
    }


    /**
     * Gets the billingPeriod value for this Subscription.
     * 
     * @return billingPeriod
     */
    public com.betfair.www.publicapi.types.global.v3.BillingPeriodEnum getBillingPeriod() {
        return billingPeriod;
    }


    /**
     * Sets the billingPeriod value for this Subscription.
     * 
     * @param billingPeriod
     */
    public void setBillingPeriod(com.betfair.www.publicapi.types.global.v3.BillingPeriodEnum billingPeriod) {
        this.billingPeriod = billingPeriod;
    }


    /**
     * Gets the productId value for this Subscription.
     * 
     * @return productId
     */
    public int getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this Subscription.
     * 
     * @param productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }


    /**
     * Gets the productName value for this Subscription.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this Subscription.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the services value for this Subscription.
     * 
     * @return services
     */
    public com.betfair.www.publicapi.types.global.v3.ServiceCall[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this Subscription.
     * 
     * @param services
     */
    public void setServices(com.betfair.www.publicapi.types.global.v3.ServiceCall[] services) {
        this.services = services;
    }


    /**
     * Gets the setupCharge value for this Subscription.
     * 
     * @return setupCharge
     */
    public double getSetupCharge() {
        return setupCharge;
    }


    /**
     * Sets the setupCharge value for this Subscription.
     * 
     * @param setupCharge
     */
    public void setSetupCharge(double setupCharge) {
        this.setupCharge = setupCharge;
    }


    /**
     * Gets the setupChargeActive value for this Subscription.
     * 
     * @return setupChargeActive
     */
    public boolean isSetupChargeActive() {
        return setupChargeActive;
    }


    /**
     * Sets the setupChargeActive value for this Subscription.
     * 
     * @param setupChargeActive
     */
    public void setSetupChargeActive(boolean setupChargeActive) {
        this.setupChargeActive = setupChargeActive;
    }


    /**
     * Gets the status value for this Subscription.
     * 
     * @return status
     */
    public com.betfair.www.publicapi.types.global.v3.SubscriptionStatusEnum getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Subscription.
     * 
     * @param status
     */
    public void setStatus(com.betfair.www.publicapi.types.global.v3.SubscriptionStatusEnum status) {
        this.status = status;
    }


    /**
     * Gets the subscribedDate value for this Subscription.
     * 
     * @return subscribedDate
     */
    public java.util.Calendar getSubscribedDate() {
        return subscribedDate;
    }


    /**
     * Sets the subscribedDate value for this Subscription.
     * 
     * @param subscribedDate
     */
    public void setSubscribedDate(java.util.Calendar subscribedDate) {
        this.subscribedDate = subscribedDate;
    }


    /**
     * Gets the vatEnabled value for this Subscription.
     * 
     * @return vatEnabled
     */
    public boolean isVatEnabled() {
        return vatEnabled;
    }


    /**
     * Sets the vatEnabled value for this Subscription.
     * 
     * @param vatEnabled
     */
    public void setVatEnabled(boolean vatEnabled) {
        this.vatEnabled = vatEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subscription)) return false;
        Subscription other = (Subscription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.billingAmount == other.getBillingAmount() &&
            ((this.billingDate==null && other.getBillingDate()==null) || 
             (this.billingDate!=null &&
              this.billingDate.equals(other.getBillingDate()))) &&
            ((this.billingPeriod==null && other.getBillingPeriod()==null) || 
             (this.billingPeriod!=null &&
              this.billingPeriod.equals(other.getBillingPeriod()))) &&
            this.productId == other.getProductId() &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices()))) &&
            this.setupCharge == other.getSetupCharge() &&
            this.setupChargeActive == other.isSetupChargeActive() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subscribedDate==null && other.getSubscribedDate()==null) || 
             (this.subscribedDate!=null &&
              this.subscribedDate.equals(other.getSubscribedDate()))) &&
            this.vatEnabled == other.isVatEnabled();
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
        _hashCode += new Double(getBillingAmount()).hashCode();
        if (getBillingDate() != null) {
            _hashCode += getBillingDate().hashCode();
        }
        if (getBillingPeriod() != null) {
            _hashCode += getBillingPeriod().hashCode();
        }
        _hashCode += getProductId();
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getSetupCharge()).hashCode();
        _hashCode += (isSetupChargeActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubscribedDate() != null) {
            _hashCode += getSubscribedDate().hashCode();
        }
        _hashCode += (isVatEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subscription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "Subscription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "BillingPeriodEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("", "services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ServiceCall"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ServiceCall"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "setupCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupChargeActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "setupChargeActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubscriptionStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscribedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vatEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

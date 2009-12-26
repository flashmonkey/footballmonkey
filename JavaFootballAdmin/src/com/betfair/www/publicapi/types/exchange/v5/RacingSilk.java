/**
 * RacingSilk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class RacingSilk  implements java.io.Serializable {
    private int selectionId;

    private java.lang.String silksURL;

    private java.lang.String silksText;

    private java.lang.String trainerName;

    private java.lang.String ageWeight;

    private java.lang.String form;

    private int daysSince;

    private int jockeyClaim;

    private java.lang.String wearing;

    private int saddleCloth;

    private int stallDraw;

    public RacingSilk() {
    }

    public RacingSilk(
           int selectionId,
           java.lang.String silksURL,
           java.lang.String silksText,
           java.lang.String trainerName,
           java.lang.String ageWeight,
           java.lang.String form,
           int daysSince,
           int jockeyClaim,
           java.lang.String wearing,
           int saddleCloth,
           int stallDraw) {
           this.selectionId = selectionId;
           this.silksURL = silksURL;
           this.silksText = silksText;
           this.trainerName = trainerName;
           this.ageWeight = ageWeight;
           this.form = form;
           this.daysSince = daysSince;
           this.jockeyClaim = jockeyClaim;
           this.wearing = wearing;
           this.saddleCloth = saddleCloth;
           this.stallDraw = stallDraw;
    }


    /**
     * Gets the selectionId value for this RacingSilk.
     * 
     * @return selectionId
     */
    public int getSelectionId() {
        return selectionId;
    }


    /**
     * Sets the selectionId value for this RacingSilk.
     * 
     * @param selectionId
     */
    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }


    /**
     * Gets the silksURL value for this RacingSilk.
     * 
     * @return silksURL
     */
    public java.lang.String getSilksURL() {
        return silksURL;
    }


    /**
     * Sets the silksURL value for this RacingSilk.
     * 
     * @param silksURL
     */
    public void setSilksURL(java.lang.String silksURL) {
        this.silksURL = silksURL;
    }


    /**
     * Gets the silksText value for this RacingSilk.
     * 
     * @return silksText
     */
    public java.lang.String getSilksText() {
        return silksText;
    }


    /**
     * Sets the silksText value for this RacingSilk.
     * 
     * @param silksText
     */
    public void setSilksText(java.lang.String silksText) {
        this.silksText = silksText;
    }


    /**
     * Gets the trainerName value for this RacingSilk.
     * 
     * @return trainerName
     */
    public java.lang.String getTrainerName() {
        return trainerName;
    }


    /**
     * Sets the trainerName value for this RacingSilk.
     * 
     * @param trainerName
     */
    public void setTrainerName(java.lang.String trainerName) {
        this.trainerName = trainerName;
    }


    /**
     * Gets the ageWeight value for this RacingSilk.
     * 
     * @return ageWeight
     */
    public java.lang.String getAgeWeight() {
        return ageWeight;
    }


    /**
     * Sets the ageWeight value for this RacingSilk.
     * 
     * @param ageWeight
     */
    public void setAgeWeight(java.lang.String ageWeight) {
        this.ageWeight = ageWeight;
    }


    /**
     * Gets the form value for this RacingSilk.
     * 
     * @return form
     */
    public java.lang.String getForm() {
        return form;
    }


    /**
     * Sets the form value for this RacingSilk.
     * 
     * @param form
     */
    public void setForm(java.lang.String form) {
        this.form = form;
    }


    /**
     * Gets the daysSince value for this RacingSilk.
     * 
     * @return daysSince
     */
    public int getDaysSince() {
        return daysSince;
    }


    /**
     * Sets the daysSince value for this RacingSilk.
     * 
     * @param daysSince
     */
    public void setDaysSince(int daysSince) {
        this.daysSince = daysSince;
    }


    /**
     * Gets the jockeyClaim value for this RacingSilk.
     * 
     * @return jockeyClaim
     */
    public int getJockeyClaim() {
        return jockeyClaim;
    }


    /**
     * Sets the jockeyClaim value for this RacingSilk.
     * 
     * @param jockeyClaim
     */
    public void setJockeyClaim(int jockeyClaim) {
        this.jockeyClaim = jockeyClaim;
    }


    /**
     * Gets the wearing value for this RacingSilk.
     * 
     * @return wearing
     */
    public java.lang.String getWearing() {
        return wearing;
    }


    /**
     * Sets the wearing value for this RacingSilk.
     * 
     * @param wearing
     */
    public void setWearing(java.lang.String wearing) {
        this.wearing = wearing;
    }


    /**
     * Gets the saddleCloth value for this RacingSilk.
     * 
     * @return saddleCloth
     */
    public int getSaddleCloth() {
        return saddleCloth;
    }


    /**
     * Sets the saddleCloth value for this RacingSilk.
     * 
     * @param saddleCloth
     */
    public void setSaddleCloth(int saddleCloth) {
        this.saddleCloth = saddleCloth;
    }


    /**
     * Gets the stallDraw value for this RacingSilk.
     * 
     * @return stallDraw
     */
    public int getStallDraw() {
        return stallDraw;
    }


    /**
     * Sets the stallDraw value for this RacingSilk.
     * 
     * @param stallDraw
     */
    public void setStallDraw(int stallDraw) {
        this.stallDraw = stallDraw;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RacingSilk)) return false;
        RacingSilk other = (RacingSilk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.selectionId == other.getSelectionId() &&
            ((this.silksURL==null && other.getSilksURL()==null) || 
             (this.silksURL!=null &&
              this.silksURL.equals(other.getSilksURL()))) &&
            ((this.silksText==null && other.getSilksText()==null) || 
             (this.silksText!=null &&
              this.silksText.equals(other.getSilksText()))) &&
            ((this.trainerName==null && other.getTrainerName()==null) || 
             (this.trainerName!=null &&
              this.trainerName.equals(other.getTrainerName()))) &&
            ((this.ageWeight==null && other.getAgeWeight()==null) || 
             (this.ageWeight!=null &&
              this.ageWeight.equals(other.getAgeWeight()))) &&
            ((this.form==null && other.getForm()==null) || 
             (this.form!=null &&
              this.form.equals(other.getForm()))) &&
            this.daysSince == other.getDaysSince() &&
            this.jockeyClaim == other.getJockeyClaim() &&
            ((this.wearing==null && other.getWearing()==null) || 
             (this.wearing!=null &&
              this.wearing.equals(other.getWearing()))) &&
            this.saddleCloth == other.getSaddleCloth() &&
            this.stallDraw == other.getStallDraw();
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
        _hashCode += getSelectionId();
        if (getSilksURL() != null) {
            _hashCode += getSilksURL().hashCode();
        }
        if (getSilksText() != null) {
            _hashCode += getSilksText().hashCode();
        }
        if (getTrainerName() != null) {
            _hashCode += getTrainerName().hashCode();
        }
        if (getAgeWeight() != null) {
            _hashCode += getAgeWeight().hashCode();
        }
        if (getForm() != null) {
            _hashCode += getForm().hashCode();
        }
        _hashCode += getDaysSince();
        _hashCode += getJockeyClaim();
        if (getWearing() != null) {
            _hashCode += getWearing().hashCode();
        }
        _hashCode += getSaddleCloth();
        _hashCode += getStallDraw();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RacingSilk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "RacingSilk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("silksURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "silksURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("silksText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "silksText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trainerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ageWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("form");
        elemField.setXmlName(new javax.xml.namespace.QName("", "form"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysSince");
        elemField.setXmlName(new javax.xml.namespace.QName("", "daysSince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jockeyClaim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jockeyClaim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wearing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wearing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saddleCloth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saddleCloth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stallDraw");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stallDraw"));
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

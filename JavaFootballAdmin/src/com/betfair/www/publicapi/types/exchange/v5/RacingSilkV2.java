/**
 * RacingSilkV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class RacingSilkV2  extends com.betfair.www.publicapi.types.exchange.v5.RacingSilk  implements java.io.Serializable {
    private java.lang.String ownerName;

    private java.lang.String jockeyName;

    private java.lang.String colour;

    private java.lang.String sex;

    private java.lang.String bred;

    private int forecastPriceNumerator;

    private int forecastPriceDenominator;

    private int officialRating;

    private com.betfair.www.publicapi.types.exchange.v5.Breeding sire;

    private com.betfair.www.publicapi.types.exchange.v5.Breeding dam;

    private com.betfair.www.publicapi.types.exchange.v5.Breeding damSire;

    public RacingSilkV2() {
    }

    public RacingSilkV2(
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
           int stallDraw,
           java.lang.String ownerName,
           java.lang.String jockeyName,
           java.lang.String colour,
           java.lang.String sex,
           java.lang.String bred,
           int forecastPriceNumerator,
           int forecastPriceDenominator,
           int officialRating,
           com.betfair.www.publicapi.types.exchange.v5.Breeding sire,
           com.betfair.www.publicapi.types.exchange.v5.Breeding dam,
           com.betfair.www.publicapi.types.exchange.v5.Breeding damSire) {
        super(
            selectionId,
            silksURL,
            silksText,
            trainerName,
            ageWeight,
            form,
            daysSince,
            jockeyClaim,
            wearing,
            saddleCloth,
            stallDraw);
        this.ownerName = ownerName;
        this.jockeyName = jockeyName;
        this.colour = colour;
        this.sex = sex;
        this.bred = bred;
        this.forecastPriceNumerator = forecastPriceNumerator;
        this.forecastPriceDenominator = forecastPriceDenominator;
        this.officialRating = officialRating;
        this.sire = sire;
        this.dam = dam;
        this.damSire = damSire;
    }


    /**
     * Gets the ownerName value for this RacingSilkV2.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this RacingSilkV2.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the jockeyName value for this RacingSilkV2.
     * 
     * @return jockeyName
     */
    public java.lang.String getJockeyName() {
        return jockeyName;
    }


    /**
     * Sets the jockeyName value for this RacingSilkV2.
     * 
     * @param jockeyName
     */
    public void setJockeyName(java.lang.String jockeyName) {
        this.jockeyName = jockeyName;
    }


    /**
     * Gets the colour value for this RacingSilkV2.
     * 
     * @return colour
     */
    public java.lang.String getColour() {
        return colour;
    }


    /**
     * Sets the colour value for this RacingSilkV2.
     * 
     * @param colour
     */
    public void setColour(java.lang.String colour) {
        this.colour = colour;
    }


    /**
     * Gets the sex value for this RacingSilkV2.
     * 
     * @return sex
     */
    public java.lang.String getSex() {
        return sex;
    }


    /**
     * Sets the sex value for this RacingSilkV2.
     * 
     * @param sex
     */
    public void setSex(java.lang.String sex) {
        this.sex = sex;
    }


    /**
     * Gets the bred value for this RacingSilkV2.
     * 
     * @return bred
     */
    public java.lang.String getBred() {
        return bred;
    }


    /**
     * Sets the bred value for this RacingSilkV2.
     * 
     * @param bred
     */
    public void setBred(java.lang.String bred) {
        this.bred = bred;
    }


    /**
     * Gets the forecastPriceNumerator value for this RacingSilkV2.
     * 
     * @return forecastPriceNumerator
     */
    public int getForecastPriceNumerator() {
        return forecastPriceNumerator;
    }


    /**
     * Sets the forecastPriceNumerator value for this RacingSilkV2.
     * 
     * @param forecastPriceNumerator
     */
    public void setForecastPriceNumerator(int forecastPriceNumerator) {
        this.forecastPriceNumerator = forecastPriceNumerator;
    }


    /**
     * Gets the forecastPriceDenominator value for this RacingSilkV2.
     * 
     * @return forecastPriceDenominator
     */
    public int getForecastPriceDenominator() {
        return forecastPriceDenominator;
    }


    /**
     * Sets the forecastPriceDenominator value for this RacingSilkV2.
     * 
     * @param forecastPriceDenominator
     */
    public void setForecastPriceDenominator(int forecastPriceDenominator) {
        this.forecastPriceDenominator = forecastPriceDenominator;
    }


    /**
     * Gets the officialRating value for this RacingSilkV2.
     * 
     * @return officialRating
     */
    public int getOfficialRating() {
        return officialRating;
    }


    /**
     * Sets the officialRating value for this RacingSilkV2.
     * 
     * @param officialRating
     */
    public void setOfficialRating(int officialRating) {
        this.officialRating = officialRating;
    }


    /**
     * Gets the sire value for this RacingSilkV2.
     * 
     * @return sire
     */
    public com.betfair.www.publicapi.types.exchange.v5.Breeding getSire() {
        return sire;
    }


    /**
     * Sets the sire value for this RacingSilkV2.
     * 
     * @param sire
     */
    public void setSire(com.betfair.www.publicapi.types.exchange.v5.Breeding sire) {
        this.sire = sire;
    }


    /**
     * Gets the dam value for this RacingSilkV2.
     * 
     * @return dam
     */
    public com.betfair.www.publicapi.types.exchange.v5.Breeding getDam() {
        return dam;
    }


    /**
     * Sets the dam value for this RacingSilkV2.
     * 
     * @param dam
     */
    public void setDam(com.betfair.www.publicapi.types.exchange.v5.Breeding dam) {
        this.dam = dam;
    }


    /**
     * Gets the damSire value for this RacingSilkV2.
     * 
     * @return damSire
     */
    public com.betfair.www.publicapi.types.exchange.v5.Breeding getDamSire() {
        return damSire;
    }


    /**
     * Sets the damSire value for this RacingSilkV2.
     * 
     * @param damSire
     */
    public void setDamSire(com.betfair.www.publicapi.types.exchange.v5.Breeding damSire) {
        this.damSire = damSire;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RacingSilkV2)) return false;
        RacingSilkV2 other = (RacingSilkV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ownerName==null && other.getOwnerName()==null) || 
             (this.ownerName!=null &&
              this.ownerName.equals(other.getOwnerName()))) &&
            ((this.jockeyName==null && other.getJockeyName()==null) || 
             (this.jockeyName!=null &&
              this.jockeyName.equals(other.getJockeyName()))) &&
            ((this.colour==null && other.getColour()==null) || 
             (this.colour!=null &&
              this.colour.equals(other.getColour()))) &&
            ((this.sex==null && other.getSex()==null) || 
             (this.sex!=null &&
              this.sex.equals(other.getSex()))) &&
            ((this.bred==null && other.getBred()==null) || 
             (this.bred!=null &&
              this.bred.equals(other.getBred()))) &&
            this.forecastPriceNumerator == other.getForecastPriceNumerator() &&
            this.forecastPriceDenominator == other.getForecastPriceDenominator() &&
            this.officialRating == other.getOfficialRating() &&
            ((this.sire==null && other.getSire()==null) || 
             (this.sire!=null &&
              this.sire.equals(other.getSire()))) &&
            ((this.dam==null && other.getDam()==null) || 
             (this.dam!=null &&
              this.dam.equals(other.getDam()))) &&
            ((this.damSire==null && other.getDamSire()==null) || 
             (this.damSire!=null &&
              this.damSire.equals(other.getDamSire())));
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
        if (getOwnerName() != null) {
            _hashCode += getOwnerName().hashCode();
        }
        if (getJockeyName() != null) {
            _hashCode += getJockeyName().hashCode();
        }
        if (getColour() != null) {
            _hashCode += getColour().hashCode();
        }
        if (getSex() != null) {
            _hashCode += getSex().hashCode();
        }
        if (getBred() != null) {
            _hashCode += getBred().hashCode();
        }
        _hashCode += getForecastPriceNumerator();
        _hashCode += getForecastPriceDenominator();
        _hashCode += getOfficialRating();
        if (getSire() != null) {
            _hashCode += getSire().hashCode();
        }
        if (getDam() != null) {
            _hashCode += getDam().hashCode();
        }
        if (getDamSire() != null) {
            _hashCode += getDamSire().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RacingSilkV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "RacingSilkV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jockeyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jockeyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bred");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastPriceNumerator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forecastPriceNumerator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastPriceDenominator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forecastPriceDenominator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officialRating");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officialRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sire");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Breeding"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Breeding"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damSire");
        elemField.setXmlName(new javax.xml.namespace.QName("", "damSire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Breeding"));
        elemField.setNillable(true);
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

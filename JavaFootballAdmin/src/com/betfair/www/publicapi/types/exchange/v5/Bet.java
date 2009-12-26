/**
 * Bet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class Bet  implements java.io.Serializable {
    private int asianLineId;

    private double avgPrice;

    private long betId;

    private com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus;

    private com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType;

    private com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType;

    private com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType;

    private java.util.Calendar cancelledDate;

    private java.util.Calendar lapsedDate;

    private int marketId;

    private java.lang.String marketName;

    private java.lang.String fullMarketName;

    private com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum marketType;

    private com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum marketTypeVariant;

    private java.util.Calendar matchedDate;

    private double matchedSize;

    private com.betfair.www.publicapi.types.exchange.v5.Match[] matches;

    private java.util.Calendar placedDate;

    private double price;

    private java.lang.Double bspLiability;

    private double profitAndLoss;

    private int selectionId;

    private java.lang.String selectionName;

    private java.util.Calendar settledDate;

    private double remainingSize;

    private double requestedSize;

    private java.util.Calendar voidedDate;

    private double handicap;

    public Bet() {
    }

    public Bet(
           int asianLineId,
           double avgPrice,
           long betId,
           com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus,
           com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType,
           com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType,
           com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType,
           java.util.Calendar cancelledDate,
           java.util.Calendar lapsedDate,
           int marketId,
           java.lang.String marketName,
           java.lang.String fullMarketName,
           com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum marketType,
           com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum marketTypeVariant,
           java.util.Calendar matchedDate,
           double matchedSize,
           com.betfair.www.publicapi.types.exchange.v5.Match[] matches,
           java.util.Calendar placedDate,
           double price,
           java.lang.Double bspLiability,
           double profitAndLoss,
           int selectionId,
           java.lang.String selectionName,
           java.util.Calendar settledDate,
           double remainingSize,
           double requestedSize,
           java.util.Calendar voidedDate,
           double handicap) {
           this.asianLineId = asianLineId;
           this.avgPrice = avgPrice;
           this.betId = betId;
           this.betStatus = betStatus;
           this.betType = betType;
           this.betCategoryType = betCategoryType;
           this.betPersistenceType = betPersistenceType;
           this.cancelledDate = cancelledDate;
           this.lapsedDate = lapsedDate;
           this.marketId = marketId;
           this.marketName = marketName;
           this.fullMarketName = fullMarketName;
           this.marketType = marketType;
           this.marketTypeVariant = marketTypeVariant;
           this.matchedDate = matchedDate;
           this.matchedSize = matchedSize;
           this.matches = matches;
           this.placedDate = placedDate;
           this.price = price;
           this.bspLiability = bspLiability;
           this.profitAndLoss = profitAndLoss;
           this.selectionId = selectionId;
           this.selectionName = selectionName;
           this.settledDate = settledDate;
           this.remainingSize = remainingSize;
           this.requestedSize = requestedSize;
           this.voidedDate = voidedDate;
           this.handicap = handicap;
    }


    /**
     * Gets the asianLineId value for this Bet.
     * 
     * @return asianLineId
     */
    public int getAsianLineId() {
        return asianLineId;
    }


    /**
     * Sets the asianLineId value for this Bet.
     * 
     * @param asianLineId
     */
    public void setAsianLineId(int asianLineId) {
        this.asianLineId = asianLineId;
    }


    /**
     * Gets the avgPrice value for this Bet.
     * 
     * @return avgPrice
     */
    public double getAvgPrice() {
        return avgPrice;
    }


    /**
     * Sets the avgPrice value for this Bet.
     * 
     * @param avgPrice
     */
    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }


    /**
     * Gets the betId value for this Bet.
     * 
     * @return betId
     */
    public long getBetId() {
        return betId;
    }


    /**
     * Sets the betId value for this Bet.
     * 
     * @param betId
     */
    public void setBetId(long betId) {
        this.betId = betId;
    }


    /**
     * Gets the betStatus value for this Bet.
     * 
     * @return betStatus
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum getBetStatus() {
        return betStatus;
    }


    /**
     * Sets the betStatus value for this Bet.
     * 
     * @param betStatus
     */
    public void setBetStatus(com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus) {
        this.betStatus = betStatus;
    }


    /**
     * Gets the betType value for this Bet.
     * 
     * @return betType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum getBetType() {
        return betType;
    }


    /**
     * Sets the betType value for this Bet.
     * 
     * @param betType
     */
    public void setBetType(com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType) {
        this.betType = betType;
    }


    /**
     * Gets the betCategoryType value for this Bet.
     * 
     * @return betCategoryType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum getBetCategoryType() {
        return betCategoryType;
    }


    /**
     * Sets the betCategoryType value for this Bet.
     * 
     * @param betCategoryType
     */
    public void setBetCategoryType(com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType) {
        this.betCategoryType = betCategoryType;
    }


    /**
     * Gets the betPersistenceType value for this Bet.
     * 
     * @return betPersistenceType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum getBetPersistenceType() {
        return betPersistenceType;
    }


    /**
     * Sets the betPersistenceType value for this Bet.
     * 
     * @param betPersistenceType
     */
    public void setBetPersistenceType(com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType) {
        this.betPersistenceType = betPersistenceType;
    }


    /**
     * Gets the cancelledDate value for this Bet.
     * 
     * @return cancelledDate
     */
    public java.util.Calendar getCancelledDate() {
        return cancelledDate;
    }


    /**
     * Sets the cancelledDate value for this Bet.
     * 
     * @param cancelledDate
     */
    public void setCancelledDate(java.util.Calendar cancelledDate) {
        this.cancelledDate = cancelledDate;
    }


    /**
     * Gets the lapsedDate value for this Bet.
     * 
     * @return lapsedDate
     */
    public java.util.Calendar getLapsedDate() {
        return lapsedDate;
    }


    /**
     * Sets the lapsedDate value for this Bet.
     * 
     * @param lapsedDate
     */
    public void setLapsedDate(java.util.Calendar lapsedDate) {
        this.lapsedDate = lapsedDate;
    }


    /**
     * Gets the marketId value for this Bet.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this Bet.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the marketName value for this Bet.
     * 
     * @return marketName
     */
    public java.lang.String getMarketName() {
        return marketName;
    }


    /**
     * Sets the marketName value for this Bet.
     * 
     * @param marketName
     */
    public void setMarketName(java.lang.String marketName) {
        this.marketName = marketName;
    }


    /**
     * Gets the fullMarketName value for this Bet.
     * 
     * @return fullMarketName
     */
    public java.lang.String getFullMarketName() {
        return fullMarketName;
    }


    /**
     * Sets the fullMarketName value for this Bet.
     * 
     * @param fullMarketName
     */
    public void setFullMarketName(java.lang.String fullMarketName) {
        this.fullMarketName = fullMarketName;
    }


    /**
     * Gets the marketType value for this Bet.
     * 
     * @return marketType
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum getMarketType() {
        return marketType;
    }


    /**
     * Sets the marketType value for this Bet.
     * 
     * @param marketType
     */
    public void setMarketType(com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum marketType) {
        this.marketType = marketType;
    }


    /**
     * Gets the marketTypeVariant value for this Bet.
     * 
     * @return marketTypeVariant
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum getMarketTypeVariant() {
        return marketTypeVariant;
    }


    /**
     * Sets the marketTypeVariant value for this Bet.
     * 
     * @param marketTypeVariant
     */
    public void setMarketTypeVariant(com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum marketTypeVariant) {
        this.marketTypeVariant = marketTypeVariant;
    }


    /**
     * Gets the matchedDate value for this Bet.
     * 
     * @return matchedDate
     */
    public java.util.Calendar getMatchedDate() {
        return matchedDate;
    }


    /**
     * Sets the matchedDate value for this Bet.
     * 
     * @param matchedDate
     */
    public void setMatchedDate(java.util.Calendar matchedDate) {
        this.matchedDate = matchedDate;
    }


    /**
     * Gets the matchedSize value for this Bet.
     * 
     * @return matchedSize
     */
    public double getMatchedSize() {
        return matchedSize;
    }


    /**
     * Sets the matchedSize value for this Bet.
     * 
     * @param matchedSize
     */
    public void setMatchedSize(double matchedSize) {
        this.matchedSize = matchedSize;
    }


    /**
     * Gets the matches value for this Bet.
     * 
     * @return matches
     */
    public com.betfair.www.publicapi.types.exchange.v5.Match[] getMatches() {
        return matches;
    }


    /**
     * Sets the matches value for this Bet.
     * 
     * @param matches
     */
    public void setMatches(com.betfair.www.publicapi.types.exchange.v5.Match[] matches) {
        this.matches = matches;
    }


    /**
     * Gets the placedDate value for this Bet.
     * 
     * @return placedDate
     */
    public java.util.Calendar getPlacedDate() {
        return placedDate;
    }


    /**
     * Sets the placedDate value for this Bet.
     * 
     * @param placedDate
     */
    public void setPlacedDate(java.util.Calendar placedDate) {
        this.placedDate = placedDate;
    }


    /**
     * Gets the price value for this Bet.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Bet.
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Gets the bspLiability value for this Bet.
     * 
     * @return bspLiability
     */
    public java.lang.Double getBspLiability() {
        return bspLiability;
    }


    /**
     * Sets the bspLiability value for this Bet.
     * 
     * @param bspLiability
     */
    public void setBspLiability(java.lang.Double bspLiability) {
        this.bspLiability = bspLiability;
    }


    /**
     * Gets the profitAndLoss value for this Bet.
     * 
     * @return profitAndLoss
     */
    public double getProfitAndLoss() {
        return profitAndLoss;
    }


    /**
     * Sets the profitAndLoss value for this Bet.
     * 
     * @param profitAndLoss
     */
    public void setProfitAndLoss(double profitAndLoss) {
        this.profitAndLoss = profitAndLoss;
    }


    /**
     * Gets the selectionId value for this Bet.
     * 
     * @return selectionId
     */
    public int getSelectionId() {
        return selectionId;
    }


    /**
     * Sets the selectionId value for this Bet.
     * 
     * @param selectionId
     */
    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }


    /**
     * Gets the selectionName value for this Bet.
     * 
     * @return selectionName
     */
    public java.lang.String getSelectionName() {
        return selectionName;
    }


    /**
     * Sets the selectionName value for this Bet.
     * 
     * @param selectionName
     */
    public void setSelectionName(java.lang.String selectionName) {
        this.selectionName = selectionName;
    }


    /**
     * Gets the settledDate value for this Bet.
     * 
     * @return settledDate
     */
    public java.util.Calendar getSettledDate() {
        return settledDate;
    }


    /**
     * Sets the settledDate value for this Bet.
     * 
     * @param settledDate
     */
    public void setSettledDate(java.util.Calendar settledDate) {
        this.settledDate = settledDate;
    }


    /**
     * Gets the remainingSize value for this Bet.
     * 
     * @return remainingSize
     */
    public double getRemainingSize() {
        return remainingSize;
    }


    /**
     * Sets the remainingSize value for this Bet.
     * 
     * @param remainingSize
     */
    public void setRemainingSize(double remainingSize) {
        this.remainingSize = remainingSize;
    }


    /**
     * Gets the requestedSize value for this Bet.
     * 
     * @return requestedSize
     */
    public double getRequestedSize() {
        return requestedSize;
    }


    /**
     * Sets the requestedSize value for this Bet.
     * 
     * @param requestedSize
     */
    public void setRequestedSize(double requestedSize) {
        this.requestedSize = requestedSize;
    }


    /**
     * Gets the voidedDate value for this Bet.
     * 
     * @return voidedDate
     */
    public java.util.Calendar getVoidedDate() {
        return voidedDate;
    }


    /**
     * Sets the voidedDate value for this Bet.
     * 
     * @param voidedDate
     */
    public void setVoidedDate(java.util.Calendar voidedDate) {
        this.voidedDate = voidedDate;
    }


    /**
     * Gets the handicap value for this Bet.
     * 
     * @return handicap
     */
    public double getHandicap() {
        return handicap;
    }


    /**
     * Sets the handicap value for this Bet.
     * 
     * @param handicap
     */
    public void setHandicap(double handicap) {
        this.handicap = handicap;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bet)) return false;
        Bet other = (Bet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.asianLineId == other.getAsianLineId() &&
            this.avgPrice == other.getAvgPrice() &&
            this.betId == other.getBetId() &&
            ((this.betStatus==null && other.getBetStatus()==null) || 
             (this.betStatus!=null &&
              this.betStatus.equals(other.getBetStatus()))) &&
            ((this.betType==null && other.getBetType()==null) || 
             (this.betType!=null &&
              this.betType.equals(other.getBetType()))) &&
            ((this.betCategoryType==null && other.getBetCategoryType()==null) || 
             (this.betCategoryType!=null &&
              this.betCategoryType.equals(other.getBetCategoryType()))) &&
            ((this.betPersistenceType==null && other.getBetPersistenceType()==null) || 
             (this.betPersistenceType!=null &&
              this.betPersistenceType.equals(other.getBetPersistenceType()))) &&
            ((this.cancelledDate==null && other.getCancelledDate()==null) || 
             (this.cancelledDate!=null &&
              this.cancelledDate.equals(other.getCancelledDate()))) &&
            ((this.lapsedDate==null && other.getLapsedDate()==null) || 
             (this.lapsedDate!=null &&
              this.lapsedDate.equals(other.getLapsedDate()))) &&
            this.marketId == other.getMarketId() &&
            ((this.marketName==null && other.getMarketName()==null) || 
             (this.marketName!=null &&
              this.marketName.equals(other.getMarketName()))) &&
            ((this.fullMarketName==null && other.getFullMarketName()==null) || 
             (this.fullMarketName!=null &&
              this.fullMarketName.equals(other.getFullMarketName()))) &&
            ((this.marketType==null && other.getMarketType()==null) || 
             (this.marketType!=null &&
              this.marketType.equals(other.getMarketType()))) &&
            ((this.marketTypeVariant==null && other.getMarketTypeVariant()==null) || 
             (this.marketTypeVariant!=null &&
              this.marketTypeVariant.equals(other.getMarketTypeVariant()))) &&
            ((this.matchedDate==null && other.getMatchedDate()==null) || 
             (this.matchedDate!=null &&
              this.matchedDate.equals(other.getMatchedDate()))) &&
            this.matchedSize == other.getMatchedSize() &&
            ((this.matches==null && other.getMatches()==null) || 
             (this.matches!=null &&
              java.util.Arrays.equals(this.matches, other.getMatches()))) &&
            ((this.placedDate==null && other.getPlacedDate()==null) || 
             (this.placedDate!=null &&
              this.placedDate.equals(other.getPlacedDate()))) &&
            this.price == other.getPrice() &&
            ((this.bspLiability==null && other.getBspLiability()==null) || 
             (this.bspLiability!=null &&
              this.bspLiability.equals(other.getBspLiability()))) &&
            this.profitAndLoss == other.getProfitAndLoss() &&
            this.selectionId == other.getSelectionId() &&
            ((this.selectionName==null && other.getSelectionName()==null) || 
             (this.selectionName!=null &&
              this.selectionName.equals(other.getSelectionName()))) &&
            ((this.settledDate==null && other.getSettledDate()==null) || 
             (this.settledDate!=null &&
              this.settledDate.equals(other.getSettledDate()))) &&
            this.remainingSize == other.getRemainingSize() &&
            this.requestedSize == other.getRequestedSize() &&
            ((this.voidedDate==null && other.getVoidedDate()==null) || 
             (this.voidedDate!=null &&
              this.voidedDate.equals(other.getVoidedDate()))) &&
            this.handicap == other.getHandicap();
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
        _hashCode += getAsianLineId();
        _hashCode += new Double(getAvgPrice()).hashCode();
        _hashCode += new Long(getBetId()).hashCode();
        if (getBetStatus() != null) {
            _hashCode += getBetStatus().hashCode();
        }
        if (getBetType() != null) {
            _hashCode += getBetType().hashCode();
        }
        if (getBetCategoryType() != null) {
            _hashCode += getBetCategoryType().hashCode();
        }
        if (getBetPersistenceType() != null) {
            _hashCode += getBetPersistenceType().hashCode();
        }
        if (getCancelledDate() != null) {
            _hashCode += getCancelledDate().hashCode();
        }
        if (getLapsedDate() != null) {
            _hashCode += getLapsedDate().hashCode();
        }
        _hashCode += getMarketId();
        if (getMarketName() != null) {
            _hashCode += getMarketName().hashCode();
        }
        if (getFullMarketName() != null) {
            _hashCode += getFullMarketName().hashCode();
        }
        if (getMarketType() != null) {
            _hashCode += getMarketType().hashCode();
        }
        if (getMarketTypeVariant() != null) {
            _hashCode += getMarketTypeVariant().hashCode();
        }
        if (getMatchedDate() != null) {
            _hashCode += getMatchedDate().hashCode();
        }
        _hashCode += new Double(getMatchedSize()).hashCode();
        if (getMatches() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatches());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatches(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlacedDate() != null) {
            _hashCode += getPlacedDate().hashCode();
        }
        _hashCode += new Double(getPrice()).hashCode();
        if (getBspLiability() != null) {
            _hashCode += getBspLiability().hashCode();
        }
        _hashCode += new Double(getProfitAndLoss()).hashCode();
        _hashCode += getSelectionId();
        if (getSelectionName() != null) {
            _hashCode += getSelectionName().hashCode();
        }
        if (getSettledDate() != null) {
            _hashCode += getSettledDate().hashCode();
        }
        _hashCode += new Double(getRemainingSize()).hashCode();
        _hashCode += new Double(getRequestedSize()).hashCode();
        if (getVoidedDate() != null) {
            _hashCode += getVoidedDate().hashCode();
        }
        _hashCode += new Double(getHandicap()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Bet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asianLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asianLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avgPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avgPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betCategoryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betCategoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetCategoryTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betPersistenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betPersistenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetPersistenceTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelledDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lapsedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lapsedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullMarketName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullMarketName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketTypeVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketTypeVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketTypeVariantEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchedSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchedSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matches");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matches"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Match"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Match"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bspLiability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bspLiability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitAndLoss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profitAndLoss"));
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
        elemField.setFieldName("settledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "settledDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainingSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestedSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voidedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voidedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handicap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "handicap"));
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

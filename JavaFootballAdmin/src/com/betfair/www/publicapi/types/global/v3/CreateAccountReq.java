/**
 * CreateAccountReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class CreateAccountReq  extends com.betfair.www.publicapi.types.global.v3.APIRequest  implements java.io.Serializable {
    private int acceptedPrivicyPolicyVersion;

    private int acceptedTermsAndConditionsVersion;

    private com.betfair.www.publicapi.types.global.v3.AccountTypeEnum accountType;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String address3;

    private java.lang.String answer1;

    private java.lang.String answer2;

    private java.lang.String browser;

    private java.lang.String countryOfResidence;

    private java.lang.String countyState;

    private java.lang.String currency;

    private java.util.Calendar dateOfBirth;

    private double depositLimit;

    private com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum depositLimitFrequency;

    private java.lang.String emailAddress;

    private java.lang.String firstName;

    private com.betfair.www.publicapi.types.global.v3.GenderEnum gender;

    private java.lang.String homeTelephone;

    private boolean informProductsServices;

    private boolean informSpecialOffers;

    private java.lang.String ipAddress;

    private java.lang.String locale;

    private double lossLimit;

    private com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum lossLimitFrequency;

    private boolean manualAddress;

    private java.lang.String mobileTelephone;

    private int partnerId;

    private java.lang.String password;

    private java.lang.String postCode;

    private java.lang.String preferredName;

    private int productId;

    private com.betfair.www.publicapi.types.global.v3.SecurityQuestion1Enum question1;

    private com.betfair.www.publicapi.types.global.v3.SecurityQuestion2Enum question2;

    private java.lang.String referrerCode;

    private com.betfair.www.publicapi.types.global.v3.RegionEnum region;

    private int subPartnerId;

    private int superPartnerId;

    private java.lang.String surname;

    private java.lang.String timeZone;

    private com.betfair.www.publicapi.types.global.v3.TitleEnum title;

    private java.lang.String townCity;

    private java.lang.String username;

    private java.lang.String workTelephone;

    public CreateAccountReq() {
    }

    public CreateAccountReq(
           com.betfair.www.publicapi.types.global.v3.APIRequestHeader header,
           int acceptedPrivicyPolicyVersion,
           int acceptedTermsAndConditionsVersion,
           com.betfair.www.publicapi.types.global.v3.AccountTypeEnum accountType,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String address3,
           java.lang.String answer1,
           java.lang.String answer2,
           java.lang.String browser,
           java.lang.String countryOfResidence,
           java.lang.String countyState,
           java.lang.String currency,
           java.util.Calendar dateOfBirth,
           double depositLimit,
           com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum depositLimitFrequency,
           java.lang.String emailAddress,
           java.lang.String firstName,
           com.betfair.www.publicapi.types.global.v3.GenderEnum gender,
           java.lang.String homeTelephone,
           boolean informProductsServices,
           boolean informSpecialOffers,
           java.lang.String ipAddress,
           java.lang.String locale,
           double lossLimit,
           com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum lossLimitFrequency,
           boolean manualAddress,
           java.lang.String mobileTelephone,
           int partnerId,
           java.lang.String password,
           java.lang.String postCode,
           java.lang.String preferredName,
           int productId,
           com.betfair.www.publicapi.types.global.v3.SecurityQuestion1Enum question1,
           com.betfair.www.publicapi.types.global.v3.SecurityQuestion2Enum question2,
           java.lang.String referrerCode,
           com.betfair.www.publicapi.types.global.v3.RegionEnum region,
           int subPartnerId,
           int superPartnerId,
           java.lang.String surname,
           java.lang.String timeZone,
           com.betfair.www.publicapi.types.global.v3.TitleEnum title,
           java.lang.String townCity,
           java.lang.String username,
           java.lang.String workTelephone) {
        super(
            header);
        this.acceptedPrivicyPolicyVersion = acceptedPrivicyPolicyVersion;
        this.acceptedTermsAndConditionsVersion = acceptedTermsAndConditionsVersion;
        this.accountType = accountType;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.browser = browser;
        this.countryOfResidence = countryOfResidence;
        this.countyState = countyState;
        this.currency = currency;
        this.dateOfBirth = dateOfBirth;
        this.depositLimit = depositLimit;
        this.depositLimitFrequency = depositLimitFrequency;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.gender = gender;
        this.homeTelephone = homeTelephone;
        this.informProductsServices = informProductsServices;
        this.informSpecialOffers = informSpecialOffers;
        this.ipAddress = ipAddress;
        this.locale = locale;
        this.lossLimit = lossLimit;
        this.lossLimitFrequency = lossLimitFrequency;
        this.manualAddress = manualAddress;
        this.mobileTelephone = mobileTelephone;
        this.partnerId = partnerId;
        this.password = password;
        this.postCode = postCode;
        this.preferredName = preferredName;
        this.productId = productId;
        this.question1 = question1;
        this.question2 = question2;
        this.referrerCode = referrerCode;
        this.region = region;
        this.subPartnerId = subPartnerId;
        this.superPartnerId = superPartnerId;
        this.surname = surname;
        this.timeZone = timeZone;
        this.title = title;
        this.townCity = townCity;
        this.username = username;
        this.workTelephone = workTelephone;
    }


    /**
     * Gets the acceptedPrivicyPolicyVersion value for this CreateAccountReq.
     * 
     * @return acceptedPrivicyPolicyVersion
     */
    public int getAcceptedPrivicyPolicyVersion() {
        return acceptedPrivicyPolicyVersion;
    }


    /**
     * Sets the acceptedPrivicyPolicyVersion value for this CreateAccountReq.
     * 
     * @param acceptedPrivicyPolicyVersion
     */
    public void setAcceptedPrivicyPolicyVersion(int acceptedPrivicyPolicyVersion) {
        this.acceptedPrivicyPolicyVersion = acceptedPrivicyPolicyVersion;
    }


    /**
     * Gets the acceptedTermsAndConditionsVersion value for this CreateAccountReq.
     * 
     * @return acceptedTermsAndConditionsVersion
     */
    public int getAcceptedTermsAndConditionsVersion() {
        return acceptedTermsAndConditionsVersion;
    }


    /**
     * Sets the acceptedTermsAndConditionsVersion value for this CreateAccountReq.
     * 
     * @param acceptedTermsAndConditionsVersion
     */
    public void setAcceptedTermsAndConditionsVersion(int acceptedTermsAndConditionsVersion) {
        this.acceptedTermsAndConditionsVersion = acceptedTermsAndConditionsVersion;
    }


    /**
     * Gets the accountType value for this CreateAccountReq.
     * 
     * @return accountType
     */
    public com.betfair.www.publicapi.types.global.v3.AccountTypeEnum getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this CreateAccountReq.
     * 
     * @param accountType
     */
    public void setAccountType(com.betfair.www.publicapi.types.global.v3.AccountTypeEnum accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the address1 value for this CreateAccountReq.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this CreateAccountReq.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this CreateAccountReq.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this CreateAccountReq.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the address3 value for this CreateAccountReq.
     * 
     * @return address3
     */
    public java.lang.String getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this CreateAccountReq.
     * 
     * @param address3
     */
    public void setAddress3(java.lang.String address3) {
        this.address3 = address3;
    }


    /**
     * Gets the answer1 value for this CreateAccountReq.
     * 
     * @return answer1
     */
    public java.lang.String getAnswer1() {
        return answer1;
    }


    /**
     * Sets the answer1 value for this CreateAccountReq.
     * 
     * @param answer1
     */
    public void setAnswer1(java.lang.String answer1) {
        this.answer1 = answer1;
    }


    /**
     * Gets the answer2 value for this CreateAccountReq.
     * 
     * @return answer2
     */
    public java.lang.String getAnswer2() {
        return answer2;
    }


    /**
     * Sets the answer2 value for this CreateAccountReq.
     * 
     * @param answer2
     */
    public void setAnswer2(java.lang.String answer2) {
        this.answer2 = answer2;
    }


    /**
     * Gets the browser value for this CreateAccountReq.
     * 
     * @return browser
     */
    public java.lang.String getBrowser() {
        return browser;
    }


    /**
     * Sets the browser value for this CreateAccountReq.
     * 
     * @param browser
     */
    public void setBrowser(java.lang.String browser) {
        this.browser = browser;
    }


    /**
     * Gets the countryOfResidence value for this CreateAccountReq.
     * 
     * @return countryOfResidence
     */
    public java.lang.String getCountryOfResidence() {
        return countryOfResidence;
    }


    /**
     * Sets the countryOfResidence value for this CreateAccountReq.
     * 
     * @param countryOfResidence
     */
    public void setCountryOfResidence(java.lang.String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }


    /**
     * Gets the countyState value for this CreateAccountReq.
     * 
     * @return countyState
     */
    public java.lang.String getCountyState() {
        return countyState;
    }


    /**
     * Sets the countyState value for this CreateAccountReq.
     * 
     * @param countyState
     */
    public void setCountyState(java.lang.String countyState) {
        this.countyState = countyState;
    }


    /**
     * Gets the currency value for this CreateAccountReq.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CreateAccountReq.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the dateOfBirth value for this CreateAccountReq.
     * 
     * @return dateOfBirth
     */
    public java.util.Calendar getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this CreateAccountReq.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the depositLimit value for this CreateAccountReq.
     * 
     * @return depositLimit
     */
    public double getDepositLimit() {
        return depositLimit;
    }


    /**
     * Sets the depositLimit value for this CreateAccountReq.
     * 
     * @param depositLimit
     */
    public void setDepositLimit(double depositLimit) {
        this.depositLimit = depositLimit;
    }


    /**
     * Gets the depositLimitFrequency value for this CreateAccountReq.
     * 
     * @return depositLimitFrequency
     */
    public com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum getDepositLimitFrequency() {
        return depositLimitFrequency;
    }


    /**
     * Sets the depositLimitFrequency value for this CreateAccountReq.
     * 
     * @param depositLimitFrequency
     */
    public void setDepositLimitFrequency(com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum depositLimitFrequency) {
        this.depositLimitFrequency = depositLimitFrequency;
    }


    /**
     * Gets the emailAddress value for this CreateAccountReq.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this CreateAccountReq.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the firstName value for this CreateAccountReq.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this CreateAccountReq.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the gender value for this CreateAccountReq.
     * 
     * @return gender
     */
    public com.betfair.www.publicapi.types.global.v3.GenderEnum getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this CreateAccountReq.
     * 
     * @param gender
     */
    public void setGender(com.betfair.www.publicapi.types.global.v3.GenderEnum gender) {
        this.gender = gender;
    }


    /**
     * Gets the homeTelephone value for this CreateAccountReq.
     * 
     * @return homeTelephone
     */
    public java.lang.String getHomeTelephone() {
        return homeTelephone;
    }


    /**
     * Sets the homeTelephone value for this CreateAccountReq.
     * 
     * @param homeTelephone
     */
    public void setHomeTelephone(java.lang.String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }


    /**
     * Gets the informProductsServices value for this CreateAccountReq.
     * 
     * @return informProductsServices
     */
    public boolean isInformProductsServices() {
        return informProductsServices;
    }


    /**
     * Sets the informProductsServices value for this CreateAccountReq.
     * 
     * @param informProductsServices
     */
    public void setInformProductsServices(boolean informProductsServices) {
        this.informProductsServices = informProductsServices;
    }


    /**
     * Gets the informSpecialOffers value for this CreateAccountReq.
     * 
     * @return informSpecialOffers
     */
    public boolean isInformSpecialOffers() {
        return informSpecialOffers;
    }


    /**
     * Sets the informSpecialOffers value for this CreateAccountReq.
     * 
     * @param informSpecialOffers
     */
    public void setInformSpecialOffers(boolean informSpecialOffers) {
        this.informSpecialOffers = informSpecialOffers;
    }


    /**
     * Gets the ipAddress value for this CreateAccountReq.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this CreateAccountReq.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the locale value for this CreateAccountReq.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this CreateAccountReq.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the lossLimit value for this CreateAccountReq.
     * 
     * @return lossLimit
     */
    public double getLossLimit() {
        return lossLimit;
    }


    /**
     * Sets the lossLimit value for this CreateAccountReq.
     * 
     * @param lossLimit
     */
    public void setLossLimit(double lossLimit) {
        this.lossLimit = lossLimit;
    }


    /**
     * Gets the lossLimitFrequency value for this CreateAccountReq.
     * 
     * @return lossLimitFrequency
     */
    public com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum getLossLimitFrequency() {
        return lossLimitFrequency;
    }


    /**
     * Sets the lossLimitFrequency value for this CreateAccountReq.
     * 
     * @param lossLimitFrequency
     */
    public void setLossLimitFrequency(com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum lossLimitFrequency) {
        this.lossLimitFrequency = lossLimitFrequency;
    }


    /**
     * Gets the manualAddress value for this CreateAccountReq.
     * 
     * @return manualAddress
     */
    public boolean isManualAddress() {
        return manualAddress;
    }


    /**
     * Sets the manualAddress value for this CreateAccountReq.
     * 
     * @param manualAddress
     */
    public void setManualAddress(boolean manualAddress) {
        this.manualAddress = manualAddress;
    }


    /**
     * Gets the mobileTelephone value for this CreateAccountReq.
     * 
     * @return mobileTelephone
     */
    public java.lang.String getMobileTelephone() {
        return mobileTelephone;
    }


    /**
     * Sets the mobileTelephone value for this CreateAccountReq.
     * 
     * @param mobileTelephone
     */
    public void setMobileTelephone(java.lang.String mobileTelephone) {
        this.mobileTelephone = mobileTelephone;
    }


    /**
     * Gets the partnerId value for this CreateAccountReq.
     * 
     * @return partnerId
     */
    public int getPartnerId() {
        return partnerId;
    }


    /**
     * Sets the partnerId value for this CreateAccountReq.
     * 
     * @param partnerId
     */
    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }


    /**
     * Gets the password value for this CreateAccountReq.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this CreateAccountReq.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the postCode value for this CreateAccountReq.
     * 
     * @return postCode
     */
    public java.lang.String getPostCode() {
        return postCode;
    }


    /**
     * Sets the postCode value for this CreateAccountReq.
     * 
     * @param postCode
     */
    public void setPostCode(java.lang.String postCode) {
        this.postCode = postCode;
    }


    /**
     * Gets the preferredName value for this CreateAccountReq.
     * 
     * @return preferredName
     */
    public java.lang.String getPreferredName() {
        return preferredName;
    }


    /**
     * Sets the preferredName value for this CreateAccountReq.
     * 
     * @param preferredName
     */
    public void setPreferredName(java.lang.String preferredName) {
        this.preferredName = preferredName;
    }


    /**
     * Gets the productId value for this CreateAccountReq.
     * 
     * @return productId
     */
    public int getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this CreateAccountReq.
     * 
     * @param productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }


    /**
     * Gets the question1 value for this CreateAccountReq.
     * 
     * @return question1
     */
    public com.betfair.www.publicapi.types.global.v3.SecurityQuestion1Enum getQuestion1() {
        return question1;
    }


    /**
     * Sets the question1 value for this CreateAccountReq.
     * 
     * @param question1
     */
    public void setQuestion1(com.betfair.www.publicapi.types.global.v3.SecurityQuestion1Enum question1) {
        this.question1 = question1;
    }


    /**
     * Gets the question2 value for this CreateAccountReq.
     * 
     * @return question2
     */
    public com.betfair.www.publicapi.types.global.v3.SecurityQuestion2Enum getQuestion2() {
        return question2;
    }


    /**
     * Sets the question2 value for this CreateAccountReq.
     * 
     * @param question2
     */
    public void setQuestion2(com.betfair.www.publicapi.types.global.v3.SecurityQuestion2Enum question2) {
        this.question2 = question2;
    }


    /**
     * Gets the referrerCode value for this CreateAccountReq.
     * 
     * @return referrerCode
     */
    public java.lang.String getReferrerCode() {
        return referrerCode;
    }


    /**
     * Sets the referrerCode value for this CreateAccountReq.
     * 
     * @param referrerCode
     */
    public void setReferrerCode(java.lang.String referrerCode) {
        this.referrerCode = referrerCode;
    }


    /**
     * Gets the region value for this CreateAccountReq.
     * 
     * @return region
     */
    public com.betfair.www.publicapi.types.global.v3.RegionEnum getRegion() {
        return region;
    }


    /**
     * Sets the region value for this CreateAccountReq.
     * 
     * @param region
     */
    public void setRegion(com.betfair.www.publicapi.types.global.v3.RegionEnum region) {
        this.region = region;
    }


    /**
     * Gets the subPartnerId value for this CreateAccountReq.
     * 
     * @return subPartnerId
     */
    public int getSubPartnerId() {
        return subPartnerId;
    }


    /**
     * Sets the subPartnerId value for this CreateAccountReq.
     * 
     * @param subPartnerId
     */
    public void setSubPartnerId(int subPartnerId) {
        this.subPartnerId = subPartnerId;
    }


    /**
     * Gets the superPartnerId value for this CreateAccountReq.
     * 
     * @return superPartnerId
     */
    public int getSuperPartnerId() {
        return superPartnerId;
    }


    /**
     * Sets the superPartnerId value for this CreateAccountReq.
     * 
     * @param superPartnerId
     */
    public void setSuperPartnerId(int superPartnerId) {
        this.superPartnerId = superPartnerId;
    }


    /**
     * Gets the surname value for this CreateAccountReq.
     * 
     * @return surname
     */
    public java.lang.String getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this CreateAccountReq.
     * 
     * @param surname
     */
    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }


    /**
     * Gets the timeZone value for this CreateAccountReq.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this CreateAccountReq.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the title value for this CreateAccountReq.
     * 
     * @return title
     */
    public com.betfair.www.publicapi.types.global.v3.TitleEnum getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CreateAccountReq.
     * 
     * @param title
     */
    public void setTitle(com.betfair.www.publicapi.types.global.v3.TitleEnum title) {
        this.title = title;
    }


    /**
     * Gets the townCity value for this CreateAccountReq.
     * 
     * @return townCity
     */
    public java.lang.String getTownCity() {
        return townCity;
    }


    /**
     * Sets the townCity value for this CreateAccountReq.
     * 
     * @param townCity
     */
    public void setTownCity(java.lang.String townCity) {
        this.townCity = townCity;
    }


    /**
     * Gets the username value for this CreateAccountReq.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this CreateAccountReq.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the workTelephone value for this CreateAccountReq.
     * 
     * @return workTelephone
     */
    public java.lang.String getWorkTelephone() {
        return workTelephone;
    }


    /**
     * Sets the workTelephone value for this CreateAccountReq.
     * 
     * @param workTelephone
     */
    public void setWorkTelephone(java.lang.String workTelephone) {
        this.workTelephone = workTelephone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateAccountReq)) return false;
        CreateAccountReq other = (CreateAccountReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.acceptedPrivicyPolicyVersion == other.getAcceptedPrivicyPolicyVersion() &&
            this.acceptedTermsAndConditionsVersion == other.getAcceptedTermsAndConditionsVersion() &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              this.address3.equals(other.getAddress3()))) &&
            ((this.answer1==null && other.getAnswer1()==null) || 
             (this.answer1!=null &&
              this.answer1.equals(other.getAnswer1()))) &&
            ((this.answer2==null && other.getAnswer2()==null) || 
             (this.answer2!=null &&
              this.answer2.equals(other.getAnswer2()))) &&
            ((this.browser==null && other.getBrowser()==null) || 
             (this.browser!=null &&
              this.browser.equals(other.getBrowser()))) &&
            ((this.countryOfResidence==null && other.getCountryOfResidence()==null) || 
             (this.countryOfResidence!=null &&
              this.countryOfResidence.equals(other.getCountryOfResidence()))) &&
            ((this.countyState==null && other.getCountyState()==null) || 
             (this.countyState!=null &&
              this.countyState.equals(other.getCountyState()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            this.depositLimit == other.getDepositLimit() &&
            ((this.depositLimitFrequency==null && other.getDepositLimitFrequency()==null) || 
             (this.depositLimitFrequency!=null &&
              this.depositLimitFrequency.equals(other.getDepositLimitFrequency()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.homeTelephone==null && other.getHomeTelephone()==null) || 
             (this.homeTelephone!=null &&
              this.homeTelephone.equals(other.getHomeTelephone()))) &&
            this.informProductsServices == other.isInformProductsServices() &&
            this.informSpecialOffers == other.isInformSpecialOffers() &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            this.lossLimit == other.getLossLimit() &&
            ((this.lossLimitFrequency==null && other.getLossLimitFrequency()==null) || 
             (this.lossLimitFrequency!=null &&
              this.lossLimitFrequency.equals(other.getLossLimitFrequency()))) &&
            this.manualAddress == other.isManualAddress() &&
            ((this.mobileTelephone==null && other.getMobileTelephone()==null) || 
             (this.mobileTelephone!=null &&
              this.mobileTelephone.equals(other.getMobileTelephone()))) &&
            this.partnerId == other.getPartnerId() &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.postCode==null && other.getPostCode()==null) || 
             (this.postCode!=null &&
              this.postCode.equals(other.getPostCode()))) &&
            ((this.preferredName==null && other.getPreferredName()==null) || 
             (this.preferredName!=null &&
              this.preferredName.equals(other.getPreferredName()))) &&
            this.productId == other.getProductId() &&
            ((this.question1==null && other.getQuestion1()==null) || 
             (this.question1!=null &&
              this.question1.equals(other.getQuestion1()))) &&
            ((this.question2==null && other.getQuestion2()==null) || 
             (this.question2!=null &&
              this.question2.equals(other.getQuestion2()))) &&
            ((this.referrerCode==null && other.getReferrerCode()==null) || 
             (this.referrerCode!=null &&
              this.referrerCode.equals(other.getReferrerCode()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            this.subPartnerId == other.getSubPartnerId() &&
            this.superPartnerId == other.getSuperPartnerId() &&
            ((this.surname==null && other.getSurname()==null) || 
             (this.surname!=null &&
              this.surname.equals(other.getSurname()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.townCity==null && other.getTownCity()==null) || 
             (this.townCity!=null &&
              this.townCity.equals(other.getTownCity()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.workTelephone==null && other.getWorkTelephone()==null) || 
             (this.workTelephone!=null &&
              this.workTelephone.equals(other.getWorkTelephone())));
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
        _hashCode += getAcceptedPrivicyPolicyVersion();
        _hashCode += getAcceptedTermsAndConditionsVersion();
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getAddress3() != null) {
            _hashCode += getAddress3().hashCode();
        }
        if (getAnswer1() != null) {
            _hashCode += getAnswer1().hashCode();
        }
        if (getAnswer2() != null) {
            _hashCode += getAnswer2().hashCode();
        }
        if (getBrowser() != null) {
            _hashCode += getBrowser().hashCode();
        }
        if (getCountryOfResidence() != null) {
            _hashCode += getCountryOfResidence().hashCode();
        }
        if (getCountyState() != null) {
            _hashCode += getCountyState().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        _hashCode += new Double(getDepositLimit()).hashCode();
        if (getDepositLimitFrequency() != null) {
            _hashCode += getDepositLimitFrequency().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getHomeTelephone() != null) {
            _hashCode += getHomeTelephone().hashCode();
        }
        _hashCode += (isInformProductsServices() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInformSpecialOffers() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        _hashCode += new Double(getLossLimit()).hashCode();
        if (getLossLimitFrequency() != null) {
            _hashCode += getLossLimitFrequency().hashCode();
        }
        _hashCode += (isManualAddress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMobileTelephone() != null) {
            _hashCode += getMobileTelephone().hashCode();
        }
        _hashCode += getPartnerId();
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPostCode() != null) {
            _hashCode += getPostCode().hashCode();
        }
        if (getPreferredName() != null) {
            _hashCode += getPreferredName().hashCode();
        }
        _hashCode += getProductId();
        if (getQuestion1() != null) {
            _hashCode += getQuestion1().hashCode();
        }
        if (getQuestion2() != null) {
            _hashCode += getQuestion2().hashCode();
        }
        if (getReferrerCode() != null) {
            _hashCode += getReferrerCode().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        _hashCode += getSubPartnerId();
        _hashCode += getSuperPartnerId();
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTownCity() != null) {
            _hashCode += getTownCity().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getWorkTelephone() != null) {
            _hashCode += getWorkTelephone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateAccountReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CreateAccountReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptedPrivicyPolicyVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acceptedPrivicyPolicyVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptedTermsAndConditionsVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acceptedTermsAndConditionsVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "AccountTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "answer1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "answer2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "browser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfResidence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryOfResidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countyState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositLimitFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositLimitFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GamcareLimitFreqEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GenderEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informProductsServices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informProductsServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informSpecialOffers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informSpecialOffers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lossLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossLimitFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lossLimitFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GamcareLimitFreqEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manualAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferredName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "question1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SecurityQuestion1Enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "question2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SecurityQuestion2Enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referrerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referrerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RegionEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subPartnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subPartnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superPartnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "superPartnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "TitleEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("townCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "townCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

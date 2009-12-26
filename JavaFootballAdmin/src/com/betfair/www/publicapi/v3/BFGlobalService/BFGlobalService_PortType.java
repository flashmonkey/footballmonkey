/**
 * BFGlobalService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.v3.BFGlobalService;

public interface BFGlobalService_PortType extends java.rmi.Remote {
    public com.betfair.www.publicapi.types.global.v3.LoginResp login(com.betfair.www.publicapi.types.global.v3.LoginReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageResp retrieveLIMBMessage(com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageResp submitLIMBMessage(com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.LogoutResp logout(com.betfair.www.publicapi.types.global.v3.LogoutReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.KeepAliveResp keepAlive(com.betfair.www.publicapi.types.global.v3.KeepAliveReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.GetEventsResp getEvents(com.betfair.www.publicapi.types.global.v3.GetEventsReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.GetEventTypesResp getActiveEventTypes(com.betfair.www.publicapi.types.global.v3.GetEventTypesReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.GetEventTypesResp getAllEventTypes(com.betfair.www.publicapi.types.global.v3.GetEventTypesReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoResp getSubscriptionInfo(com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardResp depositFromPaymentCard(com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.AddPaymentCardResp addPaymentCard(com.betfair.www.publicapi.types.global.v3.AddPaymentCardReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.DeletePaymentCardResp deletePaymentCard(com.betfair.www.publicapi.types.global.v3.DeletePaymentCardReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardResp updatePaymentCard(com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.GetPaymentCardResp getPaymentCard(com.betfair.www.publicapi.types.global.v3.GetPaymentCardReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardResp withdrawToPaymentCard(com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.SelfExcludeResp selfExclude(com.betfair.www.publicapi.types.global.v3.SelfExcludeReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.ConvertCurrencyResp convertCurrency(com.betfair.www.publicapi.types.global.v3.ConvertCurrencyReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.GetCurrenciesResp getAllCurrencies(com.betfair.www.publicapi.types.global.v3.GetCurrenciesReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Resp getAllCurrenciesV2(com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Req request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnResp viewReferAndEarn(com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.ViewProfileResp viewProfile(com.betfair.www.publicapi.types.global.v3.ViewProfileReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.ViewProfileV2Resp viewProfileV2(com.betfair.www.publicapi.types.global.v3.ViewProfileV2Req request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.ModifyProfileResp modifyProfile(com.betfair.www.publicapi.types.global.v3.ModifyProfileReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.CreateAccountResp createAccount(com.betfair.www.publicapi.types.global.v3.CreateAccountReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.ForgotPasswordResp forgotPassword(com.betfair.www.publicapi.types.global.v3.ForgotPasswordReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.ModifyPasswordResp modifyPassword(com.betfair.www.publicapi.types.global.v3.ModifyPasswordReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.SetChatNameResp setChatName(com.betfair.www.publicapi.types.global.v3.SetChatNameReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.global.v3.TransferFundsResp transferFunds(com.betfair.www.publicapi.types.global.v3.TransferFundsReq request) throws java.rmi.RemoteException;
}

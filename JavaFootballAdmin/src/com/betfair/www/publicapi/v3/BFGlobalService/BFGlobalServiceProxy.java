package com.betfair.www.publicapi.v3.BFGlobalService;

public class BFGlobalServiceProxy implements com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_PortType {
  private String _endpoint = null;
  private com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_PortType bFGlobalService_PortType = null;
  
  public BFGlobalServiceProxy() {
    _initBFGlobalServiceProxy();
  }
  
  public BFGlobalServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBFGlobalServiceProxy();
  }
  
  private void _initBFGlobalServiceProxy() {
    try {
      bFGlobalService_PortType = (new com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_ServiceLocator()).getBFGlobalService();
      if (bFGlobalService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bFGlobalService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bFGlobalService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bFGlobalService_PortType != null)
      ((javax.xml.rpc.Stub)bFGlobalService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_PortType getBFGlobalService_PortType() {
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType;
  }
  
  public com.betfair.www.publicapi.types.global.v3.LoginResp login(com.betfair.www.publicapi.types.global.v3.LoginReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.login(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageResp retrieveLIMBMessage(com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.retrieveLIMBMessage(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageResp submitLIMBMessage(com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.submitLIMBMessage(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.LogoutResp logout(com.betfair.www.publicapi.types.global.v3.LogoutReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.logout(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.KeepAliveResp keepAlive(com.betfair.www.publicapi.types.global.v3.KeepAliveReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.keepAlive(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.GetEventsResp getEvents(com.betfair.www.publicapi.types.global.v3.GetEventsReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.getEvents(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.GetEventTypesResp getActiveEventTypes(com.betfair.www.publicapi.types.global.v3.GetEventTypesReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.getActiveEventTypes(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.GetEventTypesResp getAllEventTypes(com.betfair.www.publicapi.types.global.v3.GetEventTypesReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.getAllEventTypes(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoResp getSubscriptionInfo(com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.getSubscriptionInfo(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardResp depositFromPaymentCard(com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.depositFromPaymentCard(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.AddPaymentCardResp addPaymentCard(com.betfair.www.publicapi.types.global.v3.AddPaymentCardReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.addPaymentCard(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.DeletePaymentCardResp deletePaymentCard(com.betfair.www.publicapi.types.global.v3.DeletePaymentCardReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.deletePaymentCard(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardResp updatePaymentCard(com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.updatePaymentCard(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.GetPaymentCardResp getPaymentCard(com.betfair.www.publicapi.types.global.v3.GetPaymentCardReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.getPaymentCard(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardResp withdrawToPaymentCard(com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.withdrawToPaymentCard(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.SelfExcludeResp selfExclude(com.betfair.www.publicapi.types.global.v3.SelfExcludeReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.selfExclude(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.ConvertCurrencyResp convertCurrency(com.betfair.www.publicapi.types.global.v3.ConvertCurrencyReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.convertCurrency(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.GetCurrenciesResp getAllCurrencies(com.betfair.www.publicapi.types.global.v3.GetCurrenciesReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.getAllCurrencies(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Resp getAllCurrenciesV2(com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Req request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.getAllCurrenciesV2(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnResp viewReferAndEarn(com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.viewReferAndEarn(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.ViewProfileResp viewProfile(com.betfair.www.publicapi.types.global.v3.ViewProfileReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.viewProfile(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.ViewProfileV2Resp viewProfileV2(com.betfair.www.publicapi.types.global.v3.ViewProfileV2Req request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.viewProfileV2(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.ModifyProfileResp modifyProfile(com.betfair.www.publicapi.types.global.v3.ModifyProfileReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.modifyProfile(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.CreateAccountResp createAccount(com.betfair.www.publicapi.types.global.v3.CreateAccountReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.createAccount(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.ForgotPasswordResp forgotPassword(com.betfair.www.publicapi.types.global.v3.ForgotPasswordReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.forgotPassword(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.ModifyPasswordResp modifyPassword(com.betfair.www.publicapi.types.global.v3.ModifyPasswordReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.modifyPassword(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.SetChatNameResp setChatName(com.betfair.www.publicapi.types.global.v3.SetChatNameReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.setChatName(request);
  }
  
  public com.betfair.www.publicapi.types.global.v3.TransferFundsResp transferFunds(com.betfair.www.publicapi.types.global.v3.TransferFundsReq request) throws java.rmi.RemoteException{
    if (bFGlobalService_PortType == null)
      _initBFGlobalServiceProxy();
    return bFGlobalService_PortType.transferFunds(request);
  }
  
  
}
package main;

public class InformationProxy implements main.Information {
  private String _endpoint = null;
  private main.Information information = null;
  
  public InformationProxy() {
    _initInformationProxy();
  }
  
  public InformationProxy(String endpoint) {
    _endpoint = endpoint;
    _initInformationProxy();
  }
  
  private void _initInformationProxy() {
    try {
      information = (new main.InformationServiceLocator()).getInformation();
      if (information != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)information)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)information)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (information != null)
      ((javax.xml.rpc.Stub)information)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Information getInformation() {
    if (information == null)
      _initInformationProxy();
    return information;
  }
  
  public main.ItemDetails[] getOrderItems(int orderID) throws java.rmi.RemoteException{
    if (information == null)
      _initInformationProxy();
    return information.getOrderItems(orderID);
  }
  
  public main.OrderDetails getOrderDetails(int orderID) throws java.rmi.RemoteException{
    if (information == null)
      _initInformationProxy();
    return information.getOrderDetails(orderID);
  }
  
  public main.DeliveryDetails getDeliveryDetails(int orderID) throws java.rmi.RemoteException{
    if (information == null)
      _initInformationProxy();
    return information.getDeliveryDetails(orderID);
  }
  
  
}
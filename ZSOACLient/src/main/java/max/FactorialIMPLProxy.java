package max;

public class FactorialIMPLProxy implements max.FactorialIMPL {
  private String _endpoint = null;
  private max.FactorialIMPL factorialIMPL = null;
  
  public FactorialIMPLProxy() {
    _initFactorialIMPLProxy();
  }
  
  public FactorialIMPLProxy(String endpoint) {
    _endpoint = endpoint;
    _initFactorialIMPLProxy();
  }
  
  private void _initFactorialIMPLProxy() {
    try {
      factorialIMPL = (new max.FactorialIMPLServiceLocator()).getFactorialIMPL();
      if (factorialIMPL != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)factorialIMPL)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)factorialIMPL)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (factorialIMPL != null)
      ((javax.xml.rpc.Stub)factorialIMPL)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public max.FactorialIMPL getFactorialIMPL() {
    if (factorialIMPL == null)
      _initFactorialIMPLProxy();
    return factorialIMPL;
  }
  
  public java.lang.String ok(java.lang.String s) throws java.rmi.RemoteException{
    if (factorialIMPL == null)
      _initFactorialIMPLProxy();
    return factorialIMPL.ok(s);
  }
  
  public java.lang.String getFactorial(java.lang.String no) throws java.rmi.RemoteException{
    if (factorialIMPL == null)
      _initFactorialIMPLProxy();
    return factorialIMPL.getFactorial(no);
  }
  
  
}
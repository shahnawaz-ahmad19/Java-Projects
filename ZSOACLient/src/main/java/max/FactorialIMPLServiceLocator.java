/**
 * FactorialIMPLServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package max;

public class FactorialIMPLServiceLocator extends org.apache.axis.client.Service implements max.FactorialIMPLService {

    public FactorialIMPLServiceLocator() {
    }


    public FactorialIMPLServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FactorialIMPLServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FactorialIMPL
    private java.lang.String FactorialIMPL_address = "http://localhost:9494/ASOAServer/services/FactorialIMPL";

    public java.lang.String getFactorialIMPLAddress() {
        return FactorialIMPL_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FactorialIMPLWSDDServiceName = "FactorialIMPL";

    public java.lang.String getFactorialIMPLWSDDServiceName() {
        return FactorialIMPLWSDDServiceName;
    }

    public void setFactorialIMPLWSDDServiceName(java.lang.String name) {
        FactorialIMPLWSDDServiceName = name;
    }

    public max.FactorialIMPL getFactorialIMPL() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FactorialIMPL_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFactorialIMPL(endpoint);
    }

    public max.FactorialIMPL getFactorialIMPL(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            max.FactorialIMPLSoapBindingStub _stub = new max.FactorialIMPLSoapBindingStub(portAddress, this);
            _stub.setPortName(getFactorialIMPLWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFactorialIMPLEndpointAddress(java.lang.String address) {
        FactorialIMPL_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (max.FactorialIMPL.class.isAssignableFrom(serviceEndpointInterface)) {
                max.FactorialIMPLSoapBindingStub _stub = new max.FactorialIMPLSoapBindingStub(new java.net.URL(FactorialIMPL_address), this);
                _stub.setPortName(getFactorialIMPLWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FactorialIMPL".equals(inputPortName)) {
            return getFactorialIMPL();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://max", "FactorialIMPLService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://max", "FactorialIMPL"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FactorialIMPL".equals(portName)) {
            setFactorialIMPLEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}


package edu.gdin.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CommonExpressServiceService", targetNamespace = "http://service.expressservice.integration.sf.com/", wsdlLocation = "http://bsp-ois.sit.sf-express.com:9080/bsp-ois/ws/sfexpressService?wsdl")
public class CommonExpressServiceService
    extends Service
{

    private final static URL COMMONEXPRESSSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException COMMONEXPRESSSERVICESERVICE_EXCEPTION;
    private final static QName COMMONEXPRESSSERVICESERVICE_QNAME = new QName("http://service.expressservice.integration.sf.com/", "CommonExpressServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://bsp-ois.sit.sf-express.com:9080/bsp-ois/ws/sfexpressService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMMONEXPRESSSERVICESERVICE_WSDL_LOCATION = url;
        COMMONEXPRESSSERVICESERVICE_EXCEPTION = e;
    }

    public CommonExpressServiceService() {
        super(__getWsdlLocation(), COMMONEXPRESSSERVICESERVICE_QNAME);
    }

    public CommonExpressServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMMONEXPRESSSERVICESERVICE_QNAME);
    }

    public CommonExpressServiceService(URL wsdlLocation) {
        super(wsdlLocation, COMMONEXPRESSSERVICESERVICE_QNAME);
    }

    public CommonExpressServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMMONEXPRESSSERVICESERVICE_QNAME);
    }

    public CommonExpressServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CommonExpressServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns IExpressService
     */
    @WebEndpoint(name = "CommonExpressServicePort")
    public IExpressService getCommonExpressServicePort() {
        return super.getPort(new QName("http://service.expressservice.integration.sf.com/", "CommonExpressServicePort"), IExpressService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IExpressService
     */
    @WebEndpoint(name = "CommonExpressServicePort")
    public IExpressService getCommonExpressServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.expressservice.integration.sf.com/", "CommonExpressServicePort"), IExpressService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMMONEXPRESSSERVICESERVICE_EXCEPTION!= null) {
            throw COMMONEXPRESSSERVICESERVICE_EXCEPTION;
        }
        return COMMONEXPRESSSERVICESERVICE_WSDL_LOCATION;
    }

}

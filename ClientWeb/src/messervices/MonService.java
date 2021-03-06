
package messervices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MonService", targetNamespace = "http://messervices/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MonService {


    /**
     * 
     * @param nom
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "un-hello", partName = "un-hello")
    @Action(input = "http://messervices/MonService/helloRequest", output = "http://messervices/MonService/helloResponse")
    public String hello(
        @WebParam(name = "nom", partName = "nom")
        String nom);

}

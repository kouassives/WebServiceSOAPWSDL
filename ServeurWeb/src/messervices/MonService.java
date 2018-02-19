package messervices;

import javax.jws.*;
import javax.jws.soap.*;
import javax.jws.soap.SOAPBinding.*;

@WebService(name="MonService")
@SOAPBinding(style=Style.RPC,use=Use.LITERAL)
public class MonService {

    @WebMethod(operationName="hello")
    @WebResult(name="un-hello")
    public String hello(@WebParam(name="nom") String nom) {
	return "Bonjour " + nom;
    }

}

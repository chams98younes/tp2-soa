
package service;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService(
        name = "ICalculatrice",
        targetNamespace = "http://service/"
)
public interface ICalculatrice {

    @WebMethod
    double somme(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );

    @WebMethod
    double multiplication(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );

    @WebMethod
    double soustraction(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );

    @WebMethod
    double division(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );
}

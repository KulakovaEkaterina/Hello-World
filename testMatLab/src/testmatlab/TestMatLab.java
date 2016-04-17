/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmatlab;

import matlabcontrol.MatlabConnectionException;
import matlabcontrol.MatlabInvocationException;
import matlabcontrol.MatlabProxy;
import matlabcontrol.MatlabProxyFactory;

/**
 *
 * @author Ekaterina
 */
public class TestMatLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MatlabConnectionException, MatlabInvocationException {
        MatlabProxyFactory factory = new MatlabProxyFactory(); 
        MatlabProxy proxy = factory.getProxy();
        //Display 'hello world' just like when using the demo
        proxy.eval("matrix2");

        //Disconnect the proxy from MATLAB
        proxy.disconnect();
    }
    
}

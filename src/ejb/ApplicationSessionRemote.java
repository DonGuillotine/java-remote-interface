/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Remote;

/**
 *
 * @author Donald
 */
@Remote
public interface ApplicationSessionRemote {

    int add(int num1, int num2);
    
}

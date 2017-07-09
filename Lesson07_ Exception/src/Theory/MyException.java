/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

/**
 *
 * @author Zhang
 */
public class MyException extends Exception {// có thể extends class Throwable

    @Override
    public String getMessage() {
        return "Co su co xay ra....";
    }

}

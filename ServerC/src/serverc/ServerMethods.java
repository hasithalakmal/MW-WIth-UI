/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverc;

/**
 *
 * @author Massa
 */
public class ServerMethods {
    
    public float mul(float x, float y){
        return x*y;
    }
    
    public  String result(String fn, String ln, float mark){
        String result;
        if(mark>50){
            result="Pass";
        }else{
            result="Fail";
        }
        String msg = fn+" "+" "+ln+" You are "+result;
        return msg;
    }
    
}

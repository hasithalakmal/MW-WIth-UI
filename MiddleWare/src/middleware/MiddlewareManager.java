/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middleware;

/**
 *
 * @author Massa
 */
public class MiddlewareManager {

    public static void main(String[] args) {

        while (true) {
            ServerSocketConfig ssc = new ServerSocketConfig();
            ssc.runserver5(9876);
        }
    }

}

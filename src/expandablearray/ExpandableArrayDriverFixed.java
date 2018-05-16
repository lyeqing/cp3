/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expandablearray;

import java.util.ArrayList;

/**
 *
 * @author yeqin
 */
public class ExpandableArrayDriverFixed {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        ExpandableArray ea = new ExpandableArray(1);

        System.out.println("size: " + ea.size());

ArrayList<BreakyThread> aea = new ArrayList<BreakyThread>();
        
           
            for (int i = 0; i < 10; i++) {
               aea.add( new BreakyThread(ea));
                
            aea.get(i).start();
           
        }
            System.out.println("Number of active threads from the given thread: " + Thread.activeCount());
                        for (int i = 0; i < 10; i++) {
               
                
            aea.get(i).join();
           
        }
            
         
         System.out.println("Number of active threads from the given thread: " + Thread.activeCount());
        System.out.println("size: " + ea.size());
        for (int i = 0; i < ea.size(); i++) {
            System.out.print(ea.get(i) + " ");
        }
        System.out.println();

    }

}

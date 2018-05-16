/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expandablearray;

/**
 *
 * @author yeqin
 */
public class BreakyThread extends Thread{
 public  ExpandableArray ea;
    public  BreakyThread(ExpandableArray ea) {
        
        ea = ea;
       
    }
//    public synchronized  ExpandableArray addTT(ExpandableArray ea){
//         for (int i = 0; i < 10; i++)
//        {
//            ea.add(new Integer(i));
//        }
//         return ea;
//    }
    @Override
    public void run(){
        
        synchronized (ExpandableArray.class) {
            ea = new  ExpandableArray(1);
      for (int i = 0; i < 10; i++)
        {
            ea.add(new Integer(i));
        }

    }
//this.ea = addTT( this.ea);
        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Hector Felix
 */
public class Driver {
    public static void main(String[] args) {
        CircularQueue q0 = new CircularQueue(10); 
        
        q0.offer(1); 
        q0.offer(2); 
        q0.offer(3); 
        q0.offer(4); 
        q0.offer(5); 
        
        System.out.println(q0);
        
        q0.poll();
        
        System.out.println(q0);
        
        q0.poll();
        
        System.out.println(q0);
        
        q0.offer(6); 
        q0.offer(7); 
        q0.offer(8); 
        q0.offer(9); 
        q0.offer(6); 
        q0.offer(7); 
        q0.offer(8); 
        q0.offer(9); 
        
        
        
    }
}

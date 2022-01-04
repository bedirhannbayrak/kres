/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author bedirhan
 */
public class QueryMethods {
    public void addKisi(String name){
        
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        String today=(myFormat.format(cal.getTime()));
        
        String Query;
        Random random = new Random();
        
         Query="";
    }
    
    
    public void addDers(String ders){
        try{
   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
    }
    
    
    public static void main(String[] args) {
        QueryMethods queryMethod = new QueryMethods();
        
    }
    
}

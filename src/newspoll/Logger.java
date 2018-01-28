/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newspoll;

import java.util.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.logging.Level;

/**
 *
 * @author Anmol Sinha
 */
public abstract class Logger {

    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
    
    

    public static void addMessage(String s){
        FileWriter fw = null;
        try {
            String fn = "log.txt";
            fw = new FileWriter("log.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
            String time = sdf.format(cal.getTime());
            bw.write(time + " : " + s);
            bw.newLine();
            bw.close();
            
        } catch (IOException ex) {
            System.err.print(ex);
        }

    }
    

    public static void addError(String s) throws IOException {
        String fn = "addMsg.txt";
        FileWriter fw = new FileWriter("prime.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        String time = sdf.format(cal.getTime());
        bw.write(time + " | Error! " + s);
    }
}

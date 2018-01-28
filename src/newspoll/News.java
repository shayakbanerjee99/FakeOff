/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newspoll;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *Only for testing
 * @author Shayak Banerjee
 */
public class News {
    public ArrayList<String> title = new ArrayList<>();
    public ArrayList<String> link = new ArrayList<>();
    public ArrayList<JLabel> icons = new ArrayList<>();
    
    public News(){
        //headlines
        title.add("IT company opens 500 jobs for engineers; looking for freshers"
                + " with 2 years experience");
        title.add("Temple Run 2 passes 500 million installs on the Play Store");
        
        title.add("Google Clips now available in the Google Store, but deliveries "
                + "aren't expected until March");
        title.add("No, OnePlus is still not sending your clipboard data to China");
        
        //links
        link.add("http://www.fakingnews.firstpost.com/business/company-opens-500"
                + "-jobs-engineers-looking-freshers-2-years-experience-25268");
        
        link.add("http://www.androidpolice.com/2018/01/27/temple-run-2-passes-500"
                + "-million-installs-play-store/");
        
        link.add("http://www.androidpolice.com/2018/01/26/google-clips-now-"
                + "available-google-store-deliveries-arent-expected-march/");
        
        link.add("http://www.androidpolice.com/2018/01/26/no-oneplus-still-not-"
                + "sending-clipboard-data-china/");
        
        //icons
//        JLabel label1 = new JLabel();
//        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pic1.JPG")));
//        icons.add(label1);
//        
//        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pic2.JPG")));
//        icons.add(label1);
//        
//        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pic3.JPG")));
//        icons.add(label1);
//        
//        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pic4.JPG")));
//        icons.add(label1);
    }
}

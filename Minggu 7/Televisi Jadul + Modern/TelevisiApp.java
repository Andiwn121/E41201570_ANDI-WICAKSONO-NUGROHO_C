/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Televisi;

/**
 *
 * @author asus
 */
public class TelevisiApp {
    public static void main(String[] args) {
        Televisi tv = new Televisi("TV Tempoe Doeloe, 14 inches", 10);
        
        System.out.println("Pak Lukman, membeli Televisi : "+tv.getDeskripsi());
        
        String [] semuaChannels = {"RCTI", "SCTV", "INDOSIAR", "LA TV", 
                                  "METRO TV", "TRANS TV", "TPI", "TV 7",
                                  "TVRI", "TV G", "ANTV"};

        String [] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV", 
                                  "METRO TV", "TRANS TV", "TPI", "TV 7"};
        
        
        tv.getChannels();
        tv.setChannels(semuaChannels);
        tv.setChannels(channelFavorit);
        
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);    
    }
}

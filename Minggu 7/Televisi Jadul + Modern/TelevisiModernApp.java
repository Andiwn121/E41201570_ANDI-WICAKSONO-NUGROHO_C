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
public class TelevisiModernApp {
    public static void main(String[] args) {
        TelevisiModern tv = new TelevisiModern("TV Modern, 29 inches", 100);
        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR",
                                 "LA TV", "METRO TV", "TRANS TV",
                                 "TPI", "TV 7", "TVRI", "TV G", "AN TV"};

        System.out.println("Pak Lukman, membeli Televisi : " + tv.getDeskripsi());

        tv.getChannels();
        tv.setChannels(semuaChannel);

        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.TV);
        tv.playCD();
        tv.setDiscTray("The Matrix");
        tv.playCD();
    }
}

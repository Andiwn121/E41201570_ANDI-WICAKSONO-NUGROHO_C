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
public class TelevisiModern {
    private String deskripsi;
    private int jumlahChannel;
    private String[] Channels = null;
    private int channelAktif;
    private int Volume; 
    public static final int TV = 0;
    public static final int TELETEXT = 1;
    int modusTampilan = TV;
    int halamanTeletext = 100;
    String discTray = null;

    public TelevisiModern(String deskripsi, int jumlahChannel) {
        this.deskripsi = deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }        
    
    public int getJumlahChannels(){
        return jumlahChannel;
    }
    
    public String[] getChannels() {
        if (Channels == null) {
            System.out.println("Belum ada channel yang diset!");
        }
        return Channels;
    }
    public void setChannels(String[] channels) {
        if (channels.length > jumlahChannel) {
            System.out.println("Maaf Tv ini hanya dapat menyimpan " + jumlahChannel + " channel");
        } else {
            this.Channels = channels;
            System.out.println(
                    "Informasi channel berhasil diupdate!");
        }
    }

    public int getChannelAktif() {
        return channelAktif;
    }

    public void setChannelAktif(int channelAktif) {
        if (channelAktif > Channels.length) {
            System.out.println(
                    "Channel yang Anda inginkan belum diset");
            return;
        }
        this.channelAktif = channelAktif;
        System.out.println("Pindah channel ke : " + Channels[channelAktif]);
    }

    public int getVolume() {
        return Volume;

    }

    public void setVolume(int volume) {
        this.Volume = volume;
        System.out.println("Intensitas volume sekarang : " + volume);
    }
    
    public void setHalamanTeletext(int halamanTeletext) {
        this.halamanTeletext = halamanTeletext;
        System.out.println("Berpindah ke halaman teletext "
                + halamanTeletext);
    }

    public void setModusTampilan(int modusTampilan) {
        switch (modusTampilan) {
            case TV:
                System.out.println("Modus tampilan : Televisi");
                break;
            case TELETEXT:
                System.out.println("Modus tampilan : Teletext");
                break;
        }
    }

    public String getDiscTray() {
        return discTray;
    }

    public void setDiscTray(String discTray) {
        this.discTray = discTray;
    }

    public void playCD() {
        if (discTray == null) {
            System.out.println("Tidak ada CD di dalam disc tray!");
            return;
        }
        System.out.println("Memutar Film " + discTray);
    }
}

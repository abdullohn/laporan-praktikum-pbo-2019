/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class MotorEncapsulationPercobaan21841720209Abdulloh {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if (kontakOn == true){
            kecepatan +=5;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    public void kurangiKecepatan(){
        if (kontakOn == true){
            kecepatan -=5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin off! \n");
        }
    }
    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+ kecepatan+"\n");
    }
}

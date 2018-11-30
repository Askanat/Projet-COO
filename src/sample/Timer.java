package sample;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javax.swing.JButton;

public class Timer extends Thread {

    private Button button;
    public long startTime ;
    private SokobanUI ui;

    public Timer(Button button){
        this.button = button;
    }




    public void run(){

        startTime = System.currentTimeMillis();
        //System.out.println(startTime);
        while(true){
            long longtime = (System.currentTimeMillis()-startTime)/1000;
            String time = String.format("%02d:%02d:%02d", longtime/3600,longtime/60,longtime%60);
            //System.out.println(time);
            Platform.runLater(()->{
                button.setText(time);
            });


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

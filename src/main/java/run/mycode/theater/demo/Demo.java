package run.mycode.theater.demo;

import org.code.theater.Instrument;
import org.code.theater.Scene;
import org.code.theater.Theater;

public class Demo {
    public static void main(String[] args) {
        Scene demoScene = new Scene();

        double time = 60.0/128;

        int[] notes = {76,76,0,76,0,72,76,0,79,0,67};
        double[] tempo = {0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5,1,1,1};

        for(int i = 0; i < notes.length; i++){
            if(notes[i] > 0){
                demoScene.playNote(Instrument.PIZZICATO_STRINGS,notes[i]-24,tempo[i]*time);
            }
            demoScene.pause(tempo[i]*time);
        }

        


        Theater.playScenes(demoScene);
    }
}

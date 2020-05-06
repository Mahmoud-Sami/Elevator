package controller;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioController {
    private static Clip clipDoaa;
    private static Clip clipEmergency;
    private Clip clipDoor;
    
    public void playDoaa() {
        if (clipDoaa != null)
            return;
        
        try {
            URL url = getClass().getResource("../view/sounds/do3aa.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clipDoaa = AudioSystem.getClip();
            clipDoaa.open(audioIn);
            clipDoaa.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void playEmergency() {
        if (clipEmergency != null)
            return;
        
        try {
            URL url = getClass().getResource("../view/sounds/Emergency.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clipEmergency = AudioSystem.getClip();
            clipEmergency.open(audioIn);
            clipEmergency.loop(Clip.LOOP_CONTINUOUSLY);
            clipEmergency.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void playOpenDoor() {
        try {
            URL url = getClass().getResource("../view/sounds/OpenDoor.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clipDoor = AudioSystem.getClip();
            clipDoor.open(audioIn);
            clipDoor.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println(e.getMessage());
        }
    }
}

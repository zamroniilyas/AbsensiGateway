/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package absensi.component.sound;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Rony
 */

public class MySound {
    public void playSound(final String nameFile) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    AudioInputStream ais = AudioSystem.getAudioInputStream(getClass().getResource("/com/cyberhouse/component/sound/"+nameFile));

                    Clip newClip=(Clip) AudioSystem.getLine(new DataLine.Info(Clip.class, ais.getFormat()));
                    newClip.open(ais);
                    newClip.start();
                } catch (        LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
                    Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                }
                    }
                }
        );
    }
}


package Adapter_Pattern;


public class AVIPlayer implements IVedeoPlayer{

   @Override
    public void playVideo(String file) {
        System.out.println("Play file in AVIPlayer "+ file);
        }

    @Override
    public void playAudio(String file) {
        System.out.println("Play file in AVIPlayer "+ file);
        }
    
}

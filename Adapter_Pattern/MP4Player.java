
package Adapter_Pattern;

public class MP4Player implements IVedeoPlayer{

    @Override
    public void playVideo(String file) {
        System.out.println("Play the Song in MP4Player "+ file);
        }

    @Override
    public void playAudio(String file) {
        System.out.println("Play the Song in the MP4Player "+ file);
        }
    
}

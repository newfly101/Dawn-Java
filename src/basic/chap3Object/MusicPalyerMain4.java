package basic.chap3Object;

import static basic.chap3Object.MusicPlayerMain3.*;

public class MusicPalyerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        // 캡슐화
        player.on();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.showStatus();
        player.off();
    }
}

package basic.chap3Object;

public class MusicPlayerMain3 {
    //문제: 음악 플레이어 만들기
    //음악 플레이어를 만들어보자.
    //요구 사항:
    //1. 음악 플레이어를 켜고 끌 수 있어야 한다.
    //2. 음악 프레이어의 볼륨을 증가, 감소할 수 있어야 한다.
    //3. 음악 플레이어의 상태를 확인할 수 있어야 한다.
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeUp(data);

        volumeDown(data);

        showStatus(data);

        off(data);

    }
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:"+data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:"+data.volume);
    }
    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:"+data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
    //예시 출력: ```
    //음악 플레이어를 시작합니다
    //음악 플레이어 볼륨:1
    //음악 플레이어 볼륨:2
    //음악 플레이어 볼륨:1
    //음악 플레이어 상태 확인
    //음악 플레이어 ON, 볼륨:1
    //음악 플레이어를 종료합니
}

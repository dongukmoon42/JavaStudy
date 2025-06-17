package chap_07;

public class BlackBox {
    String modelName; // 모델명
    String resolution ; // 해상도
    int price ; // 가격
    String color ; // 색상
    static boolean canAutoReport = false; // 자동 신고 기능

    void autoReport () {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMenoryCard(int capacity){
        System.out.println("메모리카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB입니다.");
    }

    int getVideoFileCount(int type){
        if (type == 1){ //일반영상
            return 9;
        } else if (type == 2) {// 이벤트영상
            return 1;
        }
        return 10; //전체 영상
    }

    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다.");
        if (showDateTime){
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if (showSpeed){
            System.out.println("영상에 속도 정보가 표기됩니다.");
        }
        System.out.println("영상은" + min + "분 단위로 기록됩니다.");
    }
    void record() {
        record(true,true,5);
    }
}

import javax.swing.*;

public class OmokFrame extends JFrame implements OmokFrameInterface{
    private OmokBoardButton b;
    private int[][] plate = new int[19][19];
    private OmokBoardButton[][] OmokButtonArray = new OmokBoardButton[19][19];
    private int[] user_number = new int[2];
    private boolean p1turn=true;
    private OmokPlayerInterface p;

    public OmokFrame(int[] UN, OmokPlayerInterface player) {
        p = player;
        user_number=UN;
        p.gameStart()[0] = user_number[0];
        p.gameStart()[1] = user_number[1];
        for (int i=0;i<19;i++) {
            for (int j=0;j<19;j++) {
                plate[i][j]=0;
                OmokButtonArray[i][j] = new OmokBoardButton(this,i,j);
            }
        }

    }
    /**
     * 이 위치에 돌을 놓음
     * @param row 가로
     * @param col 세로
     */
    public void setStone(int row, int col) {
        plate[row][col] = userNumber();
    }
    /**
     * plate, OmokButtonArray 초기화 시키기
     */
    public void reset() {
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                plate[i][j] = 0;
                OmokButtonArray[i][j] = new OmokBoardButton(this, i, j);
            }
        }
    }



    /**
     * 현재 차례인 플레이어의 번호
     * @return 1은 흑돌 2는 백돌
     */
    public int userNumber() {
        if (p1turn)
            return user_number[0];
        else
            return user_number[1];
    }
}

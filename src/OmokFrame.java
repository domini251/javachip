import javax.swing.*;
import java.awt.*;

public class OmokFrame extends JFrame implements OmokFrameInterface{
    private OmokBoardButton b;
    private int[][] plate = new int[19][19];
    private OmokBoardButton[][] OmokButtonArray = new OmokBoardButton[19][19];
    private int[] user_number = new int[2];
    private boolean p1turn=true;

    public OmokFrame(int p1, int p2) {
        user_number[0] = p1;
        user_number[1] = p2;
        for (int i=0;i<19;i++) {
            for (int j=0;j<19;j++) {
                plate[i][j]=0;
                OmokButtonArray[i][j] = new OmokBoardButton(this,i,j);
            }
        }
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel board = new JPanel(new GridLayout(19,19));
        for(int i = 0; i<19; i++)
            for(int j=0; j<19; j++) {
                OmokButtonArray[i][j] = new OmokBoardButton(this, i, j);
                board.add(OmokButtonArray[i][j]);
        }
        c.add(board, BorderLayout.CENTER);
        JLabel p1n = new JLabel();
        JLabel p2n = new JLabel();
        setSize(800,900);
        setVisible(true);
        setTitle("오목 게임");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
            return 1;
        else
            return 2;
    }
}

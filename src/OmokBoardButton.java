import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class OmokBoardButton extends JButton implements OmokBoardButtonInterface{
    private ImageIcon none = new ImageIcon();
    private ImageIcon black = new ImageIcon();
    private ImageIcon white = new ImageIcon();
    private OmokRegisterInterface r;
    private OmokFrameInterface f;
    private int x;
    private int y;

    /**
     * 오목칸의 상태를 나타냄. 눌렸을 때 플레이어에 따라 맞는 색 돌을 정해줌.
     * @param frame 프래임
     * @param x_pos 이 버튼의 판 x좌표
     * @param y_pos 이 버튼의 판 y좌표
     */
    public OmokBoardButton(OmokFrameInterface frame, int x_pos, int y_pos) {
        f = frame;
        x= x_pos;
        y= y_pos;
        Image N = none.getImage();
        N = N.getScaledInstance(60,60,Image.SCALE_SMOOTH);
        none = new ImageIcon(N);
        Image B = black.getImage();
        B = B.getScaledInstance(60,60,Image.SCALE_SMOOTH);
        black = new ImageIcon(B);
        Image W = white.getImage();
        W = W.getScaledInstance(60,60,Image.SCALE_SMOOTH);
        white = new ImageIcon(W);
        setIcon(none);
        if (f.userNumber() == 1)
            setDisabledSelectedIcon(black);
        else if (f.userNumber() == 2)
            setDisabledSelectedIcon(white);
        setPreferredSize(new Dimension(60,60));
    }
    /**
     * 버튼의 상태를 바꿔줌
     * @return
     */
    public void buttonReset() {
        setEnabled(true);
    }
    /**
     * 버튼이 눌렸을때 이미지가 바뀜
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        setEnabled(false);
        f.setStone(x, y);
    }
}

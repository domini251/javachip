import java.awt.event.ActionEvent;

public interface OmokBoardButtonInterface {
    /**
     * 버튼의 상태를 바꿔줌
     * @return
     */
    public void buttonReset();
    /**
     * 버튼이 눌렸을때 이미지가 바뀌고 OmokFrame에 위치를 반환함
     * @param e
     */
    void actionPerformed(ActionEvent e);
}

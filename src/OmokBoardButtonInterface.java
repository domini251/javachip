import java.awt.event.ActionEvent;

public interface OmokBoardButtonInterface {
    /**
     * 이 위치에 어떤 돌이 있는지 확인
     * @return 돌을 놓은 사람의 고유번호를 돌려줌
     */
    public boolean exist();
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

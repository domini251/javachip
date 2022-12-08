/**
 * 오목에 들어가는 기능구현
 */
public interface OmokInterface {
	/**
	 * check - 누가 이겼는지 정해주는 함수
	 * @param plate - 19x19사이즈의 판
	 * @return 이긴사람의 돌 번호를 둘려줌 아무도 못이겼을 경우 0
	 */
	public int check(int[][] plate);
	
}

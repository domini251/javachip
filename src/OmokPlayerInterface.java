/**
 * 
 */
public interface OmokPlayerInterface {
	/**
	 * -아이디과 비밀번호를 입력받아 데이터베이스에 있는지 확인
	 * @param name 아이디
	 * @return 데이터베이스에 있는것과 일치하는지
	 */
	boolean login(String name);

	int[] gameStart();
	/**
	 * 새로운 계정을 만들어줌
	 * @param name 아이디
	 * @return 성공했는지 실패했는지 (예외처리하기)
	 */
	boolean newAccount(String name);
}

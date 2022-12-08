/**
 * 
 */
public interface OmokPlayerInterface {
	/**
	 * -아이디과 비밀번호를 입력받아 데이터베이스에 있는지 확인
	 * @param name 아이디
	 * @param password 비밀번호
	 * @return 데이터베이스에 있는것과 일치하는지
	 */
	public boolean login(String name, String password);
	/**
	 * 새로운 계정을 만들어줌
	 * @param name 아이디
	 * @param password 비밀번호
	 * @return 성공했는지 실패했는지 (예외처리하기)
	 */
	public boolean newAccount(String name, String password);
	/**
	 * 새로운 비밀번호가 대문자, 소문자, 특수문자를 포함한 9글자 이상인지 점검하기
	 * @param password 입력받은 비밀번호
	 * @return 비밀번호로 쓸수있는지 여부
	 */
	public boolean correctNewPassword(String password);
}

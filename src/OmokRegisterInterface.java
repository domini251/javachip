/**
 * 오목의 로그인, 로그아웃 구현
 * 
 */
public interface OmokRegisterInterface {
	/**
	 * 파일에서 로그인 정보를 입력받아 리스트에 저장해둠
	 */
	public void accessDatabase();
	/**
	 * 파일에 로그인 정보를 저장해둠
	 */
	public void saveDatabase();
}

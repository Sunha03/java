package jdbc.board.exam;

public interface BoardDAO {
	int insert(BoardDTO board);			//�� row ��ü�� �޾Ƽ� insert �ϰ���
	//int insert(String id, String title, String content);
	int update(String id, int boardnum);
	int delete(int boardnum);
	void select();
}

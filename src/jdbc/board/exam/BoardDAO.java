package jdbc.board.exam;

public interface BoardDAO {
	int insert(BoardDTO board);			//한 row 전체를 받아서 insert 하겠음
	//int insert(String id, String title, String content);
	int update(String id, int boardnum);
	int delete(int boardnum);
	void select();
}

package model.service;

import java.sql.SQLException;
import java.util.List;

import model.BoardDTO;
import model.CommentDTO;
import model.CustomerDTO;
import model.dao.BoardDao;
import model.dao.CommunityDAO;
import model.dao.CustomerDAO;
import model.dao.UserDAO;

public class BoardManager {
	private static BoardManager boardMan = new BoardManager();
	private BoardDao boardDao;

	private BoardManager() {
		try {
			boardDao = new BoardDao();
		} catch (Exception e) {
			e.printStackTrace();
		}			
	}
	
	public static BoardManager getInstance() {
		return boardMan;
	}
	
	public void createBoard(BoardDTO board) throws SQLException, ExistingUserException {
//		if (userDAO.existingUser(user.getUserId()) == true) {
//			throw new ExistingUserException(user.getUserId() + "는 존재하는 아이디입니다.");
//		}
		boardDao.create(board);
	}
	
	public List<BoardDTO> selectAllBoard() throws SQLException, ExistingUserException {
//		if (userDAO.existingUser(user.getUserId()) == true) {
//			throw new ExistingUserException(user.getUserId() + "는 존재하는 아이디입니다.");
//		}
		return boardDao.select();
	}
	
	public String findBoardByBoardId(int boardId) throws SQLException, ExistingUserException {
//		if (userDAO.existingUser(user.getUserId()) == true) {
//			throw new ExistingUserException(user.getUserId() + "는 존재하는 아이디입니다.");
//		}
		return boardDao.findBoardByBoardId(boardId);
	}
	
	public BoardDTO selectBoardDetailsByBoardID(int boardId) throws SQLException, ExistingUserException {
//		if (userDAO.existingUser(user.getUserId()) == true) {
//			throw new ExistingUserException(user.getUserId() + "는 존재하는 아이디입니다.");
//		}
		return boardDao.selectBoardDetailsByBoardID(boardId);
	}
	
	public List<CommentDTO> findCommentByBoardId(int boardId) throws SQLException, ExistingUserException {
		System.out.println("Manager - findcommentByBoard");
		return boardDao.findCommentByBoardId(boardId);
	}
	
	//댓글 달고 나서 update하는거
	public List<CommentDTO>  updateComment (int customerId, int boardId, String details) throws SQLException, ExistingUserException {
		System.out.println("Manager - updateComment");
		try {
			//삽입 먼저 해줘야한다
			boardDao.insertComment(customerId, boardId, details);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return boardDao.findCommentByBoardId(boardId);
	}

	//드라이버 아이디로 등록한 보드들 보여주기
	public List<BoardDTO> showMyBoardsByDriverId(int driverId){
		System.out.println("Manager - showMyBoardsByDriverId : " + driverId);
		List<BoardDTO> listBoard = boardDao.showMyBoardsByDriverId(driverId);
		
		return listBoard;
	}

}

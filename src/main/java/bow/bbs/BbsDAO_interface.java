package bow.bbs;

import java.util.*;

public interface BbsDAO_interface {

	public static final int  ls = 15;
	public static final int  ps = 5;
	
	    public int sunbunUp(int ref, int sunbun);
	    public int totalCnt();	 
		
	    
	    public List<BbsDTO> bbsList(int cp );
	    public BbsDTO bbsContent(int board_idx);
	    public int bbsWrite(BbsDTO dto);	    
	   
	   
//	    comments    
	    
	    public List<CommentDTO> commentList(int board_idx);
	    public int commentInsert(CommentDTO dto);
	    public int commentUpdate(CommentDTO dto);
	    public int commentDelete(Map<String,Integer>cmt_idx_pwd);
	    
	    
//	    NormalVersion 
	    
	    public List<BbsDTOnorm> bbsList_normal(int cp );
	    public BbsDTOnorm bbsContent_normal(int board_idx);
	    public int bbsWrite_normal(BbsDTOnorm dto);
	    public int passwordConfirm(Integer board_idx , Integer password);
	    public int deleteContent_normal(int board_idx);
	    public int updateContent_normal(BbsDTOnorm dto);
	    public int writeReply_normal(BbsDTOnorm dto);
	    
	    public List<BbsDTOnorm> searchingContents_normal(String srcStr,String option ,int cp);
	    public int srcTotalCnt(String srcStr,String option);
	    
	    public int pwdCheck(Map<String,Integer>map);
	    
	    public int pageNavi(int board_idx);
	    public int afterRewriteNavi(int ref , int sunbun);
	    public int afterWriteNavi();
	    
}

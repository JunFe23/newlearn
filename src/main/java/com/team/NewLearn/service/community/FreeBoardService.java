package com.team.NewLearn.service.community;



import com.team.NewLearn.dto.community.CommunityDTO;
import com.team.NewLearn.dto.paging.Criteria;

import java.util.List;

public interface FreeBoardService {

    // 커뮤니티 자유게시판  글 불러오기
    List<CommunityDTO> getFreeBoardList(Criteria cri);



    // 글 상세 조회
    CommunityDTO boardDetail(int id); //게시글 세부내용 보기
    // 글 작성
    int boardInsert(CommunityDTO communityDTO); //게시글 생성
    // 글 수정
    int boardUpdate(CommunityDTO CommunityDTO); //게시글 수정
    // 글 삭제
    int boardDelete(int id); //게시글 삭제

    // 작성된 총 글 수
    int getTotal(Criteria cri);

    //조회수 증가
    int viewUpdate(int id);

}

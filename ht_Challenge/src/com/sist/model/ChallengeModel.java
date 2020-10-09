package com.sist.model;
import com.sist.dao.*;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
public class ChallengeModel {
	
	// 도전 리스트 출력
	public void challengeListData(HttpServletRequest request)
	{
		String page=request.getParameter("page");
		
		// 처음 접속했을때 페이지 설정하기
		if(page==null)
			page="1";
		
		// 현재 사용자가 보고 있는 페이지 받기
		int curpage=Integer.parseInt(page);
		
		// 시작,끝,페이징분할 단위 설정
		int rowSize=50;
		int start=(rowSize*curpage)-(rowSize-1);
		int end=rowSize*curpage;
		
		// 사용자가 요청한 페이지 처음~끝까지의 데이터 받기
		Map map=new HashMap();
		map.put("start",start);
		map.put("end",end);
		List<ChallengeVO> list = ChallengeDAO.challengeListData(map);
		
		
		// 총 페이지 받기
		int totalpage=ChallengeDAO.challengeTotalPage();
		
		// 	JSP로 결과값 전송하기
		request.setAttribute("list",list );
		request.setAttribute("curpage",curpage );
		request.setAttribute("totalpage",totalpage );
	
		List<ChallengeVO> cList=ChallengeDAO.challengeRecipeCount();
		request.setAttribute("cList", cList);
	}
	
	// 도전 상세 페이지
	public void chefRecipeData(HttpServletRequest request)
	{
		String page=request.getParameter("page");
		String chef_name=request.getParameter("chef_name");
		
		// 처음 접속했을때 페이지 설정하기
		if(page==null)
			page="1";
		
		// 현재 사용자가 보고 있는 페이지 받기
		int curpage=Integer.parseInt(page);
		
		// 시작,끝,페이징분할 단위 설정
		int rowSize=20;
		int start=(rowSize*curpage)-(rowSize-1);
		int end=rowSize*curpage;
		
		// 사용자가 요청한 페이지 처음~끝까지의 데이터 받기
		Map map=new HashMap();
		map.put("start",start);
		map.put("end",end);
		
		// 사용자가 클릭한 쉐프데이터 받기
		map.put("chef",chef_name);
		
		List<RecipeVO> list = RecipeDAO.chefRecipeData(map);
		
		// 총 페이지 받기
		int totalpage=RecipeDAO.chefRecipeTotalPage(chef_name);
		
		// 	JSP로 결과값 전송하기
		request.setAttribute("list",list );
		request.setAttribute("curpage",curpage );
		request.setAttribute("totalpage",totalpage );
	}
}
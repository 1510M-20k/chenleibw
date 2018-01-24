package com.bawei.utils;

/*
 * 1锟斤拷锟窖凤拷页锟矫的诧拷锟斤拷锟斤拷装锟斤拷锟斤拷锟斤拷锟斤拷锟叫ｏ拷7锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷要锟斤拷值锟斤拷锟斤拷只锟斤拷get锟斤拷锟斤拷
 * 2锟斤拷锟窖硷拷锟斤拷锟斤拷锟叫达拷锟斤拷锟斤拷锟斤拷锟侥癸拷锟届方锟斤拷锟斤拷
 * 3锟斤拷锟斤拷servlet锟斤拷锟斤拷写锟矫的凤拷页锟斤拷锟斤拷锟斤拷
 * 4锟斤拷锟睫革拷service锟斤拷dao锟斤拷锟揭筹拷锟饺≈�
 * public PageUtil(String page, int totalCount, int pageSize){ 前台锟斤拷锟杰碉拷前页锟斤拷锟斤拷台锟斤拷询锟斤拷锟斤拷锟斤拷锟斤拷锟皆讹拷锟斤拷锟揭筹拷锟轿�
 * 
 */

public class PageUtil {
	
	//锟斤拷装锟斤拷锟斤拷
	private int currentPage;  //锟斤拷前页
	private int prevPage;     //锟斤拷一页
	private int nextPage;     //锟斤拷一页
	private int totalPage;    //锟斤拷页锟斤拷/尾页
	private int totalCount;   //锟杰硷拷录锟斤拷
	private int pageSize;     //锟斤拷页锟斤拷位
	private int startIndex;   //锟斤拷锟斤拷值
	private int endPage;	//尾页

	//锟斤拷锟届方锟斤拷
	public PageUtil(String page,int totalCount, int pageSize){
		
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		initTotalPage();
		initCurrentPage(page);
		initPrevPage();
		initNextPage();
		initStartIndex();
		initendPage();
	}
	
	private void initendPage() {
		endPage = pageSize*currentPage;
	}
	/*
	 * 锟斤拷锟杰ｏ拷锟斤拷锟斤拷锟斤拷锟铰标）
	 */
	private void initStartIndex() {
		startIndex = (currentPage - 1)*pageSize;
	}

	/*
	 * 锟斤拷锟杰ｏ拷锟斤拷一页
	 */
	private void initNextPage() {
		nextPage = currentPage == totalPage ? totalPage : (currentPage + 1);
	}



	/*
	 * 锟斤拷锟杰ｏ拷尾页锟斤拷锟斤拷页锟斤拷锟斤拷
	 */
	private void initTotalPage() {
		totalPage = (totalCount/pageSize)+(totalCount%pageSize == 0 ? 0 : 1);
	}

	/*
	 * 锟斤拷锟杰ｏ拷锟斤拷一页
	 */
	private void initPrevPage() {
		prevPage = currentPage == 1 ? 1 : currentPage - 1;
	}


	/*
	 * 锟斤拷锟杰ｏ拷锟斤拷前页
	 */
	private void initCurrentPage(String page) {
		if(page == null){
			page = "1";
		}
		this.currentPage = Integer.parseInt(page);
		
//		if(currentPage > totalPage){
//			this.currentPage = totalPage;
//		}
		
	}


	public int getCurrentPage() {
		return currentPage;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public int getPageSize() {
		return pageSize;
	}

	public PageUtil() {
		super();
	}
	

}

package com.douzone.guestbook.daotest;

import java.util.List;

import com.douzone.guestbook.dao.GuestBookDao;
import com.douzone.guestbook.vo.GuestBookVo;

public class GuestBookDaoTest {

	public static void main(String[] args) {
		List<GuestBookVo> list = new GuestBookDao().findAll();
		
		for(GuestBookVo vo : list) {
			System.out.println(vo.getNo() + vo.getName() + vo.getMessage() );
		}

	}

}

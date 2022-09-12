package com.func.comparator.ex01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.func.vo.BookVO;

public class ComparatorExample01 {

	public static void main(String[] args) {
		List<BookVO> bookList = Arrays.asList(	new BookVO("Gandhi", 12.45f), 
												new BookVO("John Hopkins", 11.53f), 
												new BookVO("David Guetta", 9.23f),
												new BookVO("Hitler", 9.55f));
		
		Comparator<BookVO> titleComparator = new Comparator<BookVO>() {
			
			@Override
			public int compare(BookVO o1, BookVO o2) {				
				return o1.getTitle().compareTo(o2.getTitle());
			}
			
		};
		
		Collections.sort(bookList, titleComparator);
		
		bookList.stream().forEach((BookVO vo) -> {
			System.out.println(vo);
		});
		
		Collections.sort(bookList, (BookVO b1, BookVO b2) -> {
			return (int) (b2.getPrice() - b1.getPrice());
		});
		
		System.out.println("................................................................");
		
		bookList.stream().forEach((BookVO vo) -> {
			System.out.println(vo);
		});
	}

}

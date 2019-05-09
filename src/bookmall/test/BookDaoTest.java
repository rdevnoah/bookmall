package bookmall.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookDaoTest {
	public static void main(String[] args) {
		getListTest();

		// insertTest("꽃이 진다", 28000, 5L);
	}

	public static void getListTest() {
		List<BookVo> list = new BookDao().getList();
		for (BookVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest(String title, int price, Long categoryNo) {
		BookVo vo = new BookVo();
		vo.setTitle(title);
		vo.setPrice(price);
		vo.setCategoryNo(categoryNo);

		new BookDao().insert(vo);

		getListTest();
	}
}

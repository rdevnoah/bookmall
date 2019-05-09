package bookmall.test;

import java.util.List;

import bookmall.dao.CartDao;
import bookmall.vo.CartVo;

public class CartDaoTest {
	public static void main(String[] args) {

		// insertTest(3L, 2L, 1);
		getListTest(1L);

	}

	public static void getListTest(Long memberNo) {
		List<CartVo> list = new CartDao().getList(memberNo);
		for (CartVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest(Long memberNo, Long bookNo, int amount) {
		CartVo vo = new CartVo();

		vo.setMemberNo(memberNo);
		vo.setBookNo(bookNo);
		vo.setAmount(amount);

		new CartDao().insert(vo);
	}

}

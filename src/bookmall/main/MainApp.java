package bookmall.main;

import java.util.ArrayList;
import java.util.List;

import bookmall.dao.BookDao;
import bookmall.dao.CartDao;
import bookmall.dao.CategoryDao;
import bookmall.dao.MemberDao;
import bookmall.dao.OrderDao;
import bookmall.vo.BookVo;
import bookmall.vo.CartVo;
import bookmall.vo.CategoryVo;
import bookmall.vo.MemberVo;
import bookmall.vo.OrderBookVo;
import bookmall.vo.OrderVo;

public class MainApp {
	public static void main(String[] args) {

		// insert
		// insertDB();

		// display
		display();

	}

	public static void insertDB() {
		BookDao bookDao = new BookDao();
		CartDao cartDao = new CartDao();
		CategoryDao categoryDao = new CategoryDao();
		MemberDao memberDao = new MemberDao();
		OrderDao orderDao = new OrderDao();

		memberDao.insert(new MemberVo("김영호", "1234", "010-4532-3018", "zzagam2@gmail.com"));
		memberDao.insert(new MemberVo("안대혁", "0000", "010-1111-1111", "kickscar@gmail.com"));
		System.out.println("--------------------member 데이터 insert 완료-------------------");
		System.out.println();

		categoryDao.insert(new CategoryVo("소설"));
		categoryDao.insert(new CategoryVo("수필"));
		categoryDao.insert(new CategoryVo("컴퓨터/IT"));
		System.out.println("--------------------category 데이터 insert 완료-----------------");
		System.out.println();

		bookDao.insert(new BookVo("얼음과 불의 노래", 12000, 1L));
		bookDao.insert(new BookVo("인연", 21500, 2L));
		bookDao.insert(new BookVo("서버/인프라를 지탱하는 기술", 30000, 3L));
		System.out.println("--------------------book 데이터 insert 완료---------------------");
		System.out.println();

		cartDao.insert(new CartVo(1L, 1L, 2));
		cartDao.insert(new CartVo(1L, 3L, 5));
		System.out.println("--------------------cart 데이터 insert 완료---------------------");
		System.out.println();

		orderDao.insertOrder(new OrderVo(1L, 80000, "수원시 팔달구 우만동 R타워 1014호"));
		System.out.println("-------------------orders 데이터 insert 완료--------------------");
		System.out.println();

		List<OrderBookVo> list = new ArrayList<OrderBookVo>();
		list.add(new OrderBookVo(1L, 2L, 3));
		list.add(new OrderBookVo(1L, 3L, 1));
		orderDao.insertOrderBook(list);
		System.out.println("-------------------orders_book 데이터 insert 완료---------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("******************************************************************");
		System.out.println();
		System.out.println();

	}

	public static void display() {
		BookDao bookDao = new BookDao();
		CartDao cartDao = new CartDao();
		CategoryDao categoryDao = new CategoryDao();
		MemberDao memberDao = new MemberDao();
		OrderDao orderDao = new OrderDao();

		List<MemberVo> memberList = memberDao.getList();
		for (MemberVo vo : memberList) {
			System.out.println("이름 : " + vo.getName() + ", 전화번호 : " + vo.getPhone() + ", 이메일 : " + vo.getEmail()
					+ ", 비밀번호 : " + vo.getPasswd());
		}
		System.out.println("-------------------회원 리스트 출력 완료--------------------------");
		System.out.println();

		List<CategoryVo> categoryList = categoryDao.getList();
		for (CategoryVo vo : categoryList) {
			System.out.println("카테고리 이름 : " + vo.getName());
		}
		System.out.println("-------------------카테고리 리스트 출력 완료-----------------------");
		System.out.println();

		List<BookVo> bookList = bookDao.getList();
		for (BookVo vo : bookList) {
			System.out.println("제목 : " + vo.getTitle() + ", 가격 : " + vo.getPrice());
		}
		System.out.println("-------------------책 리스트 출력 완료---------------------------");
		System.out.println();

		List<CartVo> cartList = cartDao.getList(1L);
		for (CartVo vo : cartList) {
			System.out.println("도서제목 : " + vo.getBookTitle() + ", 수량 : " + vo.getAmount() + ", 가격 : " + vo.getPrice());
		}
		System.out.println("-------------------카트 리스트 출력 완료-------------------------");
		System.out.println();

		List<OrderVo> orderList = orderDao.getOrderList(1L);
		for (OrderVo vo : orderList) {
			System.out.println("주문번호 :" + vo.getNo() + ", 주문자이름 : " + vo.getMemberName() + ", 주문자이메일 :"
					+ vo.getMemberEmail() + ", 결제금액 : " + vo.getPrice() + ", 배송지 : " + vo.getAddress());
		}
		System.out.println("-------------------주문 리스트 출력 완료-------------------------");
		System.out.println();

		List<OrderBookVo> orderBookList = orderDao.getOrderBookList(1L);
		for (OrderBookVo vo : orderBookList) {
			System.out
					.println("도서번호 :" + vo.getBookNo() + ", 도서제목 : " + vo.getBookTitle() + ", 수량 : " + vo.getAmount());
		}
		System.out.println("-------------------주문 도서 리스트 출력 완료---------------------");
		System.out.println();

	}
}

package bookmall.test;

import java.util.List;

import bookmall.dao.CategoryDao;
import bookmall.vo.CategoryVo;

public class CategoryDaoTest {
	public static void main(String[] args) {
//		insertTest("소설");
//		insertTest("수필");
//		insertTest("컴퓨터/IT");
//		insertTest("인문");
//		insertTest("경제");
//		insertTest("예술");
//		
//		getListTest();

	}

	public static void getListTest() {
		List<CategoryVo> list = new CategoryDao().getList();
		for (CategoryVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest(String name) {
		CategoryVo vo = new CategoryVo();
		vo.setName(name);

		new CategoryDao().insert(vo);

	}
}

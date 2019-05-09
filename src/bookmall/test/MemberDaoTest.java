package bookmall.test;

import java.util.List;

import bookmall.dao.MemberDao;
import bookmall.vo.MemberVo;

public class MemberDaoTest {
	public static void main(String[] args) {
		// getListTest();

		// insertTest("안대혁", "12345", "010-2222-2222", "kickscar@gmail.com");
	}

	public static void getListTest() {
		List<MemberVo> list = new MemberDao().getList();
		for (MemberVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest(String name, String passwd, String phone, String email) {
		MemberVo vo = new MemberVo();
		vo.setName(name);
		vo.setPasswd(passwd);
		vo.setPhone(phone);
		vo.setEmail(email);

		new MemberDao().insert(vo);

		getListTest();
	}
}

package com.naver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

class NaverException extends Exception {

	private static final long serialVersionUID = 1L;

	public NaverException(String message) {
		super(message);
	}

}

public class NaverImpl implements Naver {

	List<NaverVO> list = new ArrayList<>();
	NaverVO vo;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private int input(int n) throws NaverException {

		int input = 0;
		try {
			try {

				input = Integer.parseInt(br.readLine());

			} catch (Exception e) {
				throw new NaverException("잘못 입력 : 숫자를 입력해주세요");
			}

			if (input < 1 || input > n) {
				throw new NaverException("잘못 입력 : 보기의 숫자를 입력해주세요");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return input;
	}

	@Override
	public void printMain() throws IOException, NaverException {

		System.out.print("1.회원가입 2.회원탈퇴 3.회원전체출력 4.아이디검색 5.정보수정 6.종료 ");
		int n = input(5);

		switch (n) {
		case 1:
			SignUp();
			break;
		case 2:
			delete();
			break;
		case 3:
			print();
			break;
		case 4:
			findId();
			break;
		case 5:
			update();
			break;
		case 6:
			System.out.println("시스템 종료");
			System.exit(0);
		}

	}

	@Override
	public void SignUp() throws IOException, NaverException {

		vo = new NaverVO();

		chackId1();
		chackPw();
		chackName();
		chackGender();
		chackBirth();
		chackEmail();
		chacktel();

		list.add(vo);

	}

	@Override
	public void chackId() throws IOException {

		boolean result = false;
		String id = null;

		do {

			int num = 0, eng = 0;

			System.out.print("아이디? ");
			id = br.readLine();

			try {

				if (id.length() < 8 || id.length() > 15) {
					throw new NaverException("아이디는 8~15자 이내");
				}

				for (int i = 0; i < id.length(); i++) {
					char ch = id.charAt(i);

					if (ch >= '0' && ch <= '9') {
						num++;
					} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
						eng++;
					}
				}

				if (num < 1 || eng < 1) {
					throw new NaverException("영문자 숫자 혼용");
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		vo.setId(id);

	}

	public void chackId1() throws NaverException {

		boolean result = false;
		String id = null;

		do {
			try {
				chackId();
				id = vo.getId();

				Iterator<NaverVO> it = list.iterator();
				while (it.hasNext()) {
					NaverVO vo1 = it.next();
					if (id.equals(vo1.getId())) {
						throw new NaverException("존재하는 아이디");
					}
				}
			} catch (IOException e) {
				System.out.println(e.toString());
			}

			result = true;

		} while (!result);

	}

	@Override
	public void chackPw() throws IOException, NaverException {

		boolean result = false;
		String pw = null;

		do {
			try {

				System.out.print("비밀번호? ");
				pw = br.readLine();
				System.out.print("비밀번호 확인? ");

				if (!pw.equals(br.readLine())) {
					throw new NaverException("비밀번호가 다름");
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		vo.setPw(pw);

	}

	@Override
	public void chackName() throws IOException {

		boolean result = false;
		String name = null;

		do {
			try {
				System.out.print("이름? ");
				name = br.readLine();

				for (int i = 0; i < name.length(); i++) {
					char ch = name.charAt(i);
					if ((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z')) {
						throw new Exception("이름은 영문자만 가능");
					}
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		vo.setName(name);

	}

	@Override
	public void chackGender() throws IOException, NaverException {

		boolean result = false;

		int num = 0;
		do {
			try {
				System.out.print("성별[1.남자 2.여자]?");
				String str = br.readLine();

				try {
					num = Integer.parseInt(str);
				} catch (Exception e) {
					throw new NaverException("숫자로 입력");
				}

				if (num < 1 || num > 2) {
					throw new NaverException("1또는 2를 입력");
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		if (num == 1) {
			vo.setGender("남자");
		} else if (num == 2) {
			vo.setGender("여자");
		}

	}

	@Override
	public void chackBirth() throws IOException, NaverException {

		boolean result = false;
		String birth;

		do {

			System.out.print("생일[yyyymmdd]?");
			birth = br.readLine();

			try {
				try {
					@SuppressWarnings("unused")
					int n = Integer.parseInt(birth);
				} catch (Exception e) {
					throw new NaverException("숫자로 입력");
				}

				if (birth.length() != 8) {
					throw new NaverException("생년월일을 8글자로 입력(yyyymmdd)");
				}

				Calendar cal = Calendar.getInstance();
				int year, month, day;
				year = Integer.parseInt(birth.substring(0, 4));
				month = Integer.parseInt(birth.substring(4, 6));
				day = Integer.parseInt(birth.substring(6));
				cal.set(year, month - 1, Calendar.DATE);

				if (year < 1900) {
					throw new NaverException("1900년도 이상");
				}

				if (month < 1 || month > 12) {
					throw new NaverException("월을 잘못입력");
				}

				if (day < 1 || day > cal.getActualMaximum(Calendar.DATE)) {
					throw new NaverException("일을 잘못입력");
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		vo.setBirth(Integer.parseInt(birth));

	}

	@Override
	public void chackEmail() throws IOException, NaverException {

		boolean result = false;
		String email = null;

		do {
			System.out.print("이메일?[xxx@xxx.xxx] ");
			email = br.readLine();
			try {

				if (email.indexOf("@") < 0) {
					throw new NaverException("이메일 형식이 맞지 않음");
				}

				if (email.indexOf(".") < 0 || email.indexOf(".") < email.indexOf("@")) {
					throw new NaverException("이메일 형식이 맞지 않음");
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		vo.setEmail(email);

	}

	@Override
	public void chacktel() throws IOException, NaverException {

		boolean result = false;
		int tel = 0;

		do {
			try {
				System.out.print("전회번호?[xxxxxxxx] ");
				String str = br.readLine();

				if (str.length() != 8) {
					throw new NaverException("8자로 입력");
				}

				try {
					tel = Integer.parseInt(str);
				} catch (Exception e) {
					throw new NaverException("숫자로 입력해주세요");
				}

				result = true;

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} while (!result);

		vo.setTel(tel);

	}

	@Override
	public void delete() throws IOException, NaverException {

		boolean result = false;

		chackId();
		String id = vo.getId();
		chackPw();
		String pw = vo.getPw();

		Iterator<NaverVO> it = list.iterator();
		while (it.hasNext()) {
			vo = it.next();

			if (id.equals(vo.getId()) && pw.equals(vo.getPw())) {
				list.remove(vo);
				System.out.println("삭제 완료");
				result = true;
			}
		}

		if (!result) {
			System.out.println("일치하는 정보가없음");
		}

	}

	@Override
	public void print() {

		Iterator<NaverVO> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

	}

	@Override
	public void findId() throws IOException, NaverException {

		boolean result = false;

		chackName();
		String name = vo.getName();
		chacktel();
		int tel = vo.getTel();

		Iterator<NaverVO> it = list.iterator();
		while (it.hasNext()) {
			vo = it.next();

			if (name.equals(vo.getName()) && tel == vo.getTel()) {
				System.out.println(vo.toString());
				result = true;
			}
		}

		if (!result) {
			System.out.println("일치하는 정보가 없음");
		}

	}

	@Override
	public void update() throws IOException, NaverException {

		boolean result = false;

		chackId();
		String id = vo.getId();
		chackPw();
		String pw = vo.getPw();

		Iterator<NaverVO> it = list.iterator();
		while (it.hasNext()) {
			vo = it.next();

			if (id.equals(vo.getId()) && pw.equals(vo.getPw())) {
				System.out.print("수정 : ");
				chackPw();
				System.out.print("수정 : ");
				chackName();
				System.out.print("수정 : ");
				chackGender();
				System.out.print("수정 : ");
				chackBirth();
				System.out.print("수정 : ");
				chackEmail();
				System.out.print("수정 : ");
				chacktel();
				result = true;
				break;
			}
		}

		if (!result) {
			System.out.println("일치하는 정보가없음");
		}

	}

}

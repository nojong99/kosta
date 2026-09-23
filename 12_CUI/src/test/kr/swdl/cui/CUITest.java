package test.kr.swdl.cui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import kr.swdl.cui.Member;
import kr.swdl.cui.Student;
import kr.swdl.cui.Teacher;

public class CUITest {
	private BufferedReader br;
	private List<Member> MemberList;

	public CUITest() {
		MemberList = new ArrayList<>(); 
		br = new BufferedReader(new InputStreamReader(System.in));
		menu();
	}

	private void menu() {
		while (true) {
			try {
				menuCheck(inputMenu("1. 학생 또는 교사를 추가\n" + "2. 입력된 목록을 모두 확인\n" + "3. 학생만 확인\n" + "4. 교사만 확인\n"
						+ "5. 교사는 담당과목을 수정\n" + "q. 시스템을 종료합니다.\n"+"실행할 메뉴를 입력해주세요."));
			} catch (IOException e) {
				System.out.println("문자열을 확인하고 입력해주세요. 1, 2, 3, 4, 5, q");
			}
		}
	}

	private void menuCheck(String menu) throws IOException {
		switch (menu) {
		case "1":
			memberInsert();
			break;
		case "2":
			memberPrint();
			break;
		case "3":
			studentSelct();
			break;
		case "4":
			teacherSelect();
			break;
		case "5":
			updateSubject();
			break;
		case "q":
			exitHandling();
			break;
		default:
			System.out.println("1, 2, 3, 4, 5, q 중에서 입력해주세요.");
		}
	}

	private void exitHandling() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))) {
	        for (Member m : MemberList) {
	            bw.write(m.toString());
	            bw.newLine();
	        }
	    } catch (IOException e) {
	        System.out.println("파일 저장 오류");
	    }

	    System.out.println("시스템이 종료됩니다.");
	    System.exit(0);
	}

	private void updateSubject() throws IOException {
		teacherSelect();
		String target = inputMenu("수정할 교번을 입력해주세요.");
		Teacher t = findTeacherInfo(target);
		if(t==null) {
			System.err.println("해당 교번을 가진 교사가 없습니다.");
			return;
		}
		t.setSubject(inputMenu("새로운 과목을 입력해주세요."));			
		System.out.println("수정되었습니다.");
	}

	private Teacher findTeacherInfo(String tno) {
		for(Member m : MemberList) {
			if(m instanceof Teacher) {
				Teacher t = (Teacher)m;
				if(t.getTno().equals(tno)) {
					return t;
				}
			}
		}
		return null;
	}
	
	private void teacherSelect() {
		for (Member m : MemberList) {
			if (m instanceof Teacher) {
				System.out.println(m);
			}
		}
	}

	private void studentSelct() {
		for (Member m : MemberList) {
			if (m instanceof Student) {
				System.out.println(m);
			}
		}
	}

	private void memberPrint() {
		for (Member m : MemberList) {
			System.out.println(m);
		}
	}

	private void memberInsert() throws IOException {
		switch (inputMenu("학생 입력이시면 S 교사 입력이시면 T를 입력해주세요.")) {
		case "S":
			MemberList.add(new Student(inputMenu(" 성별 : "), inputMenu(" 이름 : ")));
			break;
		case "T":
			MemberList.add(new Teacher(inputMenu(" 담당과목 : "), inputMenu(" 이름 : ")));
			break;
		default:
			System.out.println("S or T 만 입력해주세요");
		}
	}

	private String inputMenu(String title) throws IOException {
		System.out.println(title);
		return br.readLine();
	}

	public static void main(String[] args) {
		new CUITest();
	}
}

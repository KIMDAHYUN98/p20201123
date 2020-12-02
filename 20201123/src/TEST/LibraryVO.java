package TEST;

public class LibraryVO {
	
	public int memberNo;
	public String name;
	public int passwd;
	public int age;

	public LibraryVO() {
		
	}
	
	public LibraryVO(int memberNo, String name, int passwd, int age) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.passwd = passwd;
		this.age = age;
	}



	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPasswd() {
		return passwd;
	}

	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void showLibraryInfo() {
		System.out.println("memberNo : " + memberNo + "name : " + name + "passwd : " + passwd + "age : " + age);
	}
	

}


package service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {

	private static MemberServiceImpl singleton = new MemberServiceImpl();
	
	private MemberServiceImpl() {};
	
	public static MemberServiceImpl getInstance() {
		return singleton;
	}
	
	
	
	@Override
	public String greet(int i) {
		String[] greetings = {"Good Morning", "Hello", "Good Evening"};
		
		return greetings[i];
	}

	@Override
	public ArrayList<Member> getAll() {
		ArrayList<Member> list = new ArrayList<>();
		Member mem1 = new Member(1, "Linda", "mad@asdf.com");
		Member mem2 = new Member(2, "James", "asdf@asdf.com");
		Member mem3 = new Member(3, "Jake", "jake@adsf.com");
		
		list.add(mem1);
		list.add(mem2);
		list.add(mem3);
		
		return list;
	}

	@Override
	public int sumOf(int a, int b) {
		int sum = 0;
		for(int i = a; i<=b; i++) {
			
			sum = sum+i;
			
		}
		
		
		return sum;
	}

}

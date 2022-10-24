import java.util.Optional;

public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String str = null;
		Optional<String> strOption = Optional.ofNullable(str);
		
		if(strOption.isPresent()) {
			String message = strOption.get();
			
			System.out.println(message.length());
		}
		
		strOption.ifPresent(v -> System.out.println(v.length()));
	}

}

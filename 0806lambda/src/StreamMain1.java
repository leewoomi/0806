import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		// 문자열 배열을 생성
		String[] str = { "레드벨벳", "세븐틴", "블랙핑크" };

		// 문자열 리스트 생성
		List<String> list = new ArrayList<>();
		list.add("냉면");
		list.add("콩국수");
		list.add("냉모밀");

		// 문자열 배열을 가지고 스트림 만들기

		Stream<String> stream = Arrays.stream(str);
		// 작업 수행
		stream.forEach(name -> {
			System.out.println(name);
		});
		System.out.println("=======================");
		// list를 가지고 스트림 만들기
		stream = list.stream();
		stream.forEach(name -> {
			System.out.println(name);
		});
	}

}

package students;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain3 {

	public static void main(String[] args) {

		// Student 클래스의 인스턴스의 배열
		VO_Students[] ar = new VO_Students[5];
		ar[0] = new VO_Students("이우미", "여자", 99, 24, "정보통신과");
		ar[1] = new VO_Students("아이린", "여자", 88, 30, "실용음악과");
		ar[2] = new VO_Students("박보검", "남자", 77, 30, "연극영화과");
		ar[3] = new VO_Students("승리", "남자", 87, 35, "실용음악과");
		ar[4] = new VO_Students("박서준", "남자", 76, 35, "연극영화과");

		// // 성별이 남자인 데이터만 출력
		// Stream<VO_Students> stream = Arrays.stream(ar);
		// stream.filter(VO_Students -> VO_Students.getGender().equals("남자"))
		// .forEach(VO_Students -> System.out.println(VO_Students));

		// //성별이 여자이고 나이가 30이상인 데이터
		// Stream<VO_Students> stream = Arrays.stream(ar);
		// stream.filter(VO_Students -> VO_Students.getGender().equals("여자") &&
		// VO_Students.getAge() >=30)
		// .forEach(VO_Students -> System.out.println(VO_Students));

		// // Student를 score로 변경
		// Stream<VO_Students> stream = Arrays.stream(ar);
		// stream.mapToInt(VO_Students::getScore).forEach(VO_Students ->
		// System.out.println(VO_Students));

		Stream<VO_Students> stream = Arrays.stream(ar);
		//stream.sorted((n1, n2) -> n2.getAge() - n1.getAge()).forEach(VO_Students -> System.out.println(VO_Students));

		stream.sorted((n1, n2) -> n1.getName().compareTo(n2.getName()))
				.forEach(VO_Students -> System.out.println(VO_Students));

		// int[] arr = { 10, 30, 60, 20, 50 };
		// IntStream stream = Arrays.stream(arr);
		// stream.sorted().forEach(su -> System.out.println(su));
		//
		// String[] insa = { "Morning", "Afternoon", "Evening", "Night" };
		// Stream<String> s = Arrays.stream(insa);
		// s.sorted().forEach(su -> System.out.println(su));
		// s.sorted((n1, n2) -> n2.compareTo(n1)).forEach(su -> System.out.println(su));

	}

}

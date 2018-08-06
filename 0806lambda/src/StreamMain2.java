import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain2 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		list.add("서울특별시");
		list.add("경기도");
		list.add("강원도");
		list.add("제주도");
		list.add("경기도");
		list.add("강원도");
		list.add("제주도");
		
		Stream<String> stream =list.stream();
//		stream.forEach(name -> {
//			System.out.println(name);
//		});
		
		//중복 제거
		//stream.skip(2).limit(1).distinct().forEach(name -> {System.out.println(name);});
		
		//서로 시작하는 데이터만 찾아서 출력
		//return 문장 하나 밖에 없을 때는 return 이라는 단어를 생략가능
		//수행되는 코드가 한 줄 일 때는 {} 생략가능
		//stream.filter(name->name.startsWith("서")).forEach(name ->System.out.println(name));
		
		
		//길이가 3이 아닌 데이터만 찾아서 출력
		stream.filter(loc->loc.length() !=3).forEach(loc ->System.out.println(loc));
	
	}

}

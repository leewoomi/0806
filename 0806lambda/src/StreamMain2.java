import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain2 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		list.add("����Ư����");
		list.add("��⵵");
		list.add("������");
		list.add("���ֵ�");
		list.add("��⵵");
		list.add("������");
		list.add("���ֵ�");
		
		Stream<String> stream =list.stream();
//		stream.forEach(name -> {
//			System.out.println(name);
//		});
		
		//�ߺ� ����
		//stream.skip(2).limit(1).distinct().forEach(name -> {System.out.println(name);});
		
		//���� �����ϴ� �����͸� ã�Ƽ� ���
		//return ���� �ϳ� �ۿ� ���� ���� return �̶�� �ܾ ��������
		//����Ǵ� �ڵ尡 �� �� �� ���� {} ��������
		//stream.filter(name->name.startsWith("��")).forEach(name ->System.out.println(name));
		
		
		//���̰� 3�� �ƴ� �����͸� ã�Ƽ� ���
		stream.filter(loc->loc.length() !=3).forEach(loc ->System.out.println(loc));
	
	}

}

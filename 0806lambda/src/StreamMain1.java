import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		// ���ڿ� �迭�� ����
		String[] str = { "���座��", "����ƾ", "����ũ" };

		// ���ڿ� ����Ʈ ����
		List<String> list = new ArrayList<>();
		list.add("�ø�");
		list.add("�ᱹ��");
		list.add("�ø��");

		// ���ڿ� �迭�� ������ ��Ʈ�� �����

		Stream<String> stream = Arrays.stream(str);
		// �۾� ����
		stream.forEach(name -> {
			System.out.println(name);
		});
		System.out.println("=======================");
		// list�� ������ ��Ʈ�� �����
		stream = list.stream();
		stream.forEach(name -> {
			System.out.println(name);
		});
	}

}

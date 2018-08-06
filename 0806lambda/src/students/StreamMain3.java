package students;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain3 {

	public static void main(String[] args) {

		// Student Ŭ������ �ν��Ͻ��� �迭
		VO_Students[] ar = new VO_Students[5];
		ar[0] = new VO_Students("�̿��", "����", 99, 24, "������Ű�");
		ar[1] = new VO_Students("���̸�", "����", 88, 30, "�ǿ����ǰ�");
		ar[2] = new VO_Students("�ں���", "����", 77, 30, "���ؿ�ȭ��");
		ar[3] = new VO_Students("�¸�", "����", 87, 35, "�ǿ����ǰ�");
		ar[4] = new VO_Students("�ڼ���", "����", 76, 35, "���ؿ�ȭ��");

		// // ������ ������ �����͸� ���
		// Stream<VO_Students> stream = Arrays.stream(ar);
		// stream.filter(VO_Students -> VO_Students.getGender().equals("����"))
		// .forEach(VO_Students -> System.out.println(VO_Students));

		// //������ �����̰� ���̰� 30�̻��� ������
		// Stream<VO_Students> stream = Arrays.stream(ar);
		// stream.filter(VO_Students -> VO_Students.getGender().equals("����") &&
		// VO_Students.getAge() >=30)
		// .forEach(VO_Students -> System.out.println(VO_Students));

		// // Student�� score�� ����
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

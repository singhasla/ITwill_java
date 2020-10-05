package ch09;

public class P428_Anonymous {

	// �ʵ� �ʱⰪ���� ����
	P427_Person field = new P427_Person() {
		void work() {
			System.out.println("����մϴ�.");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};

	void method1() {
		// ���� ���������� ����
		P427_Person localVar = new P427_Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}

		};
		
		// ���� ���� ���
		localVar.wake();
	}

	void method2(P427_Person person){
		person.wake();
	}
}

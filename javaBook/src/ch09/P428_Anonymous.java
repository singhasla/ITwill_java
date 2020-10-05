package ch09;

public class P428_Anonymous {

	// 필드 초기값으로 대입
	P427_Person field = new P427_Person() {
		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};

	void method1() {
		// 로컬 변수값으로 대입
		P427_Person localVar = new P427_Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}

		};
		
		// 로컬 변수 사용
		localVar.wake();
	}

	void method2(P427_Person person){
		person.wake();
	}
}

package Practice;

public class Practice {
public static void main(String[] args) {
	ExceptionDemo e1 = new ExceptionDemo();
	System.out.println("=======================Q.1 (a)Single try catch  ==============\n");
			e1.SingleTryCatchFinally();
			System.out.println("=======================Q.1 (b)Multiple catch  ==============\n");
			e1.MultipleCatch();
			System.out.println("=======================Q.1 (a)Nested try catch  ==============\n");
			e1.NestedTryAndCatch();
			System.out.println("=======================Q.1 (a)Throw & Throws  ==============\n");
			e1.throwAndThrows();
			System.out.println("=======================Q.2 Checked Exception UserNot Found  ==============\n");
			e1.UserValidation();
}
}

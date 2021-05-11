package classandinterface

class ClassInheritedConstructor {
}

open class CustomButton

/**
 * 이제 안다. 클래스의 상속 뒤에는 (), 인터페이스의 구현 뒤에는 괄호가 없는 이유를.
 * 위와 같은 인자가 없는 클래스에서는 기본 생성자를 만들어 준다.
 * 해당 클래스를 상속한 클래스에서는 반드시 상위 클래스의 생성자를 호출해야한다. (자바와 같음)
 *
 * 인터페이스는 생성자가 없으니 그럴 필요가 없는 것.
 */
class RadioButton: CustomButton()

// 생성자를 private 로 만들면 인스턴스 생성 못함 !!
class CannotInstance private constructor() {}
package lambda.lambdaex

import lambda.Person

class MaxByEx {}

var people = listOf(Person("Tomas", 27), Person("OldTomas", 55), Person("YoungTomas", 25), Person("Amen", 77))

fun main() {
    // 함수 호출 시 맨 뒤에 있는 인자가 람다식이라면 괄호 밖으로 뺴낼 수 있따. 아래처럼.
    people.maxByOrNull({p:Person -> p.age})

    // 람다가 유일한 함수의 인자면 괄호를 없애도 된다. 아래처럼.
    people.maxByOrNull() {p:Person -> p.age}

    // 유일한 인자가 아니면 괄호는 남기고 람다만 밖으로 뺀다.
    // 이런 규칙을 활용하기 위해 람다 인자는 마지막에 두는 것이 좋다.
    // 인텔리제이의 move~ 기능은 쉽게 넣었다 뺐다를 가능하게 해준다 !!!
    people.joinToString(separator = " ", transform = { p:Person -> p.name })
    people.joinToString(separator = " ") { p:Person -> p.name }
    people.joinToString(separator = " ") { it.name }

    // 타입을 유추할 수 있다면 생략가능
    // 하지만 람다 자체를 변수에 저장할 때에는, 유추가 불가능하기 떄문에 무조건 타입을 붙여줘야함
    people.maxByOrNull { p -> p.age }

    // it 라는 람다의 디폴트 이름을 쓰면 더 간단해진다.
    people.maxByOrNull { it.age }
}
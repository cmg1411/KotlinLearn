package function.collections

import java.lang.IllegalArgumentException

class LocalMethod {}

class User(val id: Int, val name: String, val address: String)

// 1번째 : 중복검사 로직이 중복이다.
fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Name.")
    }
    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Address.")
    }

    // 저장 로직
}

// 2번째 : 중복검사 로직을 로컬 함수로 뽑아내 중복을 없앤다.
// 하지만 로컬 함수에서는 자신이 속한 바깥 함수의 모든 파라미터와 변수를 사용할 수 있음을 이용하면 더 줄일 수 있다.
fun saveUser2(user: User) {
    fun validation(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalAccessException("Can't save user ${user.id}: empty $fieldName")
        }
    }

    validation(user, user.name, "Name")
    validation(user, user.address, "Address")
}

// 3번째 : 로컬 함수에서는 바깥 함수의 파라미터와 변수를 사용가능하다.
fun saveUser3(user: User) {
    fun validation(value: String, fieldName: String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }

    validation(user.name, "Name")
    validation(user.address, "Address")
}

// 4번째 : 검증 로직을 User 의 로컬 함수로 추출.
// 만약, 이 검증로직을 User 를 사용하는 모든 곳에서 사용하는 것이 아닌 save 작업시에만 사용한다 치면, User 에 포함하는 확장 함수로 하기 싫을 수 있다.
// 한 객체만을 다루면서, 비공개 데이터를 다룰 필요 없는 상황에는 이처럼 확장 함수를 사용하면 User 에 정의 하지 않아 이후 User 를 사용하는 곳에서 고려해야할 점이 줄어들면서 User 의 메서드를 사용하는 것 처럼 쓰는 이점을 누릴 수 있다.
fun User.validateBeforeSave() {
    fun validation(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }

    validation(name, "Name")
    validation(address, "Address")
}

fun saveUser4(user: User) {
    user.validateBeforeSave()
}

fun main() {
    var user = User(1, "123", "")
//    saveUser(user)
//    saveUser2(user)
//    saveUser3(user)
    saveUser4(user)
}
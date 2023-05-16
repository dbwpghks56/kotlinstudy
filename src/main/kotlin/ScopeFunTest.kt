fun printFr (
    fruit: Fruit?
) {
    // 람다를 사용해 일시적 영역을 만듦
    fruit?.let { // null 이 아닐 때 호출할 수 있게
        println(it.name)
        println(it.price)
    }

    // let : 하나 이상의 함수를 call chain 결과로 호출할 때 자주 사용, non-null 값에 대해서만 code block 을 실행 시킬 때, 일회성으로 제한된 영역에 지역 변수를 만들 때
    // run : 객체 초기화와 반환 값의 개선을 동시에 해야 할 때
    // apply : 객체 그 자체가 반환된다. 객체 설정을 할 때에 객체를 수정하는 로직이 call chain 중간에 필요할 때
    // also : 객체 그 자체가 반환된다. 위와 동일
    // with : 특정 객체를 다른 객체로 변환해야 되는데, 모듈 간의 의존성에 의해 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때
}
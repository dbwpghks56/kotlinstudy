class House(
    private val address: String,
    private val livingRoom: LivingRoon
) {
    class LivingRoon( // Kotlin 에서는 기본적으로 바깥 클래스와 연결이 없는 클래스가 만들어진다.
        private val area: Double
    )

    inner class ChainRoom( // 바깥 클래스와 연결이 되어있는 클래스 ( 권장되지 않음 )
        private val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}
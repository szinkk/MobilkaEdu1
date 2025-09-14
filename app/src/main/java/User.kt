import java.util.Date

data class User
    (val id: Int,
     val name: String,
     val age: Int,
     val type: Type) {
    val startTime: Long by lazy {
        Date().getTime()
    }


}
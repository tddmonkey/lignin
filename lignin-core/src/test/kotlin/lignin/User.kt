package lignin


data class User(
    val name: String
)

fun user(name: String) = User(name = name)
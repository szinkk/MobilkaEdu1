inline fun auth(user: User, callback: AuthCallback, crossinline updateCache: () -> Unit) {
    if(user.ageChecker()){
        callback.authSuccess()
        updateCache()
    }
    else{
        callback.authFailed()
        updateCache()
    }
}
fun User.ageChecker(): Boolean{
    if (this.age > 18){
        println("User ${this.name} is over 18 years old")
        return true
    }
    else {
        throw Exception("User ${this.name} is under 18 years old")
    }
}

val authCallback = object : AuthCallback{
    override fun authSuccess(): Boolean{
        println("Authentication success")
        return true
    }

    override fun authFailed(): Boolean {
        println("Authentication failed")
        return false
    }
}

fun doAction(action: Action){
    when (action) {

        is Action.Registration -> {
            println("Registration successful, welcome!")
        }

        is Action.Login -> {
            auth(action.user, authCallback, { updateCache() })
        }

        is Action.Logout -> {
            println("Logout successful, see you later!")
        }
    }



}
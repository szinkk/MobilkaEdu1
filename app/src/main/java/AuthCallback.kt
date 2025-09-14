interface AuthCallback {
    fun authSuccess(): Boolean
    fun authFailed(): Boolean
}
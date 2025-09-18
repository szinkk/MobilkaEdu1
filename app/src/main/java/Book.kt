class Book(
    override val price: Double,
    override val wordCount: Int
): Publication {
    override fun getType(): String{
        return when {
            wordCount <= 1000 -> {
                "Short Story"
            }
            wordCount < 7500 -> {
                "Flash Fiction"
            }
            else -> {
                "Novel"
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Book){
            return false
        }
        return this.price == other.price && this.wordCount == other.wordCount
    }

    override fun hashCode(): Int {
        var result = price.hashCode()
        result = 31 * result + wordCount
        return result
    }
}
class Book(
    override var price: Double,
    override val wordCount: Int
): Publication {
    override fun getType(): String{
        return if (wordCount < 1000){
            "Short Story"
        } else if (wordCount < 7500){
            "Flash Fiction"
        } else{
            "Novel"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Book){
            return false
        }
        return this.price == other.price && this.wordCount == other.wordCount
    }
}

fun main(){
    //Первая часть
    val bookFirst = Book(price = 199.00, wordCount = 11000)
    val bookSecond = Book(price = 39.99, wordCount = 2690)
    val magazineFirst = Magazine(price = 45.0, wordCount = 1120)

    println("bookFirst: The publication contains ${bookFirst.wordCount}, it is a ${bookFirst.getType()}, it costs ${bookFirst.price} euros.")
    println("bookSecond: The publication contains ${bookSecond.wordCount}, it is a ${bookSecond.getType()}, it costs ${bookSecond.price} euros.")
    println("magazineFirst: The publication contains ${magazineFirst.wordCount}, it is a ${magazineFirst.getType()}, it costs ${magazineFirst.price} euros.\n")
    println("The result of the comparison is in the link bookFirst and bookSecond: ${bookFirst === bookSecond}")
    println("Result of comparison by method equals bookFirst and bookSecond: ${bookFirst.equals(bookSecond)}\n")


    val bookOfNull: Book? = null
    val bookHoly: Book? = Book(price = 199.0, wordCount = 1000)

    buy(bookOfNull)
    buy(bookHoly)
    println()


    val sum = {x: Int, y:Int -> println("$x + $y = ${x + y}")}
    sum(777, 555)
    println()



    //Вторая часть
    val userFirst: User = User(1, "Satorus", 77, Type.DEMO)

    println(userFirst.startTime)
    Thread.sleep(1000)
    println(userFirst.startTime)
    println()

    val usersList = mutableListOf(userFirst)
    usersList.apply {
        add(User(2, "Alexey", 15, Type.DEMO))
        add(User(3, "Roman", 25, Type.DEMO))
        add(User(4, "Pavel", 54, Type.FULL))
        add(User(5, "Kirill", 12, Type.DEMO))
        add(User(6, "Nikita", 33, Type.FULL))
        add(User(7, "Polina", 21, Type.FULL))
        add(User(8, "Valeria", 16, Type.FULL))
        add(User(9, "Yaroslav", 7, Type.DEMO))
        add(User(0, "Ilya", 6, Type.FULL))
    }

    val usersAdminList = mutableListOf<User>()
    for (user in usersList){
        if (user.type == Type.FULL){
            usersAdminList.add(user)
        }
    }
    val userNames = usersAdminList.map { it.name }
    val firstUserIndex = userNames.first()
    val lastUserIndex = userNames.last()
    println("List: $userNames \nFirst user in list: $firstUserIndex \nLast user in list: $lastUserIndex")
    println()

    for (user in usersAdminList){
        user.ageChecker()
    }
    println()

    doAction(Action.Registration)
    doAction(Action.Login(userFirst))
    doAction(Action.Logout)

}
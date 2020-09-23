var user_name:String? = null

fun validate(item:String?) {

        when(item)
        {
                null -> Create_User()
                else -> Get_Greeting()
        }
}

fun Get_Logo()
{
        println("")
        println("")
        println("---------------------------")
        println("---------------------------")
        println(" T     E       S       A   ")
        println("---------------------------")
        println("---------------------------")
        println("")
        println("")
}


fun Create_User()
{
        print("Enter Name: ")
        user_name = readLine()
        println("")
        println("Creating user.........")
        println("")
        validate(user_name)
}

// String literal
fun Greet_User(name : String?) : String? = "Hello $name"


fun Get_Greeting() : Unit
{
        println(Greet_User(user_name))
}

fun main() {
        Get_Logo()
        validate(user_name)
}









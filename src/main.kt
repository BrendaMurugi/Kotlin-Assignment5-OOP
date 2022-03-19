fun main() {
    var person1 = Human("Cudra", 20, 40.0)

    person1.eat(5)
    person1.eat(2)
    println(person1.weight)

    person1.speak("I love food.")

    person1.birthday()

    var person2 = Human("Grace", 25, 50.6)
    person2.eat(5)
    person2.eat(2)
    println(person2.weight)

    person2.speak("I love food.")

    person2.birthday()

    var personA = user("John", "Owuor", "johnowuor@gmail.com", "0712345678", "owuor6556!")
    println(personA.firstName)
    println(personA.lastName)

}
//Create a class called Human with these attributes: name, age, weight.
//Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten

class Human(var name:String, var age:Int, var weight:Double) {
    fun eat (foodWeight:Int) {
        weight += foodWeight
        println("I am eating $foodWeight kgs of food.")
    }
    //Prints the string passed to it
    fun speak(speech: String) {
        println(speech)
    }
    //Increments the human’s age by 1
    fun birthday() {
        age += 1
        println(age)
    }
}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
//attributes

data class user(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:Any)
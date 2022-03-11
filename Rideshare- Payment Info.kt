/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {    
    initDB()
    println("Hello World")
    // Test functions here
    
}

data class PaymentInfo(
    val cardOwner: String,
    val cardNumber: Int,
    val cardCVV: Int
)

// Hint: accessing a property of a data class is as simple as using examplePaymentInfo.cardNumber to retrieve the Int value

val storedCard1 = PaymentInfo("Bob", 22223333, 111)
val storedCard2 = PaymentInfo("John", 11113333, 134)

val invalidCard1 = PaymentInfo("", 11113333, 134)
val invalidCard2 = PaymentInfo("", 11113333, 1222)

// This database is treated as a global variable that we can access directly in addCardToDatabase
val cardDataBase = mutableMapOf<Int, PaymentInfo>()

// Don't change this function
fun initDB() {
    cardDataBase[storedCard1.cardNumber] = storedCard1
    cardDataBase[storedCard2.cardNumber] = storedCard2
}

fun validInfo(paymentInfo: PaymentInfo): Boolean {
    // TODO validate paymentInfo according to instructions
    if(paymentInfo.cardOwner.isEmpty()) {
        return false
    }
    
    else if(paymentInfo.cardNumber.toString().length !=8) {
        return false
    }
    else if (paymentInfo.cardCVV.toString().length !=3) {
        return false
    }
    return true 
}

fun addCardToDatabase(paymentInfo: PaymentInfo): Boolean {
    // TODO check if we can add card to database according to instructions 
    // use println("ERROR) and return false if the card has already been added 
    // use println("SUCCESS"), add the card to the database, and return true if the card can be added
    
    if(cardDataBase[paymentInfo.cardNumber] == null) {
        println("SUCCESS")
        cardDataBase[paymentInfo.cardNumber] == paymentInfo
        return true
    } else {
        println("ERROR")
        return false
    }
}
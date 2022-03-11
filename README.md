##  Rideshare:Closest-Driver





Background
A user is requesting a rideshare, and we need to find the closest driver in our database to their
location. We can access the user’s x and y coordinates and the coordinates of all of our drivers
in our database. Using this information we can calculate the closest driver.
Here is your task
1. Complete the function closestDriver(rider: Rider)
a. We are passing in a Kotlin data class Rider to the function, and should a return
the Driver with the closest coordinates in the driverDatabase
b. Print the name of the closest Driver to the Rider provided in ClosestDriver.kt
c. Hint: there is a formula that can be used to calculate distances between two
points
2. When finished, copy your completed code from the web environment into a local .txt file
and submit it

Setup
- Go to https://play.kotlinlang.org/ to easily run and test your code
-  Paste the functions included in ClosestDriver_Start.txt file below the main function



Resources:
- Data Classes: https://kotlinlang.org/docs/data-classes.html









##  Rideshare: Payment Info

Background
Users want to add payment information to our server, but we want to make sure that they are
sending valid data before we add it to our system. Our app has input fields that capture the
card owner name, card number, and card cvv (for simplicity’s sake, we will ignore the expiration
date). The rules for a valid payment option are as follows:
1. The card owner name must not be blank
2. The card number must be a number and 8 digits long
3. The card cvv code must be a number and 3 digits long

Here is your task
1. Complete the function validInfo(paymentInfo: PaymentInfo)
a. We are passing in a Kotlin data class PaymentInfo to the function, and should
return true if the PaymentInfo is valid and false if not
b. Ex. PaymentInfo(“Tom”, 22221111, 444) should return true
c. Ex. PaymentInfo(“Brad”, 1231, 22) should return false
d. Hint: 212.toString().length in Kotlin will return 2
2. Complete the function addCardToDatabase(paymentInfo: PaymentInfo)
a. A MutableMap<Int, PaymentInfo> will represent our database, where the key is
the card number and the value is the PaymentInfo. If a card has already been
added to our database, we will return false and print ERROR. If the card has not
been added, we will add it to our database, print SUCCESS and return true
3. When finished, copy your completed code from the web environment into a local .txt file
and submit it

Setup
- Go to https://play.kotlinlang.org/ to easily run and test your code
- Paste the functions included in ValidatePaymentInfo_Start.txt file below the main function

Resources:
- Data Classes: https://kotlinlang.org/docs/data-classes.html
- MutableMap: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/

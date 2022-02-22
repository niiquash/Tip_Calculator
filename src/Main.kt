fun calculateTip(bill: Float, tipPercent: Float): Float {
    return bill * (tipPercent / 100)
}

fun billsAndTipsLogbook(vararg billsAndTips: MutableList<Any?>) {
    if (billsAndTips.isEmpty()) {
        println("Your logbook is empty")
    } else {
        for (i in 1..billsAndTips.size) {
            println("Tips you have paid so far: ")
            println(billsAndTips[i-1])
        }
    }
}

fun main() {
//  Declare and initialize some variables that will be used
    val billsAndTips = mutableListOf<Any?>()
    var userInput: String? = null
    var tip = 0f
    
//  Display greeting
    println("**************************************************")
    println("Welcome to the Tip Calculator Application!")
    println("**************************************************")

//  Display options
    println()
    println("This application will allow you to calculate a tip to add to your bills.")
    println()
    println("**************************************************")

    while (userInput != "3") {

        println("What do you want to do: ")
        println("\t1. View previous bills and tips")
        println("\t2. Calculate new tip")
        println("\t3. Quit")

    //  Get user options
        print(">")
        userInput = readLine()
    //  Carry out task
        when (userInput) {
            "1" -> billsAndTipsLogbook(billsAndTips)
            "2" -> {
                // Prompt for the initial bill amount.
                print("Enter the bill amount: ")
                var bill = readLine()!!
                var floatBill = bill.toFloat()

                // Prompt for what tip percentage to calculate.
                print("Enter the tip percentage: ")
                var tipPercent = readLine()!!
                var floatTip = tipPercent.toFloat()
                
                // Call the function to calculate the tip and return the result
                tip = calculateTip(floatBill, floatTip)
            
                // Display the tip output to the user
                println("A $tipPercent% tip of of your bill is $$tip")
                
                // Add the tip to the billsandTips list
                billsAndTips.add(tip)
            }
            "3" -> println("Goodbye")
            else -> {
                println("This option is not recognized!")
            }
    }
}

}

fun isPalindrome(x: Int): Boolean {
    // If x is negative, it cannot be a palindrome.
    if (x < 0) return false
    // If x is 0, it is a palindrome.
    if (x == 0) return true

    // Create a variable to hold the reverse of x.
    var reverse = 0
    var num = x
    while (num > 0) {
        // Extract the last digit of num.
        val digit = num % 10
        // Add the digit to the right end of reverse.
        reverse = reverse * 10 + digit
        // Remove the last digit from num.
        num /= 10
    }

    // Return true if x is equal to its reverse, false otherwise.
    return x == reverse
}

fun main() {
    println(isPalindrome(12321))  // prints true
    println(isPalindrome(1221))   // prints true
    println(isPalindrome(-12321)) // prints false
    println(isPalindrome(12345))  // prints false
}
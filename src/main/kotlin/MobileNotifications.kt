/**
 * go to ques page by clicking [here.](https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems#1)
 * */

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

private fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages >= 100) println("Your phone is blowing up! You have 99+ notifications.")
    else println("You have $numberOfMessages notifications.")
}

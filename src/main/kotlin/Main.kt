var commisionPercentage  = 0.0075
var minCommision = 3500
var commisionAmmount = 0.0

fun main(args: Array<String>) {

    println("Введите сумму перевода в копейках:")
    var ammount: Int = readLine()!!.toInt()
    commisionAmmount = when { ammount * commisionPercentage < minCommision -> minCommision.toDouble() else -> ammount * commisionPercentage}

     println("Cумма коммисии составит: ${commisionAmmount.toInt()} копеек")
}


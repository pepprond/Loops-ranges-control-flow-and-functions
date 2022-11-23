fun main() {
    fun printBigNumber(number: Int){
        println("this number is greater than 50: $number ")
    }
    fun printSmallNumber(number: Int){
        println("this number is less than 50: $number")
    }
    for(i in 1..100 step 2){
        if(i>50){
            printBigNumber(i)
        }else{
            printSmallNumber(i)
        }
    }

}
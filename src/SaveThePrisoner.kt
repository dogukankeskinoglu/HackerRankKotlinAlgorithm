fun main(){
    writeResult("18 360398845 1")
    writeResult("999999999 999983621 2")
    writeResult("1000000000 999974157 866502488")
    writeResult("999999999 999999999 8164")
    writeResult("5 920615516 2")
    writeResult("59 251968243 59")
    writeResult("48 61736352 48")
    writeResult("2 867250528 2")
    writeResult("126003275 655341439 126003274")
    writeResult("11 631105421 1")
    writeResult("167 655770088 116")
    writeResult("1000000000 13333 999987403")
    writeResult("1000000000 999986058 1000000000")
    writeResult("999999999 1000000000 999999999")
    writeResult("5 251816103 5")
    writeResult("84 534971410 1")
    writeResult("10 54680780 10")

}
fun writeResult(string:String){
    val first_multiple_input = string.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val s = first_multiple_input[2].toInt()

    println(saveThePrisoner(n,m,s))
}
fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    val tour=m%n-1
    val state=if(s+tour>n) tour-(n-s) else s+tour
    return state
}

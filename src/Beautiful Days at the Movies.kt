import java.lang.Math.*

fun main(){
    val i=20
    val j=23
    val k=6

    print(beautifulDays(i,j,k))
}


fun beautifulDays(i: Int, j: Int, k: Int): Int {
    var count=0
    for(number in (i..j)){
        val numberReversed=number.toString().reversed().toInt()
        if(abs(number-numberReversed)%k==0) count+=1

    }
    return count
}

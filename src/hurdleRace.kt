fun main(){
    val array= mutableListOf<Int>(2,5,4,5,2)
    val array2= mutableListOf<Int>(1,6,3,5,2)
    val k=7
    val k2=4
    println(hurdleRace(k2,array2))
    println(hurdleRace(k,array))
}

fun hurdleRace(k:Int,height:MutableList<Int>):Int{
    val filterList= height.filter { it>k }.maxOrNull()
    return if (filterList==null) 0 else filterList-k
}

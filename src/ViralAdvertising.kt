fun main() {
    println(viralAdvertising(3))
}

fun viralAdvertising(n: Int): Int {
    var likePeopleCount=0
    var newLike=2
    var countPeople=5
    for(i in 1..n){
        newLike=countPeople/2
        countPeople=newLike*3
        likePeopleCount+=newLike
    }
    return likePeopleCount
}

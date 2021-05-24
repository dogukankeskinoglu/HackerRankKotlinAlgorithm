fun main(){
    println(utopianTree(5))
}

fun utopianTree(n: Int): Int {
    var height=0
    for (i in 0..(n+1)){
        if(i%2==0) height*=2 else height+=1
    }
    return height
}

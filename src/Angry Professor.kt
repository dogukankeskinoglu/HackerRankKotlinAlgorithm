fun main(){
    val k=3
    val input="-1 -3 4 2"
    val inputFormat=setInput(input)
    print(angryProfessor(k,inputFormat))
}
fun setInput(input:String):MutableList<Int>{
    return input.trimEnd().split(" ").map{ it.toInt() }.toMutableList()
}
fun angryProfessor(k: Int, a: MutableList<Int>): String {
    val arrivedStudent=a.count { it<=0 }
    return if(k>arrivedStudent) "YES" else "NO"
}
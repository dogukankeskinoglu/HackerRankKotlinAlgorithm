fun main(){
    print(camelcase("saveChangesInTheEditor"))
}

fun camelcase(s: String): Int {
    return s.filter { it.isUpperCase() }.length+1
}

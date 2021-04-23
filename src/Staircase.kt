fun staircase(n: Int): Unit {
    var countspace=n
    for(i in 1..n){
        println("${" ".repeat(--countspace)}${"#".repeat(i)}")

    }

}
fun migratoryBirds(arr: Array<Int>): Int {

    var max_count=Int.MIN_VALUE
    var max_element=0
    var arrSet=arr.sorted().toSet()
    for(value in arrSet){
        val count_element=arr.count{it==value}
        //println("$value $count_element $max_count")
        if(count_element>max_count){
            max_count=count_element
            max_element=value
            //println("girdi $value $count_element $max_count")
        }
    }
    return max_element

}
fun main(){
    var textinput= mutableListOf<Int>(4,6,5,3,3,1)
    var textinput2= mutableListOf<Int>(1,2,2,3,1,2)
    pickingNumbers(textinput)
    pickingNumbers(textinput2)
}
fun pickingNumbers(a:MutableList<Int>): Int {
    // Write your code here
    var new_list= mutableListOf<Int>()
    var sublist= mutableListOf<Int>()
    new_list.addAll(a)
    new_list=new_list.sorted().toMutableList()
    //println(new_list)
    var maxcount=Int.MIN_VALUE
    if(a.toSet().size==1){
        return a.size
    }
    for(i in new_list.indices){
        sublist.add(new_list[i])
        for(k in i..(new_list.size-2)){
            //println(sublist)
            //println("${new_list[k+1]}-${new_list[k]}->count:${sublist.size}")
            if(new_list[k+1]-new_list[k] in (0..1) && sublist.all{new_list[k+1]-it in (0..1) }){
                sublist.add(new_list[k+1])
            }
            else{
                maxcount=if(sublist.size>maxcount) sublist.size else maxcount
                sublist.clear()
                break
            }
        }
    }
    return maxcount
}


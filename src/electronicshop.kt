fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var keyboards=keyboards.sorted()
    var drives=keyboards.sorted()
    if(keyboards.first()+drives.first()>b)return -1
    var payment=0
    var item_price=keyboards+drives
    item_price=item_price.sortedDescending()
    println(item_price)
    for(i in item_price){
        if(payment+i<b){
            payment+=i
        }

    }
    return payment
}

fun MoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {

    var money=-1//urunler satin alinamazsa
    for(k in keyboards){
        for(d in drives){
            if(k+d<=b){
                money=if(k+d>money) k+d else money
            }
        }
    }
    return money
}
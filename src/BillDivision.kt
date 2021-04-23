fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    //k->yemedigi
    //b->verdigi para
    var copyArray=bill.copyOf()
    copyArray[k]=0
    var pay_bill=b-copyArray.sum()/2
    if(pay_bill>0){
        println(pay_bill)
    }
    else{
        println("Bon Appetit")
    }

}
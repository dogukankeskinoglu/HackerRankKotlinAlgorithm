fun birthdayCakeCandles(candles: Array<Int>): Int {
    var max_value=candles.max()
    return candles.count{it==max_value}

}
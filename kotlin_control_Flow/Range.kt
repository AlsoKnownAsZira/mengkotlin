fun main(){
    var range1 =  1..5
    println(range1)
    println(range1.step)
    range1.forEach{
        print("$it")

    }
    print("\n")
    var range2 = 1.rangeTo(10) step 2
    range2.forEach{
        print("$it")
    }
    println("")
    range2 = 50.downTo(1) step 5
    range2.forEach {
        print("$it\t")
    }
println("\n\n")
    var input1 = 100
    val range3 = 10.downTo(1)
    if(input1 in range3){
        println("Value $input1 is in range")
    }else{
        println(" $input1 NOT in range! the range is $range3")
    }

    val range4 = 1.rangeTo(20) step 2
    for( i in range4){
        println("VALUE= $i")
    }




}
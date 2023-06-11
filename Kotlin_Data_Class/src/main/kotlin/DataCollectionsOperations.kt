fun main (){
    // map() membuat collections baru sesuai perintah
    val numberList = listOf(1,2,3,4,5)
    val numberListX5 = numberList.map{it*10}
    println("numberlist multiplied by 5: $numberListX5")

    // count() menghitung isi collections
    val customers = setOf<String>("Alex","Brendon","Chris","Darwin")
    println("Customer count: "+customers.count())

    //filter() menyaring nilai yang ditentukan
    val Score = listOf(70,72,74,75,80,87,92,89,69,85)
    val nilaiA = Score.filter { it>=89 }
    println(nilaiA)
    val dibawahA = Score.filterNot { it>=89 }
    println(dibawahA)

    //find() mencari nilai
    println("First odd score: "+Score.find { it % 2 !=0  })

// sum() menghitung total
    val age = listOf(5,10,15)
    println("total age: "+age.sum())
 // sorted() untuk ascending dan sorted.Descending()
    val names = listOf("Albert","Brooke","Zlatan","Lambert")
    println("Names Ascending: "+names.sorted())
    println("Names Descending: "+names.sortedDescending())
}
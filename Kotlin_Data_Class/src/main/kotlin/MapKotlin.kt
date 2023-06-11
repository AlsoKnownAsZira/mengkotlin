fun main(){
    //Map menyimpan dengan format key to value
    // untuk bisa akses value, diperlukan suatu key
/*
untuk deklarasi bisa memakai
 val map1 = mapOf("Key1" to "Value1", "Key2" to "Value2", "Key3" to "Value3")
 atau dengan menunjukkan tipe dari key dan value
 map2  = mapOf<Int,String>(1 to "Value1", 2 to "Value2", 3 to "Value3")
 */
    val cars = mapOf(
    "BRZ" to "Subaru",
        "Civic" to "Honda",
        "911" to "Porsche"
    )
// mengakses value dengan key
    println(cars.getValue("BRZ"))
    println(cars["911"])
    // print semua keys
    println(cars.keys)
    // print semua value
    println(cars.values)

    // mutable map
    val motorcycles = mutableMapOf(
        "GSX" to "Suzuki"
    )
    motorcycles.put("KLX","Honda")
    println(motorcycles.getValue("KLX"))
}
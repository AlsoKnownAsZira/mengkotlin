
fun main() {
    // membuat data class
    data class Pengguna(val username: String, val id: Int)

    val user1 = Pengguna("Ziraaa", 784)
    val user2 = Pengguna("Momo", 651)
    val user99 = Pengguna("mini", 441)
    println("User 99 : $user99")
    println("User 1 = $user1")
    println("User 2 = $user2")
    // fungsi equals
    println("User 1 equals user 2: " + user1.equals(user2))
    // fungsi copy
    val user3 = user1.copy()
    println("User 3 equals user 1(with copy): " + (user3 == user1))
    val user4 = user1.copy(id = 111)
    println("User 4 copy user 1 with different id $user4 ")

}

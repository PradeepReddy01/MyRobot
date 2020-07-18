import java.util.*

fun main(){
    var rob_obj = Robot("JARVIS")
    println("Hi I'm JARVIS")
    while(true) {
        println("\nWhat do you want me to do? \nPress \n1. To set Alaram \n2. To Make Coffee \n3. To Heat Water \n4. To Pack Bags \n5. To Cook Food \n6. To Iron your clothes \nPRESS 0 to SHUTDOWN")
        var sc = Scanner(System.`in`)
        var ch = sc.nextInt()
        when (ch) {
            1 -> {
                println("At What Tym do you want to set Alarm(24 Hr Format)?:")
                var time = sc.nextFloat()
                rob_obj.ring_alaram(time)
            }
            2 -> {
                println("How do want your Coffee \n Press `B` for BLACK Coffee or `M` for White Milk")
                var type = readLine().toString()
                println("How many sugar cubes?")
                var sugar_cubes = sc.nextInt()
                rob_obj.make_coffee(type, sugar_cubes)
            }
            3 -> {
                println("At what temperature do you want to heat?")
                var temp = sc.nextDouble()
                rob_obj.heat_water(temp)
            }
            4 -> {
                println("Enter what books you need in this week?")
                var days = mutableListOf("MON", "TUE", "WED", "THUR", "FRI")
                var books: MutableList<String> = mutableListOf<String>()
                for (i in 0..4) {
                    books.add(readLine().toString())
                }
                rob_obj.pack_bag(days, books)
            }
            5 -> {
                var breakfast = arrayOf("Idli", "Puri", "Dosa", "Burger", "Pizza")
                var lunch = arrayOf("Pasta", "Potato curry", "Brinjal curry", "Chicken Biryani")
                val random = Random()
                fun rand(from: Int, to: Int) = random.nextInt(to-from+1)+from
                var selected_b = breakfast[rand(0,(breakfast.size)-1)]
                var selected_l = lunch[rand(0,(lunch.size)-1)]
                rob_obj.cook(selected_b, selected_l)
            }
            6 -> rob_obj.iron_clothes()
            0 -> {
                println("\nGoodBye! Signing OFF JARVIS.")
                System.exit(0)
            }
        }
    }
}

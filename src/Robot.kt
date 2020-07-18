class Robot(var name: String) {
    fun ring_alaram(time: Float){
        if(time < 12) {
            println("Your alarm is set at $time AM")
        }
        else{
            println("DONE! The Alaram is Set at $time PM")
        }

    }
    fun make_coffee(type: String, sugar_cubes: Int){
        var coff = Coffee(sugar_cubes)
        if(type == "B" || type == "b"){
            coff.cof_ready1()
        }
        else if(type == "M" || type == "m"){
            coff.cof_ready2()
        }
    }
    fun heat_water(temp: Double){
        println("<------- DONE! Hot water is ready at $temp C ------->")
    }
    fun pack_bag(days: MutableList<String>, books: MutableList<String>){
        for(i in 0..4){
            println(days[i]+ " -> " +books[i])
        }
        println("<------- DONE! Your Bag is Packed --------->")
    }
    fun cook(bf: String, lun: String){
        println("What you want to do? \n Press `B` for Breakfast or `L` to do LUNCH")
        var sel = readLine().toString()
        if(sel == "B" || sel == "b"){
            println("<--------- DONE! Your Breakfast $bf is Ready! ----------->")
        }
        else if(sel == "L" || sel == "l"){
            println("<--------- DONE! Your Lunch $lun is Ready! ------------>")
        }
    }
    fun iron_clothes(){
        println("<------- DONE! Your Clothes are ironed ---------->")
    }

}
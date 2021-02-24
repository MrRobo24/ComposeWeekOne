package com.example.androiddevchallenge

class Data {

    companion object {
        var curr: PuppyModel? = null
    }

    fun populateData(): ArrayList<PuppyModel> {
        val puppies = arrayListOf<PuppyModel>()
        puppies.add(PuppyModel("Raj", "Brown Dog", "Brown", 4))
        puppies.add(PuppyModel("Amit", "Black Dog", "Black", 2))
        puppies.add(PuppyModel("Luke", "Lucky Dog", "Grey", 5))
        puppies.add(PuppyModel("Fluke", "Black Dog", "Black", 2))
        puppies.add(PuppyModel("Milky", "Grey Dog", "Grey", 2))
        puppies.add(PuppyModel("Snowy", "White Dog", "White", 6))

        return puppies
    }
}
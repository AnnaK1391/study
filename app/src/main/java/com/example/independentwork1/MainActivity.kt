package com.example.independentwork1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var Zebra: zebra = zebra("черные и белые полоски", "трава")
    var Giraffe: giraffe = giraffe("рыжий с коричневыми пятнами", "листья деревьев")
    var Herbivores = mutableListOf(Zebra, Giraffe)

    var Lion: lion = lion("рыжий", "мясо")
    var Hyana: hyana = hyana("серый", "падаль")
    var Carnivores = mutableListOf(Lion, Hyana)
    println(Herbivores)
    println(Carnivores)
}
package com.example.atividade_rgb

import android.graphics.Color
import kotlin.random.Random

class Cores {

    private var corRGB: ArrayList<Int>

    constructor(){
        this.corRGB = arrayListOf()
        this.setCorRGB()
    }

    public fun getCorRGB(): ArrayList<Int>{
        return this.corRGB
    }

    public fun setCorRGB(){

        while (corRGB.size < 3){
            corRGB.add(Random.nextInt(0,256))
        }
    }

    override fun toString(): String {
        return this.corRGB.toString()
    }




}
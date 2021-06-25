package com.example.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvfibonacci=findViewById<RecyclerView>(R.id.rvfibonacci)
        rvfibonacci.layoutManager=LinearLayoutManager(baseContext)
        var namesAdapter= NumberRecyclerView(sequence(100))
        rvfibonacci.adapter=namesAdapter
    }
    fun sequence( num:Int):List<BigInteger>{
        var numList= MutableList<BigInteger>(num,{BigInteger.ZERO })
        var num1=BigInteger.ZERO
        var num2=BigInteger.ONE
        numList[0]=num1
        numList[1]=num2
        for (i in 1..num){
            var sum=num1+num2
            num1=num2
            num2=sum
            numList[i-1]=num1
        }
        return numList
    }

    }

package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class KotlinFilePrinterKt{
    fun readFile(){
        val currentFile = File(".")
        val file = File (currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    //try with resource
    fun readFile(path: String){
        BufferedReader(FileReader(path)).use {reader ->
            println(reader.readLine())
        }
    }
}
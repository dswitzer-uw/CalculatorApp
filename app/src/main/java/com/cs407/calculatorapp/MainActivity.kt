package com.cs407.calculatorapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val editTextNumber1 = findViewById<EditText>(R.id.editTextNumber1)
        val editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        val buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
        val buttonDivide = findViewById<Button>(R.id.buttonDivide)

        buttonAdd.setOnClickListener{
            val num1 = editTextNumber1.text.toString().toIntOrNull()
            val num2 = editTextNumber2.text.toString().toIntOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 + num2
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_MESSAGE", "Result: $result")
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
        buttonSubtract.setOnClickListener{
            val num1 = editTextNumber1.text.toString().toIntOrNull()
            val num2 = editTextNumber2.text.toString().toIntOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 - num2
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_MESSAGE", "Result: $result")
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
        buttonMultiply.setOnClickListener{
            val num1 = editTextNumber1.text.toString().toIntOrNull()
            val num2 = editTextNumber2.text.toString().toIntOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 * num2
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_MESSAGE", "Result: $result")
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
        buttonDivide.setOnClickListener{
            val num1 = editTextNumber1.text.toString().toIntOrNull()
            val num2 = editTextNumber2.text.toString().toIntOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 / num2
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_MESSAGE", "Result: $result")
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
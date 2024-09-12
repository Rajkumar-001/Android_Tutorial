package com.example.MyFirstApp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate((savedInstanceState))
        enableEdgeToEdge();
        setContentView(R.layout.activity_main);

        var username=findViewById<EditText>(R.id.editTextName);
        var output=findViewById<Switch>(R.id.switchTheme);

        var btn=findViewById<Button>(R.id.buttonSubmit);

        btn.setOnClickListener{
            var a=username.text.toString()
            output.text="My User name is "+a;
        }



    }


    override fun onStart() {
        super.onStart()
        val toast=Toast.makeText(applicationContext,"onStart Called",Toast.LENGTH_LONG);
        toast.show()
    }

    override fun onRestart() {
        super.onRestart()
        val toast=Toast.makeText(this,"onRestart Called",Toast.LENGTH_LONG);
        toast.show()
    }

    override fun onPause() {
        super.onPause()
        val toast=Toast.makeText(applicationContext,"onPause Called",Toast.LENGTH_LONG);
        toast.show()

    }

    override fun onResume() {
            super.onResume()
        val toast=Toast.makeText(applicationContext,"onresume Called",Toast.LENGTH_LONG);
        toast.show();

    }

    override fun onStop() {
        super.onStop()
        val toast=Toast.makeText(applicationContext,"onStop Called",Toast.LENGTH_LONG);
        Log.d("MainActivity","onStopCalled");
        toast.show();
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast=Toast.makeText(applicationContext,"onDestroy Called",Toast.LENGTH_LONG);
        toast.show()


    }

}
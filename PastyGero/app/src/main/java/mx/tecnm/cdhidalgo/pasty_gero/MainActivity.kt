package mx.tecnm.cdhidalgo.pasty_gero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textUsuario:EditText
    private lateinit var textPassword:EditText
    private lateinit var registro:TextView
    private lateinit var buttonInicio:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textUsuario=findViewById(R.id.textUsuario)
        textPassword=findViewById(R.id.textPassword)
        registro=findViewById(R.id.registro)
        buttonInicio=findViewById(R.id.buttonInicio)
        buttonInicio.setOnClickListener{
            login()
        }
        registro.setOnClickListener {
            nuevoUsuario()

        }
    }

    private fun login() {
        if ((textUsuario.text.toString() == "pastigero@gmail") && (textPassword.text.toString() == "12345")){
            startActivity(Intent(this, Principal::class.java))
        }
    }
    private fun nuevoUsuario(){
        startActivity(Intent(this, Registros::class.java))
    }

}
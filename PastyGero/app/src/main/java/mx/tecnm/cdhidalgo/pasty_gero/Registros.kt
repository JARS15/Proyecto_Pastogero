package mx.tecnm.cdhidalgo.pasty_gero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Registros : AppCompatActivity() {
    private lateinit var textoNombre:EditText
    private lateinit var textoApellido:EditText
    private lateinit var textCorreo:EditText
    private lateinit var textPasswordRegistro:EditText
    private lateinit var botonGuardar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registros)
        textoNombre=findViewById(R.id.textNombre)
        textoApellido=findViewById(R.id.textoApellido)
        textCorreo=findViewById(R.id.textCorreo)
        textPasswordRegistro=findViewById(R.id.textPasswordRegistro)
        botonGuardar=findViewById(R.id.botonGuardar)
        botonGuardar.setOnClickListener{
            guardarRegistro()
        }
    }

    private fun guardarRegistro() {
        if ((textoNombre.text.toString() == "Alonso") && (textoApellido.text.toString() == "Rios") &&
            (textCorreo.text.toString()=="pastigero") && (textPasswordRegistro.text.toString()=="12345")){
            startActivity(Intent(this, Principal::class.java))
        }
    }


}
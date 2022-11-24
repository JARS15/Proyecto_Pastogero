package mx.tecnm.cdhidalgo.pasty_gero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Notificaciones : AppCompatActivity() {


    private lateinit var buttonRegresoDeNotificaciones: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notificaciones)
        buttonRegresoDeNotificaciones=findViewById(R.id.buttonRegresoNotificaciones)


        buttonRegresoDeNotificaciones.setOnClickListener{
            regresar()
        }
    }

    private fun regresar() {
        startActivity(Intent(this,Principal::class.java))
    }
}
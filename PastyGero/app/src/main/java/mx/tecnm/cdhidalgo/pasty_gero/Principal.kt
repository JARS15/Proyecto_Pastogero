package mx.tecnm.cdhidalgo.pasty_gero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {
private lateinit var alerta:Button
private lateinit var alarmaUno:Button
private lateinit var alarmaDos:Button
private lateinit var alarmaTres:Button
private lateinit var alarmaCuatro:Button
private lateinit var alarmaCinco:Button
private lateinit var alarmaSeis:Button
private lateinit var alarmaSiete:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        alerta=findViewById(R.id.alertas)
        alarmaUno=findViewById(R.id.alarma1)
        alarmaDos=findViewById(R.id.alarma2)
        alarmaTres=findViewById(R.id.alarma3)
        alarmaCuatro=findViewById(R.id.alarma4)
        alarmaCinco=findViewById(R.id.alarma5)
        alarmaSeis=findViewById(R.id.alarma6)
        alarmaSiete=findViewById(R.id.alarma7)

        alerta.setOnClickListener{
            notificaciones()
        }

    }

    private fun notificaciones() {
        startActivity(Intent(this,Notificaciones::class.java))
    }


}
package mx.tecnm.cdhidalgo.pasty_gero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TimePicker


class Reloj_Alarma : AppCompatActivity() {

    private lateinit var timePicker: TimePicker
    private lateinit var buttonDeToma:Button
    private lateinit var buttonRegreso:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reloj_alarma)

        timePicker=findViewById(R.id.relojAlarma)
        buttonDeToma=findViewById(R.id.buttonToma)
        buttonRegreso=findViewById(R.id.buttonRegreso)


        buttonDeToma.setOnClickListener{
            guardarToma()
        }

        buttonRegreso.setOnClickListener{
            regresar()
        }

       // timePicker.setOnTimeChangedListener { timePicker, i, i2 -> textView.setText(timePicker) }
        //timePicker.setOnTimeChangedListener((view,hourOfDay,minute)->
        //textView.setText(houreOfDay+":"+minute))

        //timePicker.setOnTimeChangedListener(view, hourOfDay,minute) -> textView.setText(hourOfDay+":" + minutes)
            }

    private fun regresar() {
        startActivity(Intent(this,Principal::class.java))
    }

    private fun guardarToma() {
        startActivity(Intent(this,Principal::class.java))
    }
}


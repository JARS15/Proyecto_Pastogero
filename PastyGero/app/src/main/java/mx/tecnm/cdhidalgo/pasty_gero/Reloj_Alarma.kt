package mx.tecnm.cdhidalgo.pasty_gero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.TimePicker


class Reloj_Alarma : AppCompatActivity() {

    private lateinit var timePicker: TimePicker
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reloj_alarma)

        timePicker=findViewById(R.id.relojAlarma)
        textView=findViewById(R.id.textoDeHora)

       // timePicker.setOnTimeChangedListener { timePicker, i, i2 -> textView.setText(timePicker) }
        //timePicker.setOnTimeChangedListener((view,hourOfDay,minute)->
        //textView.setText(houreOfDay+":"+minute))

        //timePicker.setOnTimeChangedListener(view, hourOfDay,minute) -> textView.setText(hourOfDay+":" + minutes)
            }
}


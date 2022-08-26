package mx.tec.a2022_itesm_02_02_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        val myTxtNombre  = findViewById<TextView>(R.id.textView4)
        val myNumEdad  = findViewById<TextView>(R.id.textView6)
        val botonRegresar = findViewById<Button>(R.id.button2)

        var myExtras : Bundle? = intent.extras

        var nombreRecibido : String = myExtras?.getString("keyNombre")?:"NoName"
        var edadRecibida : Int = myExtras?.getInt("keyEdad")?:-1

        myTxtNombre.text = nombreRecibido
        myNumEdad.text = edadRecibida.toString()

        botonRegresar.setOnClickListener {

            val myIntent : Intent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }

        Log.d("MYAPP", "Fin de la ejecución de onCreate de TargetActivity")
    }

    override fun onStart() {
        Log.d("MYAPP", "Fin de la ejecución de onStart de TargetActivity")
        super.onStart()
    }

    override fun onResume() {
        Log.d("MYAPP", "Fin de la ejecución de onResume de TargetActivity")
        super.onResume()
    }

    override fun onRestart() {
        Log.d("MYAPP", "Fin de la ejecución de onRestart de TargetActivity")
        super.onRestart()
    }

    override fun onPause() {
        Log.d("MYAPP", "Fin de la ejecución de onPause de TargetActivity")
        super.onPause()
    }

    override fun onStop() {
        Log.d("MYAPP", "Fin de la ejecución de onStop de TargetActivity")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("MYAPP", "Fin de la ejecución de onDestroy de TargetActivity")
        super.onDestroy()
    }
}
package com.cabello.franco.laboratoriocalificado02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cabello.franco.laboratoriocalificado02.databinding.ActivityEjercicio02Binding

class Ejercicio02Activity : AppCompatActivity() {
    private lateinit var b: ActivityEjercicio02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityEjercicio02Binding.inflate(layoutInflater)
        setContentView(b.root)

        // Valida que todos los campos no estén vacíos
        fun validar(): Boolean {
            return listOf(
                b.etNombre, b.etNumero, b.etProductos,
                b.etCiudad, b.etDireccion
            ).all { it.text.isNotBlank() }
        }

        b.btnRegistrar.setOnClickListener {
            if (!validar()) {
                Toast.makeText(this, "Complete todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            // Intent explícito a PedidoActivity con extras
            val intent = Intent(this, PedidoActivity::class.java).apply {
                putExtra("nombre", b.etNombre.text.toString())
                putExtra("numero", b.etNumero.text.toString())
                putExtra("productos", b.etProductos.text.toString())
                putExtra("ciudad", b.etCiudad.text.toString())
                putExtra("direccion", b.etDireccion.text.toString())
            }
            startActivity(intent)
        }

        b.btnLlamar.setOnClickListener {
            Toast.makeText(
                this,
                "Llamando a ${b.etNombre.text}: ${b.etNumero.text}",
                Toast.LENGTH_LONG
            ).show()
        }
        b.btnWhatsApp.setOnClickListener {
            Toast.makeText(
                this,
                "Hola ${b.etNombre.text} Tus productos: ${b.etProductos.text} están en camino a la dirección: ${b.etDireccion.text}",
                Toast.LENGTH_LONG
            ).show()
        }
        b.btnMaps.setOnClickListener {
            Toast.makeText(
                this,
                "Ubicación: ${b.etDireccion.text}, ${b.etCiudad.text}",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}

package com.cabello.franco.laboratoriocalificado02

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cabello.franco.laboratoriocalificado02.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {
    private lateinit var b: ActivityPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityPedidoBinding.inflate(layoutInflater)
        setContentView(b.root)

        val nombre    = intent.getStringExtra("nombre")    ?: ""
        val numero    = intent.getStringExtra("numero")    ?: ""
        val productos = intent.getStringExtra("productos") ?: ""
        val ciudad    = intent.getStringExtra("ciudad")    ?: ""
        val direccion = intent.getStringExtra("direccion") ?: ""

        b.tvNombrePedido.text    = nombre
        b.tvNumeroPedido.text    = numero
        b.tvProductosPedido.text = productos
        b.tvUbicacionPedido.text = "$ciudad, $direccion"

        // Botones inferiores
        b.btnLlamar2.setOnClickListener {
            Toast.makeText(this, "Llamando a $nombre: $numero", Toast.LENGTH_LONG).show()
        }
        b.btnWhats2.setOnClickListener {
            Toast.makeText(
                this,
                "Hola $nombre Tus productos: $productos están en camino a la dirección: $direccion",
                Toast.LENGTH_LONG
            ).show()
        }
        b.btnMaps2.setOnClickListener {
            Toast.makeText(this, "Ubicación: $direccion, $ciudad", Toast.LENGTH_LONG).show()
        }
    }
}

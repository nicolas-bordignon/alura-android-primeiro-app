package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "BEm vindo(a ao Orgs!", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(title = "Teste",
                descricao = "Teste Desc",
                valor = BigDecimal("19.99")
            ),
            Produto(title = "Teste2",
                descricao = "Teste2 Desc",
                valor = BigDecimal("192.99")
            ),
            Produto(title = "Teste3",
                descricao = "Teste 3Desc",
                valor = BigDecimal("139.99")
            ),
        ))
    }
}
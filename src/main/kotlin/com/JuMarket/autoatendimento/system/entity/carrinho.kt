package com.JuMarket.autoatendimento.system.entity

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "Carrinho")
data class carrinho(

    var qtde_Produtos: Int = 0,
    var NomeProdutos: String = "",
    var PrecoUnit: Long = 0,
    var TotalCompra: Long = 0,
    @ManyToOne val customer: Customer? = null,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
)
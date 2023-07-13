package com.JuMarket.autoatendimento.system.entity

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "categoriaproduto")
data class categoriaProduto(

    var NomeCategoria: String = "",
    @ManyToOne val customer: Customer? = null,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null

)

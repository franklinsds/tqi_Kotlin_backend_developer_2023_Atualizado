package com.JuMarket.autoatendimento.system.entity

import jakarta.persistence.*


@Entity
@Table(name = "customer")
data class Customer(
    @Column(nullable = false) var firstName: String = "",
    @Column(nullable = false) var lastName: String = "",
    @Column(nullable = false, unique = true) var email: String = "",
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
    @Column(nullable = false) @OneToMany(fetch = FetchType.LAZY, cascade = arrayOf(CascadeType.REMOVE, CascadeType.PERSIST), mappedBy = "customer") var categoriaProdutos: List<categoriaProduto> = mutableListOf(),
    @Column(nullable = false) @OneToMany(fetch = FetchType.LAZY, cascade = arrayOf(CascadeType.REMOVE, CascadeType.PERSIST),
    mappedBy = "customer") var produtos: List<produto> = mutableListOf(),
    @Column(nullable = false)  @OneToMany(fetch = FetchType.LAZY, cascade = arrayOf(CascadeType.REMOVE, CascadeType.PERSIST),
        mappedBy = "customer") var carrinhos: List<carrinho> = mutableListOf()
)






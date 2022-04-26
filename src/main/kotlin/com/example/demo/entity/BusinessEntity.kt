package com.example.demo.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table
class BusinessEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var businessId:Long?=1
    open var name:String? = null
    open var description: String?=null

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "business")
    open var businessman: PersonEntity? = null

    constructor(businessId: Long?, name: String?, description: String?, businessman: PersonEntity?) {
        this.businessId = businessId
        this.name = name
        this.description = description
        this.businessman = businessman
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }
}
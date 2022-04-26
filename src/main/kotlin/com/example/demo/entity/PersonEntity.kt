package com.example.demo.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table
open class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var personId: Long? = null
    open var name:String? = null
    open var surName: String? = null
    open var age:Long?=null
    open var country: String? = null
    open var city:String?=null
    open var phoneNumber: String? = null
    open var descriptionStatus: String? = null

    @OneToOne(fetch = FetchType.LAZY)
    open var business:BusinessEntity? = null

    @ManyToMany
    open val friends: MutableList<PersonEntity>? = null

    constructor(
        personId: Long?,
        name: String?,
        surName: String?,
        age: Long?,
        country: String?,
        city: String?,
        phoneNumber: String?,
        descriptionStatus: String?,
        business: BusinessEntity?
    ) {
        this.personId = personId
        this.name = name
        this.surName = surName
        this.age = age
        this.country = country
        this.city = city
        this.phoneNumber = phoneNumber
        this.descriptionStatus = descriptionStatus
        this.business = business
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
package com.example.demo.entity

import com.example.demo.PersonRepo
import javax.persistence.*

@Entity
@Table
open class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null
    open var name:String? = null
    open var surName: String? = null
    open var age:Long?=null
    open var country: String? = null
    open var city:String?=null
    open var phoneNumber: String? = null
    open var descriptionStatus: String? = null

    @ManyToMany
    open val friends: MutableList<PersonEntity>? = null

    constructor(
        id: Long?,
        name: String?,
        surName: String?,
        age: Long?,
        country: String?,
        city: String?,
        phoneNumber: String?,
        descriptionStatus: String?
    ) {
        this.id = id
        this.name = name
        this.surName = surName
        this.age = age
        this.country = country
        this.city = city
        this.phoneNumber = phoneNumber
        this.descriptionStatus = descriptionStatus
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
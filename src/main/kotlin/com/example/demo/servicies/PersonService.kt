package com.example.demo.servicies

import com.example.demo.entity.BusinessEntity
import com.example.demo.entity.PersonEntity

interface PersonService {

    fun createPerson(personEntity: PersonEntity)
    fun updatePerson(personEntity: PersonEntity)
    fun deletePerson(id: Long)
    fun getPersonById(id: Long):PersonEntity
    fun getAllPerson():List<PersonEntity>
    fun addFriend(personId:Long, myId:Long)
    fun deleteFriend(personId: Long, myId: Long)
    fun createBusiness(myId: Long, businessEntity: BusinessEntity)
}
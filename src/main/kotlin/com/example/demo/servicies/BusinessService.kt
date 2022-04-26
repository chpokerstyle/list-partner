package com.example.demo.servicies

import com.example.demo.entity.BusinessEntity

interface BusinessService {

    fun create(businessEntity: BusinessEntity)
    fun edit(businessEntity: BusinessEntity)
    fun delete(businessId: Long)
    fun getAllBusiness():List<BusinessEntity>
    fun getBusinessById(businessId: Long):BusinessEntity
    fun getBusinessByPerson(personService: PersonService):BusinessEntity
}
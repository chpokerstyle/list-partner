package com.example.demo.servicies

import com.example.demo.entity.BusinessEntity
import com.example.demo.repositories.BusinessRepo
import org.springframework.stereotype.Service
import java.util.*

@Service
class BusinessServiceImpl(private val businessRepo: BusinessRepo):BusinessService {
    override fun create(businessEntity: BusinessEntity) {
        businessRepo.save(businessEntity)
    }

    override fun edit(businessEntity: BusinessEntity) {
        businessRepo.save(businessEntity)
    }

    override fun delete(businessId: Long) {
        TODO("Not yet implemented")
    }

    override fun getAllBusiness(): MutableList<BusinessEntity> {
        return businessRepo.findAll()
    }

    override fun getBusinessById(businessId: Long): BusinessEntity {
        TODO("Not yet implemented")
    }

    override fun getBusinessByPerson(personService: PersonService): BusinessEntity {
        TODO("Not yet implemented")
    }
}
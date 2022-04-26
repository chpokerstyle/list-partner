package com.example.demo.repositories

import com.example.demo.entity.BusinessEntity
import com.example.demo.entity.PersonEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PersonRepo: JpaRepository<PersonEntity, Long> {

    fun getByBusiness(business: BusinessEntity): PersonEntity

}
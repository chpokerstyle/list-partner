package com.example.demo.repositories

import com.example.demo.entity.BusinessEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BusinessRepo:JpaRepository<BusinessEntity, Long> {
}
package com.example.demo

import com.example.demo.entity.PersonEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepo: JpaRepository<PersonEntity, Long> {
}
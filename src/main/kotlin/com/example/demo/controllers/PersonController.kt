package com.example.demo.controllers

import com.example.demo.entity.BusinessEntity
import com.example.demo.entity.PersonEntity
import com.example.demo.servicies.BusinessService
import com.example.demo.servicies.PersonService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

@RestController
@RequestMapping("person")
class PersonController(private val service: PersonService,
                       private val businessService: BusinessService) {
    val counter = AtomicLong()
    @GetMapping("all")
    fun getAllPersons() = service.getAllPerson()

    @PostMapping("create")
    fun createPerson(@RequestBody personEntity: PersonEntity): ResponseEntity<HttpStatus> {
        if(personEntity!=null) {
            service.createPerson(personEntity)
            return ResponseEntity.ok(HttpStatus.OK)
        }
        return ResponseEntity.badRequest().build()
    }

    @PostMapping("add/{personId}/{myId}")
    fun addFriend(@PathVariable personId: Long,@PathVariable myId:Long){
        service.addFriend(personId, myId)
    }

    @PostMapping("/delete/{myId}/{friendId}")
    fun deleteFriend (@PathVariable personId: Long,@PathVariable myId:Long){
        service.deleteFriend(personId, myId)
    }

    @PostMapping("create-business/{myId}")
    fun createBusiness(@PathVariable myId: Long, @RequestBody businessEntity: BusinessEntity){
        service.createBusiness(myId, businessEntity)
    }

    @GetMapping("business")
    fun getAllBusiness(): List<BusinessEntity> {
        return businessService.getAllBusiness()
    }

}
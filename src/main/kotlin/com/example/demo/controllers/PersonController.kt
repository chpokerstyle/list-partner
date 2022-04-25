package com.example.demo.controllers

import com.example.demo.dto.PersonDto
import com.example.demo.entity.PersonEntity
import com.example.demo.servicies.PersonService
import com.fasterxml.jackson.annotation.JsonValue
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.websocket.server.PathParam

@RestController
@RequestMapping("person")
class PersonController(private val service: PersonService) {

    @GetMapping("all")
    fun getAllPersons() = service.getAllPerson()

    @PostMapping("create/")
    fun createPerson(@RequestBody personEntity: PersonEntity): ResponseEntity<HttpStatus> {
        if(personEntity!=null) {
            service.createPerson(personEntity)
            return ResponseEntity.ok(HttpStatus.OK)
        }
        return ResponseEntity.ok(HttpStatus.BAD_REQUEST)
    }

    @PostMapping("add/{personId}/{myId}")
    fun addFriend(@PathVariable personId: Long,@PathVariable myId:Long){
        service.addFriend(personId, myId)
    }

    @PostMapping("/delete/{myId}/{friendId}")
    fun deleteFriend (@PathVariable personId: Long,@PathVariable myId:Long){
        service.deleteFriend(personId, myId)
    }
}
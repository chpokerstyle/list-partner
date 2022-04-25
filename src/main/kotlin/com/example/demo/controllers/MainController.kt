package com.example.demo.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.RequestEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.websocket.server.PathParam

@RestController
@RequestMapping("hello/")
class MainController {

    @GetMapping("{name}/{age}")
    fun main(@PathVariable name:String, @PathVariable age:String): ResponseEntity<Any> {
        return ResponseEntity.ok("Hello, $name! You $age age?")
    }

}
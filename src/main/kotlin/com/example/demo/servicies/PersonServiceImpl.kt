package com.example.demo.servicies

import com.example.demo.PersonRepo
import com.example.demo.entity.PersonEntity
import org.springframework.stereotype.Service

@Service
class PersonServiceImpl(private val personRepo: PersonRepo):PersonService {
    override fun createPerson(personEntity: PersonEntity) {
        personRepo.save(personEntity)
    }

    override fun updatePerson(personEntity: PersonEntity) {
        personRepo.save(personEntity)
    }

    override fun deletePerson(id: Long) {
        personRepo.deleteById(id)
    }

    override fun getPersonById(id: Long): PersonEntity {
        return personRepo.getById(id)
    }

    override fun getAllPerson():List<PersonEntity> {
        return personRepo.findAll()
    }

    override fun addFriend(personId: Long, myId: Long) {
        var me = personRepo.getById(myId)
        var friend = personRepo.getById(personId)

        me.friends!!.add(friend)
        personRepo.save(me)
    }

    override fun deleteFriend(personId: Long, myId: Long){
        var me = personRepo.getById(myId)
        var friend = personRepo.getById(personId)

        me.friends!!.remove(friend)
        personRepo.save(me)
    }
}
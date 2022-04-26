package com.example.demo.servicies

import com.example.demo.entity.BusinessEntity
import com.example.demo.repositories.PersonRepo
import com.example.demo.entity.PersonEntity
import com.example.demo.repositories.BusinessRepo
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping

@Service
class PersonServiceImpl(private val personRepo: PersonRepo,
                        private val businessService: BusinessService,
                        private val businessRepo: BusinessRepo
                        ):PersonService {
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

    override fun createBusiness(myId: Long, businessEntity: BusinessEntity) {
            //код работает, но зацикливается
        var person = personRepo.getById(myId)
        person.business = businessEntity
        businessRepo.save(businessEntity)
        personRepo.save(person)
        businessEntity.businessman = person

//        var person = personRepo.getById(myId)
//        person.business = businessEntity
//        businessRepo.save(businessEntity)
//        personRepo.save(person)
//        businessEntity.businessman = person
//        businessService.edit(businessEntity)
    }


}
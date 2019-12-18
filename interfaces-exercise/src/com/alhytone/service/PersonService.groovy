package com.alhytone.service

import com.alhytone.domain.Person

class PersonService implements IPersonService{

    @Override
    Person find() {
        Person p = new Person(first:"Aleksi", last:"Hytonen")
        return p
    }

    @Override
    List<Person> findAll() {
        Person p1 = new Person(first:"Aleksi", last:"Hytonen")
        Person p2 = new Person(first:"Erkki", last:"Esimerkki")
        [p1, p2]
    }
}

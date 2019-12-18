package com.alhytone.service

import com.alhytone.domain.Person

interface IPersonService {
    Person find()
    List<Person> findAll()
}

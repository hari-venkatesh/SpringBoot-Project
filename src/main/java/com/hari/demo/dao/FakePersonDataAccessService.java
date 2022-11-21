package com.hari.demo.dao;

import com.hari.demo.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDataAccessService implements PersonDao{
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public int addPerson(Person person) {
        return PersonDao.super.addPerson(person);
    }
}

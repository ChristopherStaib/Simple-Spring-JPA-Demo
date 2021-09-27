package com.example.jpademo.controller;

import java.util.List;

import com.example.jpademo.dao.PersonRepo;
import com.example.jpademo.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @Autowired
    PersonRepo repo;

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping("/addPerson")
    public String addPerson(Person person) {
        boolean alreadyExists = repo.existsById(person.getId());
        if (alreadyExists) {
            return "errorPerson.jsp";
        } else {
            repo.save(person);
            return "home.jsp";
        }

    }

    @RequestMapping("/getPerson")
    public ModelAndView getPerson(@RequestParam int id) {

        ModelAndView mv = new ModelAndView("showPerson.jsp");
        Person person = repo.findById(id).orElse(null);
        mv.addObject(person);
        return mv;
    }

    @RequestMapping("/updatePerson")
    public ModelAndView updatePerson(@RequestParam int id, @RequestParam String name) {
        ModelAndView mv = new ModelAndView("updatePerson.jsp");
        Person person = repo.findById(id).orElse(null);
        person.setName(name);
        repo.save(person);
        mv.addObject(person);
        return mv;
    }

    @RequestMapping("/deletePerson")
    public ModelAndView deletePerson(@RequestParam int id) {
        ModelAndView mv = new ModelAndView("deletePerson.jsp");
        Person person = repo.findById(id).orElse(null);
        mv.addObject(person);
        repo.delete(person);
        return mv;
    }

    @RequestMapping("/findPerson")
    public ModelAndView findPerson(@RequestParam String name) {
        ModelAndView mv = new ModelAndView("findPerson.jsp");
        List<Person> results = repo.findByName(name);
        mv.addObject("results", results);
        return mv;
    }

}

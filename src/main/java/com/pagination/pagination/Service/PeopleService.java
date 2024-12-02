package com.pagination.pagination.Service;

import com.pagination.pagination.entity.People;
import com.pagination.pagination.repo.dataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PeopleService {

    @Autowired
    private dataRepo dataRepository;

    public void paginationrequest(){
        int pageNo=2;
        int pageSize=3;

        PageRequest of=PageRequest.of(pageNo-1,pageSize);
        Page<People> li= dataRepository.findAll(of);
        List<People> list=li.getContent();

        list.forEach(System.out::println);
    }
    public void getAllPeople(){

        //to get output in ascending or descending order
        Sort s=Sort.by("age").descending();
        List<People> all=dataRepository.findAll(s);
        all.forEach(System.out::println);
    }
    public void saveUsers(){
        People p1 = new People(1, "Raj", 20, "Male", "India");
        People p2 = new People(2, "Anil", 32, "Male", "India");
        People p3 = new People(3, "Sunil", 23, "Male", "India");
        People p4 = new People(4, "John", 24, "Male", "USA");
        People p5 = new People(5, "Robert", 55, "Male", "UK");
        People p6 = new People(6, "Sita", 46, "Fe-Male", "India");
        People p7 = new People(7, "Gita", 27, "Fe-Male", "Japan");
        People p8 = new People(8, "Cathy", 38, "Fe-Male", "Canada");

        List<People> p= Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
        dataRepository.saveAll(p);
    }
}

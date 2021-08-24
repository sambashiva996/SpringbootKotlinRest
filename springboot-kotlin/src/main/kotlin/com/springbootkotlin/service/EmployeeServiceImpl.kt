package com.springbootkotlin.service

import com.springbootkotlin.model.Employee
import com.springbootkotlin.repository.EmployeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class EmployeeServiceImpl: EmployeeService {

    @Autowired
    lateinit var employeeRepository: EmployeeRepository

    override fun saveEmployee(employee: Employee) {
        employeeRepository.save(employee)
    }

    override fun fetchAllEmployees():List<Employee> {
        return employeeRepository.findAll()
    }

    override fun findByEmployeeId(employeeId: Int):Employee {
        return employeeRepository.findById(employeeId).get()
    }


}
package com.springbootkotlin.repository

import com.springbootkotlin.model.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository: JpaRepository<Employee,Int> {

}

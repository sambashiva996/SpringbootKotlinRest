package com.springbootkotlin.service

import com.springbootkotlin.model.Employee

interface EmployeeService{
    fun saveEmployee(employee: Employee)
    fun fetchAllEmployees():List<Employee>
    fun findByEmployeeId(employeeId: Int):Employee
    fun updateEmployee(updateEmployee: Employee): Employee
    fun deleteByEmployeeId(employeeId: Int)
}

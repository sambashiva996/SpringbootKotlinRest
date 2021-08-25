package com.springbootkotlin.controller

import com.springbootkotlin.model.Employee
import com.springbootkotlin.service.EmployeeService
import com.sun.xml.internal.ws.api.ha.StickyFeature
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employee")
class EmployeeController {

    @Autowired
    lateinit var employeeService: EmployeeService

    @PostMapping("/saveEmployee")
    fun saveEmployee(@RequestBody employee: Employee):ResponseEntity<String>{

        employeeService.saveEmployee(employee)

        return ResponseEntity<String>("saved successfully",HttpStatus.CREATED)
    }

    @GetMapping("/fetchAllEmployees")
    fun fetchAllEmployees(): ResponseEntity<List<Employee>>{

        var listOfEmployee = employeeService.fetchAllEmployees()

        return ResponseEntity<List<Employee>>(listOfEmployee,HttpStatus.OK)
    }

    @GetMapping("/findByEmployeeId/{employeeId}")
    fun findByEmployeeId(@PathVariable employeeId: Int):ResponseEntity<Employee>{

        var employeeById = employeeService.findByEmployeeId(employeeId)

        return ResponseEntity<Employee>(employeeById,HttpStatus.OK)
    }

    @PutMapping("/updateEmployee")
    fun updateEmployee(@RequestBody updateEmployee: Employee):ResponseEntity<String>{

        var updateEmployee = employeeService.updateEmployee(updateEmployee)
        return ResponseEntity<String>("updated success with employee id :${updateEmployee.employeeId}",HttpStatus.OK)
    }

    @DeleteMapping("/deleteEmployeeById/{employeeId}")
    fun deleteByEmployeeId(@PathVariable employeeId: Int):ResponseEntity<String>{

        employeeService.deleteByEmployeeId(employeeId)
        return ResponseEntity<String>("Employee Deleted Successfully",HttpStatus.OK)
    }
}
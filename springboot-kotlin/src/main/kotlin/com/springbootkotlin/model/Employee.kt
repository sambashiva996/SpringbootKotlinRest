package com.springbootkotlin.model

import javax.persistence.*

@Entity
@Table(name = "tbl_employee")
data class Employee(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var employeeId:Int,
               var employeeName: String?, var employeeEmail: String?, var employeePhoneNumber: Int,
               var employeeAddress: String?) {
}

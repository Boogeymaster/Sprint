package org.example.lesson1_10.lesson2

fun main() {
    val workerCount = 50
    val workerSalary = 30000
    val internCount = 30
    val internSalary = 20000
    val workerSalarySum = workerCount * workerSalary
    val internSalarySum = internCount * internSalary
    val employeesCount = workerCount + internCount
    val generalSalary = workerSalarySum + internSalarySum
    val averageSalary = generalSalary / employeesCount
    println("Расходы на выплату зарплаты постоянных сотрудников: $workerSalarySum")
    println("Общие расходы по ЗП после прихода стажеров: $generalSalary")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")
}
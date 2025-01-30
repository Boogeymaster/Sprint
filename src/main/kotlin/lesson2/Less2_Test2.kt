package org.example.lesson2

fun main() {
    val workerCount = 50
    val workerSalary = 30000
    val internCount = 30
    val internSalary = 20000
    var workerSalarySum = 0
    var internSalarySum = 0
    val employeesCount = workerCount + internCount
    for(x in 1..workerCount) workerSalarySum += workerSalary
    for(x in 1..internCount) internSalarySum += internSalary
    val generalSalary = workerSalarySum + internSalarySum
    val averageSalary = generalSalary / employeesCount
    println("Расходы на выплату зарплаты постоянных сотрудников: $workerSalarySum")
    println("Общие расходы по ЗП после прихода стажеров: $generalSalary")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")
}
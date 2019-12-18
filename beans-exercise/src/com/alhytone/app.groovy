package com.alhytone

Employee emp = new Employee(first:"Aleksi", last:"Hytonen", email:"hytonenaleksi@gmail.com")
println emp

Employee empl = new Employee()
empl.first = "Aleksi"
println empl.first

empl.fullName = "Aleksi Hytonen"
println empl.fullName

DoubleBean db = new DoubleBean()
db.value = 100
println db.value
println db.@value

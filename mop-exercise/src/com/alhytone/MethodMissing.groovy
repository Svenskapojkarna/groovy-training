package com.alhytone

class MyEmployee{
    def methodMissing(String name, def args){
        if(name != 'someMethod'){
            throw new MissingMethodException(name, args)
        }
        println "Method missing called on: $name"
        println "With arguments ${args}"
    }
}

MyEmployee emp = new MyEmployee()
emp.someMethod(1, 2, 3)
emp.someOtherMethod(4, 5, 6)

package com.alhytone

class Foo{
    def propertyMissing(String name){
        "Caught missing property: $name"
    }
}

println new Foo().bar

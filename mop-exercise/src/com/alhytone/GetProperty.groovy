package com.alhytone

class PropertyTest{
    def prop1 = "prop1"
    def prop2 = "prop2"
    def prop3 = "prop3"

    def getProperty(String name){
        println "getProperty() called with argument $name"
        if (metaClass.hasProperty(this, name)){
            return metaClass.getProperty(this, name)
        } else {
            println "Let's do something fun with this property"
            return "Party time..."
        }
    }
}

def pd = new PropertyTest()
println pd.prop1
println pd.prop2
println pd.prop3
println pd.prop4

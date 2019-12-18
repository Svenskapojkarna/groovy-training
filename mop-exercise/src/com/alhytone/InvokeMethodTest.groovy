package com.alhytone

class InvokeMethodTester {
    def invokeMethod(String name, Object args){
        "called invokeMethod $name $args"
    }

    def test(){
        "Method exists!"
    }
}

def invokeMethod = new InvokeMethodTester()
assert invokeMethod.test() == "Method exists!"
assert invokeMethod.someMethod() == "called invokeMethod someMethod []"

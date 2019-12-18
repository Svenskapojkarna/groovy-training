package com.alhytone

class POGO{
    String property

    void setProperty(String name, Object value){
        this.@"$name" = 'Overridden'
    }
}

def pogo = new POGO()
pogo.property = 'a'
assert pogo.property == 'Overridden'

import groovy.transform.ToString
import groovy.transform.Sortable

@ToString
@Sortable
class Person {
    String first
    String last
}

def p1 = new Person(first:'peep', last:'boop')
def p2 = new Person(first:'foo', last:'bar')
def people = [p1, p2]
println people

def sorted = people.sort(false)
println sorted

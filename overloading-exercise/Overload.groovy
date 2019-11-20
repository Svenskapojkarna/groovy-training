import groovy.transform.ToString

@ToString
class Account{
    BigDecimal balance = 0.0
    String type

    BigDecimal deposit(BigDecimal amount){
        balance += amount
    }

    BigDecimal withdraw(BigDecimal amount){
        balance -= amount
    }

    BigDecimal plus(Account other){
        this.balance + other.balance
    }
}

Account checking = new Account(type: "checking")
checking.deposit(100.00)

Account savings = new Account(type: "savings")
savings.deposit(50.00)

println checking
println savings

BigDecimal total = checking + savings
println total

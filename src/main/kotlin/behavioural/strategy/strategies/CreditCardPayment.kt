package behavioural.strategy.strategies

class CreditCardPayment: PayStrategy {
    override fun pay(amount: Double) {
        println("payment of $amount done by credit card")
    }
}
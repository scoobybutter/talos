package behavioural.strategy.strategies

class PaypalPayment: PayStrategy {
    override fun pay(amount: Double) {
        println("payment of $amount done by paypal")
    }
}
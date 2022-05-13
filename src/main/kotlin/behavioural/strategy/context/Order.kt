package behavioural.strategy.context

import behavioural.strategy.strategies.PayStrategy

class Order {
    private lateinit var payStrategy: PayStrategy

    fun setPayStrategy(payStrategy: PayStrategy) {
        this.payStrategy = payStrategy
    }

    fun processOrderPayment(amount: Double) {
        payStrategy.pay(amount)
    }
}
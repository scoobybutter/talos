package behavioural.strategy

import behavioural.strategy.context.Order
import behavioural.strategy.strategies.PaypalPayment

fun main() {
    val order = Order()
    order.setPayStrategy(PaypalPayment())
    order.processOrderPayment(100.0)
}
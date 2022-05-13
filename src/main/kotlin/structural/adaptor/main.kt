package structural.adaptor

import structural.adaptor.adaptee.Ferrari
import structural.adaptor.adapter.MetricSpeed
import structural.adaptor.adapter.MetricSpeedAdapter

fun main() {
    val target: MetricSpeed = MetricSpeedAdapter(Ferrari())
    println(target.getSpeed())
}
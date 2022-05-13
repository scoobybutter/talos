package structural.adaptor.adapter

import structural.adaptor.adaptee.ImperialSpeed

class MetricSpeedAdapter(imperialSpeedCar: ImperialSpeed) : MetricSpeed {
    private val imperialSpeedCar: ImperialSpeed

    init {
        this.imperialSpeedCar = imperialSpeedCar
    }

    override fun getSpeed(): Double {
        return imperialSpeedCar.getSpeed() * 1.60934;
    }
}
package structural.proxy

import structural.proxy.library.ThirdPartyYTClass
import structural.proxy.library.ThirdPartyYTLib
import structural.proxy.proxy.YTCacheProxy

fun test(thirdPartyYTLib: ThirdPartyYTLib): Long {
    val startTime = System.currentTimeMillis()
    thirdPartyYTLib.getPopularVideos()
    thirdPartyYTLib.getPopularVideos()
    thirdPartyYTLib.getPopularVideos()
    return System.currentTimeMillis() - startTime
}

fun main() {
    val thirdParty = ThirdPartyYTClass()
    val proxy = YTCacheProxy(thirdParty)
    println("third party took ${test(thirdParty)} seconds")
    println("proxy took ${test(proxy)} seconds")
}
package structural.proxy.library

class ThirdPartyYTClass: ThirdPartyYTLib {
    override fun getPopularVideos(): Map<String, String> {
        Thread.sleep(1000)
        return mapOf("test" to "test", "test2" to "test2")
    }
}
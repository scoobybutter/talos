package structural.proxy.proxy

import structural.proxy.library.ThirdPartyYTLib

class YTCacheProxy(thirdPartyYTLib: ThirdPartyYTLib) : ThirdPartyYTLib {
    private var cachedPopularVideos = mapOf<String, String>()
    private val thirdPartyService: ThirdPartyYTLib

    init {
        this.thirdPartyService = thirdPartyYTLib
    }

    override fun getPopularVideos(): Map<String, String> {
        if (cachedPopularVideos.isEmpty()) {
            cachedPopularVideos = thirdPartyService.getPopularVideos()
        }
        return cachedPopularVideos
    }
}
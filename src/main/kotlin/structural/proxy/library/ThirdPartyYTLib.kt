package structural.proxy.library

interface ThirdPartyYTLib {
    fun getPopularVideos(): Map<String, String>
}
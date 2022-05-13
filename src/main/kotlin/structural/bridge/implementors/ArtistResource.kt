package structural.bridge.implementors

class ArtistResource(artist: Artist) : Resource {
    private val artist: Artist

    init {
        this.artist = artist
    }

    override fun getSnippet(): String {
        return artist.name
    }
}
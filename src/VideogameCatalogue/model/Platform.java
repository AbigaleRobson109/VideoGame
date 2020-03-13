package VideogameCatalogue.model;

public enum Platform {
    NES("Nintendo Entertainment System", "Nintendo"),
    FAMICOM("Family Computer", "Nintendo"),
    SFAMICOM("Super Family Computer", "Nintendo"),
    SNES("Super Nintendo Entertainment System", "Nintendo"),
    WII("Wii", "Nintendo"),
    WIIU("Wii U", "Nintendo"),
    SWITCH("Switch", "Nintendo"),
    N64("Nintendo 64", "Nintendo"),
    GC("GameCube", "Nintendo"),
    GB("Gameboy", "Nintendo"),
    GBC("Gameboy Color", "Nintendo"),
    NDS("Nintendo DS", "Nintendo"),
    DSI("Nintendo DSi", "Nintendo"),
    VB("Virtualboy", "Nintendo"),
    GBA("Gameboy Advance", "Nintendo"),
    GB3DS("Nintendo 3DS", "Nintendo"),
    MASTERSYSTEM("Master System", "Sega"),
    GENESIS("Genesis", "Sega"),
    GAMEGEAR("GameGear", "Sega"),
    DREAMCAST("Dreamcast", "Sega"),
    SATURN("Saturn", "Sega"),
    PS1("PlayStation", "Sony"),
    PS2("PlayStation 2", "Sony"),
    PS3("PlayStation 3", "Sony"),
    PS4("PlayStation 4", "Sony"),
    PS5("PlayStation 5", "Sony"),
    PSP("PlayStation Portable", "Sony"),
    VITA("PlayStation Vita", "Sony"),
    XBOX("Xbox", "Xbox"),
    X360("Xbox 360", "Xbox"),
    XONE("Xbox One", "Xbox"),
    GOG("GOG", "PC"),
    STEAM("Steam", "PC"),
    EGS("Epic Games Store", "PC"),
    MS("Microsoft Store", "PC"),
    PCOTHER("PC Boxed Copy", "PC"),
    BATTLENET("Battle.net", "PC"),
    ROCKSTAR("Rockstar", "PC"),
    UPLAY("Ubisoft UPlay", "PC"),
    BETHNET("Bethesda.net", "PC"),
    EA("EA Origin", "PC"),
    STADIA("Google Stadia", "PC"),
    IOS("Apple iOS", "Mobile"),
    ANDROID("Android", "Mobile"),
    A2600("Atari 2600", "Atari"),
    A5200("Atari 5200", "Atari"),
    A7800("Atari 7800", "Atari"),
    LYNX("Atari Lynx", "Atari"),
    JAG("Atari Jaguar", "Atari"),
    C64("Commodore 64", "Commodore"),
    C128("Commodore 128", "Commodore"),
    ARCADE("Arcade Cabinet", "Arcade"),
    MVO("Magnavox Odyssey", "MISC"),
    CDI("Philips CD-i", "MISC"),
    NEOGEO("Neo Geo", "MISC"),
    TGFX("TurboGrafx-16", "MISC"),
    THREEDO("3DO", "MISC"),
    PLAYDIA("Playdia", "MISC"),
    NGAGE("Nokia N-Gage", "MISC"),
    INTELLIVISION("Intellivision", "MISC"),
    VECTREX("Vectrex", "MISC"),
    COLECO("ColecoVision", "MISC");

    private String longName;
    private String category;

    /**
     *
     * @param longName
     * @param category
     */
    private Platform(String longName, String category) {
        // TODO - implement Platform.Platform
        throw new UnsupportedOperationException();
    }

    public String getCategory() {
        return this.category;
    }

    public String getLongName() {
        return this.longName;
    }

    public String toString() {
        // TODO - implement Platform.toString
        throw new UnsupportedOperationException();
    }

}

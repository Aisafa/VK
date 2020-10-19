package attachment;

public class Document {
    private int id;
    private int owner_id;
    private String title;
    private int size;
    private String ext;
    private String url;
    private int date;
    private int type;

    class Photo_Preview {
        private PhotoInfo.Size[] size;
    }

    class Graffiti_Preview {
        private String src;
        private int width;
        private int height;
    }

    class Audio_message{
        private int duration;
        private Integer waveform[];
        private String link_ogg;
        private String link_mp3;
    }
}

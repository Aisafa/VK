package attachment;

public class Product {
    private int id;
    private int owner_id;
    private String title;
    private String description;
    private int weight;
    private String thumb_photo;
    private int date;
    private int availability;
    private boolean is_favorite;
    private String sku;


    class Price {
        private String amount;
        private int id;
        private String name;
        private String old_amount;
        private String text;
        private int id_price;
        private String name_price;
    }

    class Dimensions {
        private int width;
        private int height;
        private int length;
    }

    class Category {
        private int id;
        private String name;
        private int id_selection;
        private String name_selection;
    }
}

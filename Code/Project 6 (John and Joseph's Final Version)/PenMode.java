public enum PenMode {
    CLASSIC ("Classic"),
    INTENDED ("Intended");

    private String text;

    PenMode(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
}

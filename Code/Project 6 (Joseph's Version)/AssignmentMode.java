public enum AssignmentMode {
    CLASSIC ("Classic"),
    INTENDED ("Intended");

    private String text;

    AssignmentMode(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
}

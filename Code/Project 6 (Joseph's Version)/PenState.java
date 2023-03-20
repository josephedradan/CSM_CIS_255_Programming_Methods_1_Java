public enum PenState {
    DRAW ("Drawing"),
    ERASE ("Erasing"),
    OFF ("Off");

    private String text;

    PenState(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }

}
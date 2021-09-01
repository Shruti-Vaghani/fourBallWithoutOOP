import processing.core.PApplet;

public class Four_Ball_Processing_Without_OOP extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 550;
    public static final int DIAMETER = 10;
    int speedBallOne = 0,speedBallTwo = 0,speedBallThree = 0, speedBallFour = 0;


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

    }

    @Override
    public void draw() {

        ellipse(speedBallOne, HEIGHT/5, DIAMETER,DIAMETER);
        speedBallOne++;
        ellipse(speedBallTwo,(HEIGHT*2)/5, DIAMETER,DIAMETER);
        speedBallTwo += 2;
        ellipse(speedBallThree,(HEIGHT*3)/5,DIAMETER,DIAMETER);
        speedBallThree +=3;
        ellipse(speedBallFour,(HEIGHT*4)/5,DIAMETER,DIAMETER);
        speedBallFour += 4;

    }

    public static void main(String[] args) {
        PApplet.main("Four_Ball_Processing_Without_OOP",args);

    }
}

package sk.danio;


public class Player {

    //FIELDS
    
    private int x;
    private int y;
    private int r;
    
    private int dx;
    private int dy;
    private int speed;
    
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;
    
    private int lives;
    
    //CONSTRUCTOR
    public Player(){
        x = GamePanel.WIDTH/2;
        y = GamePanel.HEIGHT/2;
        r = 5;
        
        dx = 0;
        dy = 0;
        speed = 5;
        
        lives = 3;
    }
    
}

package sk.danio;


public class Player {

    //FIELDS
    
    private final int x;
    private final int y;
    private final int r;
    
    private final int dx;
    private final int dy;
    private final int speed;
    
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;
    
    private final int lives;
    
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

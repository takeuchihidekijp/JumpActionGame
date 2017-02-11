package jp.techacademy.hideki.takeuchi.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by OWNER on 2017/02/05.
 */

public class GameObject extends Sprite {
    public final Vector2 velocity; // x方向、y方向の速度を保持する

    public GameObject(Texture texture, int srcX, int srcY, int srcWeight, int srcHeight){
        super(texture, srcX, srcY, srcWeight, srcHeight);

        velocity = new Vector2();

    }
}

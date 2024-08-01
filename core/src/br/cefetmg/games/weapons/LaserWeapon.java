package br.cefetmg.games.weapons;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class LaserWeapon implements Weapon {
    private final Vector2 originRight;
    private final Vector2 originLeft;
    private final ShotFactory shotFactory;

    public LaserWeapon(Vector2 originLeft, Vector2 originRight, ShotFactory shotFactory) {
        this.originLeft = originLeft;
        this.originRight = originRight;
        this.shotFactory = shotFactory;
    }

    @Override
    public Array<Shot> createShot(Vector2 position) {
        return new Array<Shot>(new Shot[]{
            shotFactory.createShot(new Vector2(originLeft).add(position)),
            shotFactory.createShot(new Vector2(originRight).add(position))
        });
    }

    @Override
    public long getCadenceInMillis() {
        return 200;
    }
}

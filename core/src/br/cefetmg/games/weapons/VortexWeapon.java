package br.cefetmg.games.weapons;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class VortexWeapon implements Weapon {
    private final Vector2 origin;
    private final ShotFactory shotFactory;

    public VortexWeapon(Vector2 origin, ShotFactory shotFactory) {
        this.origin = origin;
        this.shotFactory = shotFactory;
    }

    @Override
    public Array<Shot> createShot(Vector2 position) {
        return new Array<Shot>(new Shot[]{
            shotFactory.createShot(new Vector2(origin).add(position))
        });
    }

    @Override
    public long getCadenceInMillis() {
        return 600;
    }
}

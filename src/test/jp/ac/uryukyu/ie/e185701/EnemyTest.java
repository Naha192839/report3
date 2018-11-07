package jp.ac.uryukyu.ie.e185701;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void attack() {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.dead = true;
        for (int i = 0; i < 10; i++) {
            if (hero.hitPoint > 0) {
                hero.wounded(0);
            } else {
                enemy.attack(hero);//乱数で0ダメージとなることもあるため、複数回実行してみる。

            }
        }
        assertEquals(heroHP, hero.hitPoint);
    }
}
package myTest;

import java.awt.event.KeyEvent;

//같은 패키지에 Move.java

public class Move {
 private boolean left, right, up, down;
 private int moveAmount = 5;

 public void keyPressed(int keyCode) {
     switch(keyCode) {
         case KeyEvent.VK_LEFT: left = true; break;
         case KeyEvent.VK_RIGHT: right = true; break;
         case KeyEvent.VK_UP: up = true; break;
         case KeyEvent.VK_DOWN: down = true; break;
     }
 }

 public void keyReleased(int keyCode) {
     switch(keyCode) {
         case KeyEvent.VK_LEFT: left = false; break;
         case KeyEvent.VK_RIGHT: right = false; break;
         case KeyEvent.VK_UP: up = false; break;
         case KeyEvent.VK_DOWN: down = false; break;
     }
 }

 // unitX, unitY를 받아 이동 후 새 좌표를 반환 (int[] {newX, newY})
 public int[] updatePosition(int unitX, int unitY, int panelWidth, int panelHeight) {
     if(left) unitX -= moveAmount;
     if(right) unitX += moveAmount;
     if(up) unitY -= moveAmount;
     if(down) unitY += moveAmount;

     if(unitX < 0) unitX = 0;
     if(unitX > panelWidth) unitX = panelWidth;
     if(unitY < 0) unitY = 0;
     if(unitY > panelHeight) unitY = panelHeight;

     return new int[] {unitX, unitY};
 }
}

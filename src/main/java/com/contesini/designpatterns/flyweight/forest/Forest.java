package com.contesini.designpatterns.flyweight.forest;

import com.contesini.designpatterns.flyweight.trees.Tree;
import com.contesini.designpatterns.flyweight.trees.TreeFactory;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Forest extends JFrame {

  private List<Tree> trees = new ArrayList<>();

  public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
    var type = TreeFactory.getTreeType(name, color, otherTreeData);
    var tree = new Tree(x, y, type);
    trees.add(tree);
  }

  @Override
  public void paint(Graphics graphics) {
    for (Tree tree : trees) {
      tree.draw(graphics);
    }
  }
}

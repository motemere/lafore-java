package me.motemere.code.app;

import me.motemere.code.utils.Writer;

public class App {

  public static void main(String[] args) {
    Writer writer = new Writer() {
    };

    writer.writeLine(String.format("Hello, World from '%s' and special thx for Robert W. Lafore.",
        App.class));
  }
}
